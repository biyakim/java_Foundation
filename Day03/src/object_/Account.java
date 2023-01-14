package object_;

public class Account {
	
	long balance;
	String accountNumber;
	String name;
	String password;
	
	void deposit(long money) {
		this.balance +=money;
		System.out.println(this.name+"���� ���·�"+money+"���� �ԱݵǾ����ϴ�");
		System.out.println("���� �ܾ� :"+this.balance+"��.");
	}
	void withdraw(long money, String password) {
		if(checkPassword(password)) {
			if(this.balance - money < 0) {
				System.out.println("�ܾ��� �����մϴ�");
			}else {
				this.balance -=money;
				System.out.println(this.name+"���� ���¿���"+money+"���� ��ݵǾ����ϴ�");
				System.out.println("���� �ܾ� :"+this.balance+"��.");
			}
		}else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
	}
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	void transfer(long money, String password, Account account) {
		if(checkPassword(password)) {
			if(this.balance - money < 0) {
				System.out.println("�ܾ��� �����մϴ�");
			}else {
				this.balance -=money;
				account.balance +=money;
				System.out.println(this.name+"���� ���¿���"+account.name+"���� ���·�"+money+"���� ��ݵǾ����ϴ�");
				System.out.println("���� �ܾ� :"+this.balance+"��.");
			}
		}else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
		}
	}
	void getBalance(String password) {
		if(checkPassword(password)) {
			System.out.println(this.name+"���� ����. ���� �ܾ� : "+this.balance+"��.");
		}else {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
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
		System.out.printf("������ : %s, �����ܾ� : %d, ���¹�ȣ : %s\n",this.name,this.balance,this.accountNumber);
	}
}
