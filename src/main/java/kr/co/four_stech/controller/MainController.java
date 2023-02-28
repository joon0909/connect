package kr.co.four_stech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    @GetMapping("/api/hello")
    public String test(){
        return "hello test";
    }
    @GetMapping("/")
    public String main(Model model){
        return "main";
    }

}

