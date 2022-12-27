package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(int id); // BO거 복붙해서 수정해서 쓰기. 한 개면 @Param("") 이거 생략가능
	
	public int insertReview(Review review); // 행의 갯수를 (Mybatis가 자동으로)int로 return. 넘겨주는 값이 하나면 굳이 @Param하지말기
	
	public int insertReviewAsField(
			// 하나의 맵으로 구성됨(@Param)
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName,
			@Param("point") Double point, 
			@Param("review") String review);
	
	public int updateReviewById( // 키값이 XML로 넘어감
			@Param("id") int id, 
			@Param("review") String review);
	
	public void deleteReviewById(int id);
}
