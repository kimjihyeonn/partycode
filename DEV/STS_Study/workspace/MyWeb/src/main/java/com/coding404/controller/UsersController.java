package com.coding404.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.command.UsersVO;
import com.coding404.users.service.UsersService;

@Controller
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	@Qualifier("userService")
	private UsersService userService;
	
	@RequestMapping("/userJoin")
	public void userJoin() {
		
	}
	
	@RequestMapping("/userLogin")
	public void userLogin() {
		
	}
	@RequestMapping("userMypage")
	public void userMypage() {
		
	}
	
	//일반적인 방식이 아님 pom.xml에 jackson-databind추가
	//@RequestBody -> 비동기로 넘어오는 data를 vo에 맵핑할 때 사용
	//@ResponseBody -> 호출한 곳으로 데이터를 반환 하겠다.
	//찜목록, 장바구니에 사용
	@ResponseBody
	@RequestMapping("/idCheck")
	public String idCheck(@RequestBody UsersVO vo) {
		
		System.out.println(vo.toString());
		return "hello";
	}
	
	@RequestMapping("/userCheck")
	public String userCheck(@RequestParam("id") String id,@RequestParam("pw") 
	String pw,RedirectAttributes RA,Model model) {
	
		
     UsersVO vo= userService.getIdPw(id, pw);
		
       if((vo.getId().equals(id))&&(vo.getPw().equals(pw))) {
    	   
    	   model.addAttribute("userVO",vo);
    	   model.addAttribute("msg", vo.getName()+"님 로그인에 성공하셨습니다");
    	   
    	   return "user/userMypage";
    	   
       }else {
    	   
    	   RA.addFlashAttribute("msg","로그인에 실패하였습니다.");
    	   
    	   return"redirect:/user/userLogin";
       }
        	
        
        
    
	
		
	}

}
