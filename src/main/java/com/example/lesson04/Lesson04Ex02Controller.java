package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.model.Student;

@Controller
@RequestMapping("/lesson04/ex02")
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;

	// 학생 추가 화면
	// http://localhost/lesson04/ex02/add_student_view
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	@PostMapping("/add_student")
	public String addStudent( // 파라미터 값이 들어왔는지랑 응답값 이동하는 거 확인하기
			@ModelAttribute Student student // name(request Param)과 필드명이 일치하는 것이 담긴다.
			) { // @ModelAttribute 생략가능(여러개 객체를 받을 땐 붙여야 함)
		
		// DB Insert
		studentBO.addStudent(student);
		
		// DB select(방금 가입된 사람)
		
		// view(jsp) 페이지 응답값(이동)
		return "lesson04/afterAddStudent";
	}
}
