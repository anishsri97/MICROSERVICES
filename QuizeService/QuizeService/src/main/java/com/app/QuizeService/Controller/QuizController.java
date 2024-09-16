package com.app.QuizeService.Controller;


import com.app.QuizeService.Entity.Quiz;
import com.app.QuizeService.Service.QuizService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
@Slf4j
public class QuizController {

    private final QuizService quizService;



    //create
    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.create(quiz);
    }


    //get

    @GetMapping("/getQuiz")
    public  Quiz getQuiz(@RequestParam Long id){
        return quizService.getQuiz(id);
    }


    //getAll
    @GetMapping("/allQuiz")
    public List<Quiz> getAll(){
        log.info(" Inside the /allQuiz ");
        return quizService.getAllQuiz();
    }



}
