package com.irt.Iinvestmentrecommendation.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irt.Iinvestmentrecommendation.model.InvestorDetail;
import com.irt.Iinvestmentrecommendation.model.RiskProfile;

@Service
public class InvestorService {

	@Autowired
	RiskProfile riskProfile;
	
	List<InvestorDetail> investorDetails = new ArrayList<InvestorDetail>(
			Arrays.asList(new InvestorDetail("John Doe", "John.doe@anymail.com", "999-999-9999", "123 Main St. Anytown, India")));
	
	
	public InvestorDetail getInvestorDetail(String emailId) {
		return investorDetails.stream().filter(t-> t.getEmail().equals(emailId)).findFirst().get();
	}
	
	public RiskProfile getRiskProfile(InvestorDetail investor) {
		int score = investor.getAge().getScore()
				+investor.getAnulaIncome().getScore()
				+investor.getWithdrawMoneyInYears().getScore()
				+investor.getSpendingMoneyInYears().getScore()
				+investor.getConcern().getScore()
				+investor.getAction().getScore();
		
		riskProfile.setScore(score);
		return riskProfile;
		
	}
}
