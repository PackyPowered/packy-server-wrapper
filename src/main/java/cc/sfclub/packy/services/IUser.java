package cc.sfclub.packy.services;

import cc.sfclub.packy.models.LoginForm;
import cc.sfclub.packy.models.RegisterForm;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface IUser {
    @RequestLine("GET /user/{id}")
    List getUser(@Param("id") int id);

    //@RequestLine("POST /user/{id}")
    //List addUser();

    @RequestLine("POST /login")
    List login(LoginForm loginForm);

    @RequestLine("POST /register")
    List register(RegisterForm registerForm);

    @RequestLine("GET /verifyEmail/{id}")
    List verifyEmail(@Param("id") String id);
}
