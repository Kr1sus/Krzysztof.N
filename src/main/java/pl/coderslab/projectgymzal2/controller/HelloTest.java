package pl.coderslab.projectgymzal2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloTest {

    @GetMapping("/hello")
    public String get(){
        return "hello.jsp";
    }
}
