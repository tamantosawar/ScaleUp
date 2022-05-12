package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Product;
import com.example.model.merchant;
import com.example.repo.merchantRepository;

@Controller
public class MainController {
	@Autowired
	private merchantRepository merchantrepo;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("merchant", new merchant());
		return "signup";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";
	}

	@RequestMapping(value = "/onsignup" )
	public String onsignup(@ModelAttribute("merchant") merchant merchant, Model model) {
		/*
		 * if (merchantrepo.existsByEmail(merchant.getEmail())) { return "/signup"; }
		 */
		this.merchantrepo.save(merchant);
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/onlogin")
	public String doLogin(@ModelAttribute("merchant") merchant merchant, Model model) {

		if (merchantrepo.existsByEmailAndPassword(merchant.getEmail(), merchant.getPassword())) {
			model.addAttribute("name", merchant.getEmail());
			return "redirect:/index";
			
		}
		return "redirect:/signup";
	}

	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
}