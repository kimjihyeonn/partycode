package com.company.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;

/*
 * BoardServiceImpl Ŭ������ BoardService�������̽��� �������� ����Ŭ����
 */

/*
 *  ����Ͻ� ������ ó���ϴ� Ŭ���� ����� ���� @Service�� ���δ�.
 */

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	//�߰�
	//������ �����̳ʰ� ����Ÿ�Կ� �ش��ϴ� ��ü�� �޸𸮿��� ã�� ������ ������ ��Ų��.
	//�׷��Ƿ� �����ڰ� ��ü ������ ���� �ʾƵ� ������ �����̳ʰ� �ڵ����� �ذ����ش�.
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
