package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.QuizVO;


@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	
	@RequestMapping("/quiz01")	
	public void quiz01() {
		
	}

	@RequestMapping("/sendBirth")
	public String sendBirth(Model model,QuizVO vo) {
		
		model.addAttribute("year",vo.getYear());
		model.addAttribute("month", vo.getMonth());
		model.addAttribute("day", vo.getDay());
		
		System.out.println(vo.toString());
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public void quiz02() {
		
	
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("id") String id,
			          @ModelAttribute("pw") String pw,
			          @ModelAttribute("name") String name,
			          @ModelAttribute("email") String email) {
		
		
		return "quiz/quiz02_ok";
	}
	
	@RequestMapping("/res_quiz01")
	public String quiz03() {
	
		return "quiz/quiz03";
	}
	
	@RequestMapping(value="join2", method=RequestMethod.POST)
    public String join2(@ModelAttribute("id") String id,@ModelAttribute("pw") String pw,
    		@ModelAttribute("pw_check") String pw_check,RedirectAttributes RA,Model model) {
		
		if(id.equals("")) { 
			
			RA.addFlashAttribute("msg","아이디를입력하세요");
			
			return "redirect:/quiz/res_quiz01";
		}
		else if(!(pw.equals(pw_check))) {
			RA.addFlashAttribute("msg", "비밀번호를 확인하세요");
			
			return "redirect:/quiz/res_quiz01";
		}
		else {
			
			model.addAttribute("msg", "환영합니다.");
			return "quiz/quiz03_ok";
		}
		
	}
	
}
