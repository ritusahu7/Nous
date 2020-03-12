package com.irt.Iinvestmentrecommendation.model;

public class WithdrawMoneyInYears {

	public String withdrawMoneyInYears;
	public int score;
	
	public String getWithdrawMoneyInYears() {
		return withdrawMoneyInYears;
	}
	public void setWithdrawMoneyInYears(String withdrawMoneyInYears) {
		this.withdrawMoneyInYears = withdrawMoneyInYears;
		setScore(withdrawMoneyInYears);
	}
	public int getScore() {
		return score;
	}
	public void setScore(String withdrawMoneyInYears) {
		if(withdrawMoneyInYears.equals("lessthan3")) {
			this.score = 3;
		}else if(withdrawMoneyInYears.equals("3to5")) {
			this.score = 6;
		}else if(withdrawMoneyInYears.equals("6to10")) {
			this.score = 8;
		}else if(withdrawMoneyInYears.equals("11ormore")) {
			this.score = 10;
		}else {
			this.score = 0;
		}
		
	}
	
	
}
