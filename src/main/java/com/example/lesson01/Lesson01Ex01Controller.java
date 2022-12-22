package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller   // 스프링빈(Spring bean) 빈=객체. 스프링컨테이너에 스프링빈으로 등록된 애들이 들어가있다. 스프링빈이 있어야 Application에서 찾을 수 있다.
public class Lesson01Ex01Controller {

	// String 출력하기 - content type HTML
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody		// 리턴되는 값을 HTML Response body에 넣어 보내서 보여진다.
	@RequestMapping("/1") // 주소 매핑
	public String printString() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}
	
	// Map 출력하기
	// http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap() { // 옛날방식(많이 사용하지X)
		// {"aaaa"=1111, "bbbb"=1111...} java의 map
		Map<String, Object> map = new HashMap<>();
		map.put("aaaa", 1111);
		map.put("bbbb", 1111);
		map.put("cccc", 2222);
		map.put("dddd", 3333);
		
		// spring web starter 때문에 jackson이라는 라이브러리가 포함되어 있어 JSON으로 나타난다.
		return map; // map을 리턴하면 JSON으로 나타난다.
	}
}
