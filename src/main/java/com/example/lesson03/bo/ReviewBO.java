package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReview(int id) { // BO메소드 호출할 때 id를 필수로 보내야겠구나.(Integer은 null도 가능하구나) BO에 입장에서 null이 안들어가면 int / null허용은 Integer
		return reviewDAO.selectReview(id);
	}
}
