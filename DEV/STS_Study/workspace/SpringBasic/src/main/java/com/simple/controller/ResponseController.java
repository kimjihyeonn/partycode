package com.simple.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	
	//ex01화면
	@RequestMapping("/res_ex01")
	public void res_ex01() {
		
		
		
	}

	@RequestMapping("/res_ex02")
	public String res_ex02(Model model,Date date) {
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		
		String now= sdf.format(date);
		String name= "홍길동";
		//데이터 저장(키,값)
		model.addAttribute("now",now);
	    model.addAttribute("name", name);
		
		return "response/res_ex02";
	}
	@RequestMapping("res_ex03")
	public ModelAndView res_ex03(ModelAndView mv) {
		
		
		
		mv.addObject("time", new Date());
		mv.addObject("name","이순신");
		mv.setViewName("response/res_ex03");
		return mv;
		
	}
	//ModelAttribute 어노테이션 = request+model
	@RequestMapping("res_ex04")
	
	public String res_ex04(@ModelAttribute("id") String id) {
		
		System.out.println("넘어온값" +id);
		
		return "response/res_ex04";
		
	}
	//ModelAttribute 로 VO객체 넘기기
	@RequestMapping("res_ex05")
	public String res_ex05(@ModelAttribute("info") ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "response/res_ex05";
	}
	@RequestMapping("res_login")
	public void res_login() {
		
		
	}
	@RequestMapping("res_login_ok")
	public void res_login_ok() {
		
		System.out.println("실행됨");
		
	}
	
	@RequestMapping(value="login" , method=RequestMethod.POST)
	public String login(ReqVO vo,
			              RedirectAttributes RA) {
		//아이디와 비밀번호가 같으면 로그인 성공
         if(vo.getId().equals(vo.getPw())){
        	 
        	 RA.addFlashAttribute("msg","환영합니다.");
        	 System.out.println("로그인성공");
        	 return "redirect:/response/res_login_ok";
        	 
         }
         else {
        	 return "response/res_login";
        	 
         }
		
		
	}
}
