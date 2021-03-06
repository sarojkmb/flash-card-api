package com.example.service;

import java.util.List;

import com.example.model.Question;

public interface QuestionService {
	
	public Question getRandomQuestionService();
	
	public String getAnswerService(Long id);
	
	public List<Question> getAllQuestions();
	
	public Question getQuestionById(Long id);

}
