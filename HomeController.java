package com.codingdojo.hellohuman;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		session.setAttribute("count", 0);
		return "demo.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session ,Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("showCount", currentCount);
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			currentCount++;
			session.getAttribute("count");
			session.setAttribute("count", currentCount);
		}
		return "counter.jsp";
	}
	

}
