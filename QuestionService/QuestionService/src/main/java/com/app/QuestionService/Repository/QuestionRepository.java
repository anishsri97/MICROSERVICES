package com.app.QuestionService.Repository;

import com.app.QuestionService.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {


    public List<Question> findByQuizId(String id);
}
