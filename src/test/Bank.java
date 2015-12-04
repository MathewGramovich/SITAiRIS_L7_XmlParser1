package test;

public class Bank {
	private static final String DEFAULT_COUNTRY = "Belarus";
	private static final String DEFAULT_NAME_BANK = "BelarusBank";

	private String country;
	private String nameBank;
	private Deposit deposit = new Deposit();
	
	public Bank() {
		this.country = DEFAULT_COUNTRY;
		this.nameBank = DEFAULT_NAME_BANK;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getNameBank() {
		return nameBank;
	}
	
	public Deposit getDeposit() {
		return deposit;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}
	
	public String toString(){
		StringBuffer br = new StringBuffer();
		br.append(this.getClass().getName());
		br.append("\n");
		br.append(this.country);
		br.append("\n");
		br.append(this.nameBank);
		br.append("\n");
		br.append(this.deposit.getDeposit());
		br.append("\n");
		br.append(this.deposit.getDepositor());
		br.append("\n");
		br.append(this.deposit.getAccountId());
		br.append("\n");
		br.append(this.deposit.getAmountOnDeposit());
		br.append("\n");
		br.append(this.deposit.getProfitability());
		br.append("\n");
		br.append(this.deposit.getTimeConstraints());
		br.append("\n");
		br.append("\n");
		
		return br.toString();
	}
}
