package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/informationForm")
	public String loadInfo(Model model) {
		model.addAttribute("employee", new Employee());
		return "informationForm";
	}
	@PostMapping("/informationForm")
	public String loadConfirmationPage(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("employee", employee);
		return "confirmationPage";
	}

}
