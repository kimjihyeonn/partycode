package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	//멤버변수
	
	//1. sevlet-context.xml로 가서
//	private ScoreService scoreService= new ScoreServiceImpl();
	
	//2.방법 @Service
//	@Autowired
//	private ScoreService scoreService;
	
	//3.
	@Autowired
	@Qualifier("scoreService") //이름으로 강제연결
	//@Service("scoreService")랑 연결
	private ScoreService scoreService;

	   @RequestMapping("/scoreList")
	   public String scoreList(Model model) {
		   
		  ArrayList<ScoreVO> list= scoreService.getList();
		  
		  model.addAttribute("list",list);
		   
		   return "service/scoreList";
	   }
	   @RequestMapping("/scoreRegist")
	   public String scoreRegist() {
		   
		  
		   
		   return "service/scoreRegist";
		   
		   
	   }
	   @RequestMapping("/scoreResult")
	   public String scoreResult() {
		   
		   return "service/scoreResult";
		   
	   }
	   
	   //등록요청
	   @RequestMapping("/registForm")
	   public  String registForm(ScoreVO vo) {
		   
		   System.out.println(vo.toString());
		   
	
		   
		   scoreService.regist(vo);
		  
		   
		   return "redirect:/service/scoreResult";
	   }
	   //삭제요청(화면에서 필요한 값을 넘긴다.)
	   @RequestMapping("/scoreDelete")
	   public String scoreDelete(@RequestParam("num") int num) {
		   
		   scoreService.delete(num);
		   
		   
		   return "redirect:/service/scoreList";
	   }
	   
}
