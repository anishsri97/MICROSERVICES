package com.app.QuizeService.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Question {

    @Id
    private Long id;

    private String quizId;

    private String question;
}
