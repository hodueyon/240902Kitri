package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.first.answer.AnswerService;
import com.example.first.question.QuestionService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Miss you hodo";
	}
	
	@GetMapping("/board")
	@ResponseBody
	public String board() {
		return "test";
	}
	
	@GetMapping("/")
	public String main() {
		return "index";
	}
	

}
