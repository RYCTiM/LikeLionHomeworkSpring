package springtask.homework_spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeworkController {
    @RequestMapping("localhost:8080")
    public String home(){
        return "homework.html";
    }
}
