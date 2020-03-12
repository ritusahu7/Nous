package com.irt.Iinvestmentrecommendation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.irt.Iinvestmentrecommendation.model.InvestorDetail;
import com.irt.Iinvestmentrecommendation.model.RiskProfile;

@SpringBootApplication
public class IinvestmentrecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IinvestmentrecommendationApplication.class, args);
	}
	
	@Bean
	public InvestorDetail getInvestorDetail() {
		return new InvestorDetail();
	}

	@Bean
	public RiskProfile getRiskProfile() {
		return new RiskProfile();
	}
}
