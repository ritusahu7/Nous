package com.irt.Iinvestmentrecommendation.model;

public class ActionOnStockChanges {
	
	private String action;
	private int score;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
		setScore(action);
	}
	public int getScore() {
		return score;
	}
	public void setScore(String action) {
		if(action.equals("sellall")) {
			this.score = 3;
		}else if(action.equals("sellsome")) {
			this.score = 6;
		}else if(action.equals("donothing")) {
			this.score = 8;
		}else if(action.equals("buymore")) {
			this.score = 8;
		}else {
			this.score= 0;
		}
		
	}
	
	

}
