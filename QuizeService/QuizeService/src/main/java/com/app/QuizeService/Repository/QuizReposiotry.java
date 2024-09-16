package com.app.QuizeService.Repository;

import com.app.QuizeService.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizReposiotry extends JpaRepository<Quiz,Long> {
}
