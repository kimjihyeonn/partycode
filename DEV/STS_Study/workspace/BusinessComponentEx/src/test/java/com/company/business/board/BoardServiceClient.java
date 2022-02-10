package com.company.business.board;



import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
	  //1. ������ �����̳�
		
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardService = (BoardService)container.getBean("boardService");
		//2. �Խñ� ��� �׽�Ʈ
		BoardDO boardDO = new BoardDO();
		boardDO.setTitle("������������̼Ǳ�ݰ��� �߰�");
		boardDO.setWriter("����ȣ");
		boardDO.setContent("������̼� ���� �н�");
		
	
		boardService.insertBoard(boardDO);
		
		
		//3. �Խñ� ��ü ����� �ܼ�â��  �����ֱ� �׽�Ʈ
         List<BoardDO> boardList 
         = 	boardService.getBoardList(boardDO);	
         for(BoardDO board : boardList) {
        	 System.out.println("--->" + board.toString());
         }
		//4. ������ �����̳� ����
		container.close();
		
		
	}

}
