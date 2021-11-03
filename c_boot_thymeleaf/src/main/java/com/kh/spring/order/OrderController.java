package com.kh.spring.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.spring.food.Food;

// 1. order-form.html(메뉴판)을 요청하는 url은 GET :/order/order-form이다
// 2. 음식의 가격은 피자 30000원, 햄버거 5000원, 회 : 20000원, 치킨: 18000원
// 3. receipt.html에서는 사용자가 선택한 메뉴의 이름과 가격, 결제금액이 출력되어야 한다.
@Controller
public class OrderController {

	@GetMapping("thymeleaf/order/order-form")
	public void makeReceipt(Model model, HttpSession session) {
		Food food = new Food();
		Map<String, Object> foodList = new LinkedHashMap();
		
		foodList.put("피자","30000");
		foodList.put("햄버거","5000");
		foodList.put("회","20000");
		foodList.put("치킨","18000");
		
		model.addAttribute("foodList", foodList);

	}
	
	@PostMapping("thymeleaf/order/receipt")
	public void aa() {
		
	}
	
}
