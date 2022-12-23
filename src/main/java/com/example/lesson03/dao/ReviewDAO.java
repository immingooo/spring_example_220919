package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(int id); // BO거 복붙해서 수정해서 쓰기. 한 개면 @Param("") 이거 생략가능
}
