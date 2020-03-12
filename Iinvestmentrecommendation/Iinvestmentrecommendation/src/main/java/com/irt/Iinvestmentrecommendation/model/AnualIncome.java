package com.irt.Iinvestmentrecommendation.model;

import javax.validation.constraints.NotNull;

public class AnualIncome {
	@NotNull
	private String anualIncome;
	private int score;
	
	
	public String getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(String anualIncome) {
		this.anualIncome = anualIncome;
		setScore(anualIncome);
	}
	public int getScore() {
		return score;
	}
	public void setScore(String anualIncome) {
		if(anualIncome.equals("lessthan1lakh")) {
			this.score = 2;
		}else if(anualIncome.equals("1to5")) {
			this.score = 4;
		}else if(anualIncome.equals("5to10")) {
			this.score = 6;
		}else if(anualIncome.equals("10to30")) {
			this.score = 8;
		}else if(anualIncome.equals("greaterthan30")) {
			this.score = 10;
		}else {
			this.score = 0;
		}
		
		
	}
	
	

}
