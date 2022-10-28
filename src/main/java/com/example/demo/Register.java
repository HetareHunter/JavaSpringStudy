package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {

	@RequestMapping("/") // "/"でリクエストが来たときはinput.htmlを開くようにしている
	public String start() {
		return "input.html";
	}
	
	@RequestMapping("/register")
	// RegisterBeanのrbを受け取るタイミングで@ModelAttributeでリクエストパラメータの割り当てをしてくれる。
	// つまりホーム画面の情報(input.html)RegisterBeanのrbに代入される
	public ModelAndView register(@ModelAttribute RegisterBean rb,ModelAndView m) {
		m.addObject("rb",rb);
		m.setViewName("register.html");
		return m;
	}
}
