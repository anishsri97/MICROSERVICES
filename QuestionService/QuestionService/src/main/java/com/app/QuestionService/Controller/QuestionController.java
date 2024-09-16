package com.app.QuestionService.Controller;


import com.app.QuestionService.Entity.Question;
import com.app.QuestionService.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {



    private final QuestionService questionService;



    @PostMapping("/create")
    public Question createQuestion(@RequestBody Question question){
         return questionService.createQuestion(question);
    }


    @GetMapping("/getQuestion")
    public Question getQuestion(@RequestParam Long id){
        return questionService.getQuestion(id);
    }

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/quiz")
    public List<Question> getQuestions(@RequestParam String id){
        return questionService.getQuestionOfQuiz(id);
    }



}
