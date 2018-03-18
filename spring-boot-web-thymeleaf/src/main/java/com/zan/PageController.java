package com.zan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	

	@RequestMapping(value="/smisu",method=RequestMethod.GET)
	@ResponseBody
	public int la(@RequestParam("visina") String visina, @RequestParam("radij") int radij) {
		La la = new La();
		int v = Integer.parseInt(visina);
		
		return la.stevilo(v,radij);
	}

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

}