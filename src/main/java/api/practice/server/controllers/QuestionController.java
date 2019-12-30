package api.practice.server.controllers;

import api.practice.server.models.Question;
import api.practice.server.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/test")
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @PostMapping("/test")
    public Question createQuestion(@RequestBody Question question) {
        return questionRepository.save(question);
    }
}
