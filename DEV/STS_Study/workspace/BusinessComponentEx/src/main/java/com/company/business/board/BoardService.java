package com.company.business.board;

import java.util.List;

public interface BoardService {
   //�߻�޼ҵ� => board(�Խ���) ���̺��� �̷������ ��ɵ�
	//�Խñ� ���
	void insertBoard(BoardDO boardDO);
	//�������
	void updateBoard(BoardDO boardDO);
	
	//�������
	void deleteBoard(BoardDO boardDO);
	//��ü �Խñ� ��� ��ȸ(select)
	List<BoardDO> getBoardList(BoardDO boardDO);
	
	//�Խñ� �󼼺���(�Խñ۹�ȣ ���ǿ� ����Ÿ� select)
	BoardDO getBoard(BoardDO boardDO);
	
	
}
