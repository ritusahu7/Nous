package com.irt.Iinvestmentrecommendation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irt.Iinvestmentrecommendation.model.ActionOnStockChanges;
import com.irt.Iinvestmentrecommendation.model.Age;
import com.irt.Iinvestmentrecommendation.model.AnualIncome;
import com.irt.Iinvestmentrecommendation.model.Concern;
import com.irt.Iinvestmentrecommendation.model.InvestorDetail;
import com.irt.Iinvestmentrecommendation.model.RiskProfile;
import com.irt.Iinvestmentrecommendation.model.SpendingMoneyInYears;
import com.irt.Iinvestmentrecommendation.model.WithdrawMoneyInYears;
import com.irt.Iinvestmentrecommendation.service.InvestorService;

@Controller
public class InvestorController {
	
	@Autowired
	private InvestorDetail investor;
	
	@Autowired
	RiskProfile riskProfile;
	
	@Autowired
	private InvestorService investorService;
	
	@GetMapping("/home")
	public String getUser(Model model) {
		investor = investorService.getInvestorDetail("John.doe@anymail.com");
		model.addAttribute("investor", investor);
		return "home";
	}
	
//	@GetMapping("/questionnaire")
//	public String getAge() {
//		return "questionnaire";
//	}
	
	@GetMapping("/questionnaire")
	public String getAge(@ModelAttribute ("age") Age age) {
		return "questionnaire";
	}
	@PostMapping("/questionnaire")
	public String age(@Valid @ModelAttribute ("age") Age age,BindingResult result) {
		

		if(result.hasErrors()) {
			System.out.println("There were errors");
			return "questionnaire";
		}


		System.out.println( "age is "+ age.getAge());
		//	Age age = new Age();
		//	age.setAge(values);
		
		investor.setAge(age);
		return "questionnaire";
	}
	
	@GetMapping("/second")
	public String income(@ModelAttribute ("anualIncome") AnualIncome anualIncome) {
		return "second";
	}
	
	@PostMapping("/second")
	public String income(@Valid @ModelAttribute ("anualIncome") AnualIncome anualIncome,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("There were errors");
			return "second";
		}
		System.out.println( "Anual Income is "+ anualIncome.getAnualIncome());
//		AnualIncome income = new AnualIncome();
//		income.setAnualIncome(values);
		investor.setAnulaIncome(anualIncome);
		return "second";
	}
	
	@GetMapping("/third")
	public String withdraw() {
		return "third";
	}
	
	@PostMapping("/third")
	public String withdraw(@RequestParam("option") String values) {
		System.out.println( "Withdrawing money in years "+ values);
		WithdrawMoneyInYears wmiy = new WithdrawMoneyInYears();
		wmiy.setWithdrawMoneyInYears(values);
		investor.setWithdrawMoneyInYears(wmiy);
		return "third";
	}
	
	@GetMapping("/fourth")
	public String spending() {
		return "fourth";
	}
	
	@PostMapping("/fourth")
	public String spending(@RequestParam("option") String values) {
		System.out.println( "Spending money in years is "+ values);
		SpendingMoneyInYears smiy = new SpendingMoneyInYears();
		smiy.setSpendInYears(values);
		investor.setSpendingMoneyInYears(smiy);
		return "fourth";
	}
	
	@GetMapping("/fifth")
	public String concern() {
		return "fifth";
	}
	
	@PostMapping("/fifth")
	public String concern(@RequestParam("option") String values) {
		System.out.println( "Concer is "+ values);
		Concern concern = new Concern();
		concern.setConcern(values);
		investor.setConcern(concern);
		return "fifth";
	}
	
	@GetMapping("/sixth")
	public String toDo() {
		return "sixth";
	}
	
	@PostMapping("/sixth")
	public String toDo(@RequestParam("option") String values) {
		System.out.println( "Action is "+ values);
		ActionOnStockChanges aosc = new ActionOnStockChanges();
		aosc.setAction(values);
		investor.setAction(aosc);
		System.out.println(investor);
		return "sixth";
	}
	
	@GetMapping("/result")
	public String getRistProfile(Model model) {
		riskProfile = investorService.getRiskProfile(investor);
		model.addAttribute("riskProfile", riskProfile);
		return "result";
	}
	
	@GetMapping("/summary")
	public String getSummry(Model model) {
		riskProfile = investorService.getRiskProfile(investor);
		model.addAttribute("riskProfile", riskProfile);
		return "summary";
	}
}
