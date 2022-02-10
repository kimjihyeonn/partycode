package com.simple.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;


public interface ScoreService {
	
	
	
	
	 ///서비스가 사용할 메서드를 추상메소드로 구현
	public void regist(ScoreVO vo);
	public ArrayList<ScoreVO>  getList();
	public void delete(int num);

}
