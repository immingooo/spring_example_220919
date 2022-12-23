package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class Lesson03Ex01RestController {
	
	@Autowired
	private ReviewBO reviewBO;

	// http://localhost/lesson03/ex01?id=2
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			@RequestParam("id") int id // 필수 파라미터
			//@RequestParam(value="id") int id // 필수 파라미터로 정의함. 1번째 방법
			//@RequestParam(value="id", required=true) int id // 필수 파라미터로 정의하는 2번째 방법
			//@RequestParam(value="id", required=false) Integer id // 비필수 파라미터(null허용이라서 Integer로)
			//@RequestParam(value="id",  defaultValue="1") int id // 비필수 파라미터, null로 들어왔을 때 디폴트값 1로 해서 null일 수 없다. required=false, 생략가능
	) { // 한 행만 리턴
		
//		if (id == null) {
//			return null;
//		} else {
			return reviewBO.getReview(id);
//		}
	}
}
