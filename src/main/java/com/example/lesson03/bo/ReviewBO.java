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
	
	// Insert
	// input: Review 객체(하나의 행을 insert 해달라)
	// output: int(insert가 성공된 행 수) => Mybatis가 알고있음
	public int addReview(Review review) { // BO가 컨트롤러한테 안줄수도 있음
		return reviewDAO.insertReview(review);
	}
	
	// addReviewAsField(4, "콤비네이션R", "신비", 5.0, "역시 JMT")
	public int addReviewAsField(int storeId, String menu, String userName, Double point, String review) { // 필드명하고 일치하게 짓기
		return reviewDAO.insertReviewAsField(storeId, menu, userName, point, review); // 자동완성 믿지말기. 순서가 다를수도 있음
	}
	
	// Update
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}
	
	// Delete
	public void deleteReviewById(int id) {
		reviewDAO.deleteReviewById(id);
	}
}
