package my14.ex07;

public class Account {
	private long balance = 1000;	// 예금의 잔고 1000 
	public Account() {}		// 기본 생성자
		
	public long getBalance() {	// getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	// 예금
	public void desposit(int money) {	// 기존의 잔고에서 money 를 인풋 받아서 더해서 다시 필드에 적용

		balance += money;
	}
	
	
	
	
	// 예외 처리
	// 출금 : 
	public void withDrow(int money) throws BalanceException {
		// 잔고가 인풋받은 money 보다 작은 경우 잔고 부족이라고 강제로 예외를 발생 시켜서 처리
			// 예외 메세지 : "잔고가 부족 합니다." 라고 출력을 해주면됨
			// balanceException <== 사용자 정의 예외를 생성해서 
		if (balance < money) {
			throw new BalanceException("잔고가 부족합니다.");
		}else {
			System.out.println(balance - money);
		}
		
		
	}
	
}
