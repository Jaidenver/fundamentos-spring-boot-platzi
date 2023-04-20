package com.fundamentosplatzi.springboot.fundamentos.caseuse;

import com.fundamentosplatzi.springboot.fundamentos.entity.User;
import com.fundamentosplatzi.springboot.fundamentos.service.UserService;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface GetUser {
    List<User> getAll();
}
