package com.fundamentosplatzi.springboot.fundamentos.caseuse;

import com.fundamentosplatzi.springboot.fundamentos.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class DeleteUser {
    private UserService userService;

    public DeleteUser(UserService userService) {
        this.userService = userService;
    }


    public void remove(Long id) {
        userService.delete(id);
    }


}
