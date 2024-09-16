package com.app.QuizeService.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table
@Entity
@Data
public class Quiz {

    @Id
    private Long id;
    private String quizTitle;

    private transient List<Question> questionList;
}
