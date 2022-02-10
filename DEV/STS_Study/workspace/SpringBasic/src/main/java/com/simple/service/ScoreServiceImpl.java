package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.ScoreDAO;

//컴포넌트 스캔으로 일게 만들고 빈으로 생성
@Service("scoreService") //빈의 이름을 xxx로 생성
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	@Qualifier("aaa")
	private ScoreDAO scoreDAO;
	@Override
	public void regist(ScoreVO vo) {
	  scoreDAO.regist(vo);
		
	}
	@Override
	public ArrayList<ScoreVO> getList() {
		
//	ArrayList<ScoreVO> list=scoreDAO.getList();
		
		return scoreDAO.getList();
	}
	@Override
	public void delete(int num) {
		scoreDAO.delete(num);
		
	}
	

}
