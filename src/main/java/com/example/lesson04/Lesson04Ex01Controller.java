package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
//  또 다른 BO를 사용하고 싶을 때 어노테이션을 또 적어줘야 한다.
//	@Autowired
//	private UserBO 다른BO;

	// 회원가입 화면
	// http://localhost/lesson04/ex01/add_user_view
	@RequestMapping(path="/add_user_view", method=RequestMethod.GET) // path는 생략가능. GET방식이여야 주소를 치고 들어갈 수 있다.
	public String addUserView() {
		// /WEB-INF/jsp/(lesson04/addUser).jsp
		return "lesson04/addUser";
	}
	
	@PostMapping("/add_user") // post여서 직접 주소로 못들어감
	public String addUser( // 필수 인지 아닌지는 DB에 나와있는 걸로 해주기
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="introduce", required=false) String introduce) {
		
		// DB insert (먼저 RequestParam이 들어왔는지 디버깅으로 확인해야함)
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		return "lesson04/afterAddUser"; // 결과 jsp. 여기에 브레이크포인터로 값들이 들어왔나 확인하기
	}
	
	// http://localhost/lesson04/ex01/get_last_user_view
	@GetMapping("/get_last_user_view")
	public String getLastUserView() {
		// DB select
		
		
		return "lesson04/getLastUser"; // 먼저 화면이 나오는지 확인해야 함
	}
}
