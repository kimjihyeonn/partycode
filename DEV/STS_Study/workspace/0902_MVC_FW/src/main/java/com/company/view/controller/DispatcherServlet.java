package com.company.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //추가   
	
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	//수동으로 오버라이드 시키기 i만 입력하고 ctrl space바
	@Override
	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
		
		
	}
    
    public DispatcherServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		process(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		process(request,response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//1.클라이언트의 요청 path 정보 추출
		String uri  =request.getRequestURI();
	
		String path = uri.substring(uri.lastIndexOf("/"));
		
		//2.HandlerMapping 을 통해서  path에 해당하는 controller를 검색한다.
		Controller ctrl=handlerMapping.getController(path);
		//3.검색된 Controller를 실행한다.
		String viewName = ctrl.handleRequest(request, response);
		//4. videResolver를 통해서 viewName에 해당하는 페이지로 포워딩한다.
		String view =null;
		
		if(viewName.contains(".do")) {
			 view=viewName;
		}
		else {
			view = viewResolver.getView(viewName);
		}
		response.sendRedirect(view);
	}

}
