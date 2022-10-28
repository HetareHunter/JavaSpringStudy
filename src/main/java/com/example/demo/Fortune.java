package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {

	@RequestMapping("/fortune")//Web上でリクエストが来た時にこれが呼び出されるようになる
	public String start() {
		double fn=Math.random();//0.0から1.0までの乱数
		if(fn>=0.7) {
			return "greatFortune.html";
		}
		else if(fn>=0.4) {
			return "middleFortune.html";
		}
		else if(fn>=0.1) {
			return "smallFortune.html";
		}
		else {
			return "misFortune.html";
		}
	}
}
