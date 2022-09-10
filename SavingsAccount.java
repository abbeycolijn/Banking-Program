import java.util.Date;

public class SavingsAccount {
 
	double balance;
	String nickname;
	double annualIntRate;
	Date dateEstablished;

	SavingsAccount(){	
		nickname = "";
		balance = 0.0;
		annualIntRate = 0.0;
		dateEstablished = new Date();
		
	}
	SavingsAccount(double balance, String nickname){
		this.balance = balance;
		this.nickname = nickname;
	}
	
	void setNickname(String nickname) {
		this.nickname = nickname;
	}
	String getNickname() {
		return this.nickname;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	double getBalance() {
		return balance;
	}
	void setAnnualInt(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	double getAnnualInt() {
		return this.annualIntRate;
	}

	//deposit method
	double setDeposit(double deposit) {
		return this.balance += deposit;
	}

	//monthly interest method
	void setAnnualInterest(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	double getAnnualInterestRate() {
		return this.annualIntRate;
	}

	double getMonthlyInterestRate() {
		double monthlyInt = balance * (annualIntRate/ 1200.0);
		return monthlyInt;
	}
	Date getDate() {
		return this.dateEstablished;
	}
		
	public String toString() {
		return "Nickname: " + nickname + "\nDate created: " + dateEstablished + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualIntRate + "%";
		}
		
	}


