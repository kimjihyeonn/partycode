package com.company.business.board;



import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
	  //1. 스프링 컨테이너
		
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		//2. 게시글 등록 테스트
		BoardDO boardDO = new BoardDO();
		boardDO.setTitle("스프링어노테이션기반개발 추가");
		boardDO.setWriter("박태호");
		boardDO.setContent("어노테이션 개념 학습");
		
	
		boardService.insertBoard(boardDO);
		
		
		//3. 게시글 전체 목록을 콘솔창에  보여주기 테스트
         List<BoardDO> boardList 
         = 	boardService.getBoardList(boardDO);	
         for(BoardDO board : boardList) {
        	 System.out.println("--->" + board.toString());
         }
		//4. 스프링 컨테이너 종료
		container.close();
		
		
	}

}
