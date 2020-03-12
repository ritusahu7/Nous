package com.irt.Iinvestmentrecommendation.model;

public class InvestorDetail {

	private String name;
	private String email;
	private String mobile;
	private String address;
	private Age age;
	private AnualIncome anulaIncome;
	private WithdrawMoneyInYears withdrawMoneyInYears;
	private SpendingMoneyInYears spendingMoneyInYears;
	private Concern concern;
	private ActionOnStockChanges action;
	
	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public AnualIncome getAnulaIncome() {
		return anulaIncome;
	}

	public void setAnulaIncome(AnualIncome anulaIncome) {
		this.anulaIncome = anulaIncome;
	}

	public WithdrawMoneyInYears getWithdrawMoneyInYears() {
		return withdrawMoneyInYears;
	}

	public void setWithdrawMoneyInYears(WithdrawMoneyInYears withdrawMoneyInYears) {
		this.withdrawMoneyInYears = withdrawMoneyInYears;
	}

	public SpendingMoneyInYears getSpendingMoneyInYears() {
		return spendingMoneyInYears;
	}

	public void setSpendingMoneyInYears(SpendingMoneyInYears spendingMoneyInYears) {
		this.spendingMoneyInYears = spendingMoneyInYears;
	}

	public Concern getConcern() {
		return concern;
	}

	public void setConcern(Concern concern) {
		this.concern = concern;
	}

	public ActionOnStockChanges getAction() {
		return action;
	}

	public void setAction(ActionOnStockChanges action) {
		this.action = action;
	}

	public InvestorDetail() {
		
	}
	
	public InvestorDetail(String name, String email, String mobile, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "InvestorDetail [name=" + name + ", email=" + email + ", mobile=" + mobile + ", address=" + address
				+ ", age=" + age.getScore() + ", anulaIncome=" + anulaIncome.getScore() + ", withdrawMoneyInYears=" + withdrawMoneyInYears.getScore()
				+ ", spendingMoneyInYears=" + spendingMoneyInYears.getScore() + ", concern=" + concern.getScore() + ", action=" + action.getScore()
				+ "]";
	}

	
	
	
	
}
