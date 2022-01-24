package com.godcorder.myleaf.controller;



import java.util.List;

import com.godcorder.myleaf.model.Board;
import com.godcorder.myleaf.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

@RestController
@RequestMapping("/api")
class BoardApiController {

    @Autowired
    private BoardRepository repository;



    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/board")
    List<Board> all(@RequestParam(required = false, defaultValue = "") String title,
                    @RequestParam(required = false, defaultValue = "") String content) {
        if(StringUtils.isEmpty(title) && StringUtils.isEmpty(content) ){
            return repository.findAll();
        }else{

            return repository.findByTitleOrContent(title,content);

        }

    }
    // end::get-aggregate-root[]

    @PostMapping("/board")
    Board newBoard(@RequestBody Board newBoard) {
        return repository.save(newBoard);
    }

    // Single item

    @GetMapping("/board/{id}")
    Board one(@PathVariable Long id) {

        return repository.findById(id).orElse(null);

    }

    @PutMapping("/board/{id}")
    Board replaceBoard(@RequestBody Board newBoard, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setTitle(newBoard.getTitle());
                    employee.setContent(newBoard.getContent());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newBoard.setId(id);
                    return repository.save(newBoard);
                });
    }
    @Secured("ROLE_ADMIN")
    @DeleteMapping("/board/{id}")
    void deleteBoard(@PathVariable Long id) {


        repository.deleteById(id);
    }
}