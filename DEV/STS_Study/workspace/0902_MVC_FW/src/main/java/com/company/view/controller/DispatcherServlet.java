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
    //�߰�   
	
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
	//�������� �������̵� ��Ű�� i�� �Է��ϰ� ctrl space��
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
		//1.Ŭ���̾�Ʈ�� ��û path ���� ����
		String uri  =request.getRequestURI();
	
		String path = uri.substring(uri.lastIndexOf("/"));
		
		//2.HandlerMapping �� ���ؼ�  path�� �ش��ϴ� controller�� �˻��Ѵ�.
		Controller ctrl=handlerMapping.getController(path);
		//3.�˻��� Controller�� �����Ѵ�.
		String viewName = ctrl.handleRequest(request, response);
		//4. videResolver�� ���ؼ� viewName�� �ش��ϴ� �������� �������Ѵ�.
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
