package com.simple.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request")
public class RequestController {
	
//	  @RequestMapping("/req_ex01")
//	  public String req_ex01() {
//		  
//		  
//		  
//		  return "request/req_ex01";
//	  }
	
	//2번째방법 -void형은 요청주소를 그대로 리졸버 뷰로 전달합니다.
	//둘다허용
	@RequestMapping("/req_ex01")
	public void req_ex01() {
		
	}
	//basic1요청- GET방식만 허용
//	@RequestMapping(value="/basic1", method = RequestMethod.GET)
//	public void basic() {
//		System.out.println("실행됨");
//	}
//	
//	//basic2요청 - > Post방식만 허용
//	@RequestMapping(value="/basic2", method = RequestMethod.POST)
//	public void basic2() {
//		System.out.println("post방식만처리");
//		
//	}
	
	//basic,basic2요청을 동시에
	@RequestMapping({"/basic1","/basic2"})
	public void basic() {
		
		System.out.println("basic1,basic2 요청");
		
	}
	
	
	//////////////////////////////요청 파라미터를 받는방법////////////////////////////////
	
	
	//ex02화면
     @RequestMapping("/req_ex02")
	public void req_ex02() {
		
	}
//    @RequestMapping("/param1") 
//    public String param1(HttpServletRequest request) {
//    	String id =request.getParameter("id");
//    	String pw = request.getParameter("pw");
//    	String name = request.getParameter("name");
//    	
//    	String[] inter=request.getParameterValues("inter");
//    	
//    	
//    	System.out.println(id);
//    	
//    	System.out.println(Arrays.deepToString(inter));
//    	
//    	return "request/req_result";
//    	
//    }
     
     
      //- RequestParam어노테이션은 기본적으로 필수값입니다.
//     @RequestMapping("/param1") 
//     
//     public String param1(@RequestParam("id") String id ,
//    		              @RequestParam("pw") String pw,
//    		              @RequestParam("name") String name,
//    		              @RequestParam(value="inter",required=false, defaultValue = "") ArrayList<String> list) {
//    	 
//    	 System.out.println(id);
//    	 System.out.println(pw);
//    	 System.out.println(name);
//    	 System.out.println(list.toString());
//     	
//     	
//     	return "request/req_result";
//     	
//     }
     
     //1.name== 멤버변수폼값 2.setter

     
       @RequestMapping("/param1")
       public String param1(ReqVO vo) {
    	   
    	   System.out.println(vo.toString());
    	   
    	   return "request/req_result";
       }
}
