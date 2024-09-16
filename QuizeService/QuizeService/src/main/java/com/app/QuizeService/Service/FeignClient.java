package com.app.QuizeService.Service;


import com.app.QuizeService.Entity.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name="QUESTION-SERVICE")
public interface FeignClient {


    @GetMapping("/question/quiz")
     List<Question> getAllQuestion(@RequestParam String id);

}
