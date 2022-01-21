package com.godcorder.myleaf.controller;


import com.godcorder.myleaf.model.Board;
import com.godcorder.myleaf.repository.BoardRepository;
import com.godcorder.myleaf.service.BoardService;
import com.godcorder.myleaf.validator.BoardValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardService boardService;



    @Autowired
    private BoardValidator boardValidator;

    @GetMapping("list")
    public String list(Model model,@PageableDefault(size = 2) Pageable pageable,
                       @RequestParam(required = false,defaultValue = "") String searchText){
//Page<Board> board =boardRepository.findAll(pageable);



        Page<Board> board =boardRepository.findByTitleContainingOrContentContaining(searchText,searchText,pageable);
       int startpage = Math.max(1, board.getPageable().getPageNumber()-4);
       int endpage  = Math.min(board.getTotalPages(),board.getPageable().getPageNumber()+4);
        model.addAttribute("startpage",startpage);
        model.addAttribute("endpage", endpage);

        model.addAttribute("board", board);

        return "board/list";
    }

    @GetMapping("form")
    public String form(Model model, @RequestParam(required = false) Long id){

        if(id == null){
            model.addAttribute("board", new Board());

        }else{

            Board board = boardRepository.findById(id).orElse(null);
            model.addAttribute("board",board);
        }



        return "board/form";
    }
    @PostMapping("/form")
    public String submit(@Valid Board board, BindingResult bindingResult, Authentication authentication){
      boardValidator.validate(board,bindingResult);
        if(bindingResult.hasErrors()){
            return "board/form";
        }else{
           //Authentication a = SecurityContextHolder.getContext().getAuthentication();


            String username = authentication.getName();
          boardService.save(username,board);
        //boardRepository.save(board);
        return "redirect:/board/list";}
    }
}
