package pl.keruzam.cashflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

	@GetMapping("login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("user")
	public String getUserPage() {
		return "user";
	}

}
