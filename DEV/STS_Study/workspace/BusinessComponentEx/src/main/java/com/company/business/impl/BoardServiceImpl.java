package com.company.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;

/*
 * BoardServiceImpl 클래스는 BoardService인터페이스를 구현받은 구현클래스
 */

/*
 *  비즈니스 로직을 처리하는 클래스 선언부 위에 @Service을 붙인다.
 */

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	//추가
	//스프링 컨테이너가 변수타입에 해당하는 객체를 메모리에서 찾아 의존성 주입을 시킨다.
	//그러므로 개발자가 객체 생성을 하지 않아도 스프링 컨테이너가 자동으로 해결해준다.
	@Autowired
	private BoardDAO boardDAO;  
	

	@Override
	public void insertBoard(BoardDO boardDO) {
		boardDAO.insertBoard(boardDO);
		
	}

	@Override
	public void updateBoard(BoardDO boardDO) {
		boardDAO.updateBoard(boardDO);
		
	}

	@Override
	public void deleteBoard(BoardDO boardDO) {
		boardDAO.deleteBoard(boardDO);
		
	}

	@Override
	public List<BoardDO> getBoardList(BoardDO boardDO) {
		
		
		return boardDAO.getBoardList(boardDO);
	}

	@Override
	public BoardDO getBoard(BoardDO boardDO) {
		
		return boardDAO.getBoard(boardDO);
	}

}
