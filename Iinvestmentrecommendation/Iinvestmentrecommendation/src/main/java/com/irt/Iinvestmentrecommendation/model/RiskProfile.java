package com.irt.Iinvestmentrecommendation.model;

public class RiskProfile {

	private int score;
	private String name;
	private String strategy;
	private int debtRecommendation;
	private int equityRecommendation;
	
	public RiskProfile() {
		
	}
	
	public void setScore(int score) {
		this.score = score;
		
		if(score>=16 || score<=22) {
			this.name = "Conservative";
			this.strategy = "Investment Strategy should be conservative, with entire amount invested in Debt funds";
			this.debtRecommendation= 100;
			this.equityRecommendation = 0;
		}else if(score>=23 || score<=32) {
			this.name = "Moderately Conservative";
			this.strategy = "Investment Strategy should be moderately conservative, with 80% of investment in debt funds and 20% in equity funds";
			this.debtRecommendation= 80;
			this.equityRecommendation = 20;
		}else if(score>=33 || score<=42) {
			this.name = "Moderatee";
			this.strategy = "Investment Strategy should be moderate, with 50% of investment in debt funds and 50% in equity funds";
			this.debtRecommendation= 50;
			this.equityRecommendation = 50;
		}else if(score>=43 || score<=52) {
			this.name = "Moderately Aggressive";
			this.strategy = "Investment Strategy should be moderately aggressive, with 20% of investment in debt funds and 80% in equity funds";
			this.debtRecommendation= 20;
			this.equityRecommendation = 80;
		}else if(score>=53 || score<=60) {
			this.name = "Aggressive";
			this.strategy = "Investment Strategy should be aggressive, with 0% of investment in debt funds and 100% in equity funds";
			this.debtRecommendation= 0;
			this.equityRecommendation = 100;
		}
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public int getDebtRecommendation() {
		return debtRecommendation;
	}
	public void setDebtRecommendation(int debtRecommendation) {
		this.debtRecommendation = debtRecommendation;
	}
	public int getEquityRecommendation() {
		return equityRecommendation;
	}
	public void setEquityRecommendation(int equityRecommendation) {
		this.equityRecommendation = equityRecommendation;
	}
	
	
}
