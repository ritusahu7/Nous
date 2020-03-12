package com.irt.Iinvestmentrecommendation.model;

import javax.validation.constraints.NotNull;

public class Age {

	private int score;
	
	@NotNull
	private String age;

	public int getScore() {
		return score;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
		setScore(age);
		
	}

	public void setScore(String age) {

		if (age.equals("lessthan18")) {
			this.score = 10;
		} else if (age.equals("18-40")) {
			this.score = 8;
		} else if (age.equals("40-50")) {
			this.score = 6;
		} else if (age.equals("50-60")) {
			this.score = 4;
		} else if (age.equals("greaterthan60")) {
			this.score = 2;
		} else {
			this.score = 0;
		}

	}

	@Override
	public String toString() {
		return "Age [score=" + score + ", age=" + age + "]";
	}

}
