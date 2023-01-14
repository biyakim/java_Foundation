package object_;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account("ºñ¾æ","0121");
		Account a2 = new Account("»óÇõ","0507");
		a1.deposit(100000);
		a1.withdraw(50000, "1234");
		a1.withdraw(50000, "0507");
		a1.transfer(30000, "0507", a2);
		a2.getBalance("1234");
		
		a1.toPrint();
		a2.toPrint();

	}

}
