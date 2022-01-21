package com.godcorder.myleaf.service;


import com.godcorder.myleaf.model.Role;
import com.godcorder.myleaf.model.Users;
import com.godcorder.myleaf.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

   @Autowired
   private AccountRepository accountRepository;

   @Autowired
   private PasswordEncoder passwordEncoder;
   public Users save(Users user){

      String encodedPassword =  passwordEncoder.encode(user.getPassword());
      user.setPassword(encodedPassword);
      user.setEnabled(true);
      Role role = new Role();
      role.setId(1L);
      role.setName("roleuser");

      user.getRoles().add(role);

       return  accountRepository.save(user);
   }

}
