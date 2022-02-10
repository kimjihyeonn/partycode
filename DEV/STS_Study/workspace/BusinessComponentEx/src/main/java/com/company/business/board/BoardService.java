package com.company.business.board;

import java.util.List;

public interface BoardService {
   //추상메소드 => board(게시판) 테이블에서 이루어지는 기능들
	//게시글 등록
	void insertBoard(BoardDO boardDO);
	//수정기능
	void updateBoard(BoardDO boardDO);
	
	//삭제기능
	void deleteBoard(BoardDO boardDO);
	//전체 게시글 목록 조회(select)
	List<BoardDO> getBoardList(BoardDO boardDO);
	
	//게시글 상세보기(게시글번호 조건에 마즌거만 select)
	BoardDO getBoard(BoardDO boardDO);
	
	
}
