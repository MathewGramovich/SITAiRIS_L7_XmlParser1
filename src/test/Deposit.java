package test;

public class Deposit {
	private static final String DEFAULT_DEPOSIT = "Rollup";
	private static final String DEFAULT_DEPOSITOR = "Ivan";
	private static final String DEFAULT_ACCOUNT_ID = "iddef";
	private static final int DEFAULT_AMOUNT_ON_DEPOSIT = 100000;
	private static final double DEFAULT_PROFITABILITY = 25;
	private static final String DEFAULT_TIME = "01-01-2016";
	
	private String deposit;
	private String depositor;
	private String accountId;
	private long amountOnDeposit;
	private double profitability;
	private String timeConstraints;
	
	Deposit(){
		this.deposit = DEFAULT_DEPOSIT;
		this.depositor = DEFAULT_DEPOSITOR;
		this.accountId = DEFAULT_ACCOUNT_ID;
		this.amountOnDeposit = DEFAULT_AMOUNT_ON_DEPOSIT;
		this.profitability = DEFAULT_PROFITABILITY;
		this.timeConstraints = DEFAULT_TIME;
	}
	
	public String getDeposit() {
		return deposit;
	}
	
	public String getDepositor() {
		return depositor;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public long getAmountOnDeposit() {
		return amountOnDeposit;
	}
	
	public double getProfitability() {
		return profitability;
	}
	
	public String getTimeConstraints() {
		return timeConstraints;
	}
	
	
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public void setAmountOnDeposit(int amountOnDeposit) {
		this.amountOnDeposit = amountOnDeposit;
	}
	
	public void setProfitability(double profitability) {
		this.profitability = profitability;
	}
	
	public void setTimeConstraints(String timeConstraints) {
		this.timeConstraints = timeConstraints;
	}
}
