package com.coding404.freeboard.service;


import java.util.ArrayList;

import com.coding404.command.FreeBoardVO;
import com.coding404.util.Criteria;



public interface FreeBoardService {
	
	
	public boolean regist(FreeBoardVO vo); //등록
	
//	public ArrayList<FreeBoardVO> getList();
	public ArrayList<FreeBoardVO> getList(Criteria cri);
	
	public FreeBoardVO getContent(int bno);
	
	

	public boolean Update(FreeBoardVO vo);
	public void freeDelete(int bno);
	
	public int getTotal(Criteria cri);
	

}
