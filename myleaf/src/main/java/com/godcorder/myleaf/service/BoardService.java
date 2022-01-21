package com.godcorder.myleaf.service;


import com.godcorder.myleaf.model.Board;
import com.godcorder.myleaf.model.Users;
import com.godcorder.myleaf.repository.AccountRepository;
import com.godcorder.myleaf.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private AccountRepository accountRepository;

    public Board save(String username, Board board) {

      Users user =  accountRepository.findByUsername(username);
      board.setUser(user);
        return boardRepository.save(board);
    }
}
