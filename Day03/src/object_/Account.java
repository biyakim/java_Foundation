package object_;

public class Account {
	
	long balance;
	String accountNumber;
	String name;
	String password;
	
	void deposit(long money) {
		this.balance +=money;
		System.out.println(this.name+"님의 계좌로"+money+"원이 입금되었습니다");
		System.out.println("현재 잔액 :"+this.balance+"원.");
	}
	void withdraw(long money, String password) {
		if(checkPassword(password)) {
			if(this.balance - money < 0) {
				System.out.println("잔액이 부족합니다");
			}else {
				this.balance -=money;
				System.out.println(this.name+"님의 계좌에서"+money+"원이 출금되었습니다");
				System.out.println("현재 잔액 :"+this.balance+"원.");
			}
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	void transfer(long money, String password, Account account) {
		if(checkPassword(password)) {
			if(this.balance - money < 0) {
				System.out.println("잔액이 부족합니다");
			}else {
				this.balance -=money;
				account.balance +=money;
				System.out.println(this.name+"님의 계좌에서"+account.name+"님의 계좌로"+money+"원이 출금되었습니다");
				System.out.println("현재 잔액 :"+this.balance+"원.");
			}
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	void getBalance(String password) {
		if(checkPassword(password)) {
			System.out.println(this.name+"님의 계좌. 현재 잔액 : "+this.balance+"원.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
	}
	Account(String name, String password){
		this.accountNumber = "";
		for(int i=0;i<9;i++) {
			accountNumber +=(int)(Math.random()*10);
		}
		this.name = name;
		this.password = password;
	}
	void toPrint() {
		System.out.printf("예금주 : %s, 계좌잔액 : %d, 계좌번호 : %s\n",this.name,this.balance,this.accountNumber);
	}
}
