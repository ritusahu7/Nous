package com.irt.Iinvestmentrecommendation.model;

public class Concern {

	private String concern;
	private int score;
	
	public String getConcern() {
		return concern;
	}
	
	public void setConcern(String concern) {
		this.concern = concern;
		setScore(concern);
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(String concern) {
		if(concern.equals("losing")){
			this.score = 3;
		}else if(concern.equals("losingorgaining")){
			this.score = 7;
		}else if(concern.equals("gaining")){
			this.score = 10;
		}else {
			this.score=0;
		}
		
	}
	
	
}
