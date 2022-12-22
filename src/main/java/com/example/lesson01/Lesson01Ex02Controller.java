package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // jsp를 뿌릴때에는 @RestController 아님에 주의. @ResponseBody가 없어야 함!!!
public class Lesson01Ex02Controller {

	// http://localhost/lesson01/ex02/1
	@RequestMapping("/lesson01/ex02/1")
	public String ex02() { // jsp로 리턴을 할땐 무조건 String이다.
		// ResponseBody가 아닌 상태로 String을 리턴하면
		// ViewResolver에 의해, 리턴된 String 이름의 view 경로를 찾고 화면이 구성된다.
		
		//        /WEB-INF/jsp/             .jsp  -> properties에 들어있음
		//return "/WEB-INF/jsp/lesson01/ex02.jsp";
		return "lesson01/ex02"; //Response view의 경로
	}
}
