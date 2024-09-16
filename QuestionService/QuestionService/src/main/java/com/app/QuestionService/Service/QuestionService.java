package com.app.QuestionService.Service;


import com.app.QuestionService.Entity.Question;

import com.app.QuestionService.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {


    private final QuestionRepository questionRepository;


    //create
    public Question createQuestion(Question question) {

        return questionRepository.save(question);


    }


    //get
    public  Question getQuestion(Long id){
       return questionRepository.findById(id).orElseThrow();
    }


    //getAll
    public List<Question> getAllQuestion(){
        return questionRepository.findAll();
    }

    //findByQuestionBasedOnid

    public List<Question> getQuestionOfQuiz(String id){
        return questionRepository.findByQuizId(id);
    }


}
