package com.example.TeamTest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Team3Controller {

    @GetMapping("/")
    public String main(){
        return "main";
    }
}
