package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsDAO;
import com.example.lesson02.model.UsedGoods;

@Service // 로직이 들어있겠구나. 서비스(스프링)빈? 없으면 자바빈
public class UsedGoodsBO {
	
	@Autowired // spring bean을 주입 받음(Dependency Injection) spring bean을 new를 하지않고 가져온다. DAO는 스프링빈이여서 new를 할 수 없음
	private UsedGoodsDAO usedGoodsDAO;

	// input: X (컨트롤러가 넘겨주는게 없음)
	// output: List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}
}
