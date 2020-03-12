package com.irt.Iinvestmentrecommendation.model;

public class SpendingMoneyInYears {

	private String spendInYears;
	private int score;
	
	public String getSpendInYears() {
		return spendInYears;
	}
	public void setSpendInYears(String spendInYears) {
		this.spendInYears = spendInYears;
		setScore(spendInYears);
	}
	public int getScore() {
		return score;
	}
	
	public void setScore(String spendInYears) {
		if(spendInYears.equals("lessthan2")) {
			this.score = 3;
		}else if(spendInYears.equals("2to5")) {
			this.score = 6;
		}else if(spendInYears.equals("6to10")) {
			this.score = 8;
		}else if(spendInYears.equals("11ormore")) {
			this.score = 10;
		}else {
			this.score=0;
		}
		
		
	}
	
	
}
