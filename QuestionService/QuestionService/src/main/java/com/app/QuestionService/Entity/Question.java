package com.app.QuestionService.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {


    @Id
    private Long id;

    private String quizId;

    private String question;
}
