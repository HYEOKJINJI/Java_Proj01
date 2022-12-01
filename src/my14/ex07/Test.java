package my14.ex07;

public class Test {

	public static void main(String[] args) {
		Account a = new Account ();
		try {
			a.withDrow(1000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
