package com.app.QuizeService.Service;


import com.app.QuizeService.Entity.Question;
import com.app.QuizeService.Entity.Quiz;
import com.app.QuizeService.Repository.QuizReposiotry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizReposiotry quizReposiotry;
    private final FeignClient questionClient;


    //create

    public Quiz create(Quiz quiz){
        return quizReposiotry.save(quiz);
    }


    public Quiz getQuiz(Long id){
     try {

         Quiz quiz = quizReposiotry.findById(id).get();
         quiz.setQuestionList(questionClient.getAllQuestion(String.valueOf(id)));
         return quiz;
     } catch (Exception exception){
         System.out.println(" Message "+exception.getMessage());
     }
      return null;

    }

    public List<Quiz> getAllQuiz() {
        return quizReposiotry.findAll().stream().map((quiz) -> {
            List<Question> list = questionClient.getAllQuestion(String.valueOf(quiz.getId()));
            quiz.setQuestionList(list);
            return quiz;
        }).collect(Collectors.toList());
    }
}
