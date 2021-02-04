package verify.exam20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();

			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌 생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();

		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}


	}
	
	//계좌 목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌 목록");
		System.out.println("---------");
		for(int i=0; i<accountArray.length; i++) {
			if((accountArray[i]!=null)) {
				System.out.println("계좌번호: "+ accountArray[i].getAno());
				System.out.println("계좌주: "+ accountArray[i].getOwner());
				System.out.println("초기입금액: "+ accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}

	//예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("입금 되었습니다.");
		System.out.println("현재 금액 : " + account.getBalance());
	}

	//출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account.getBalance() < balance) {
			System.out.println("돈없음");
		}
		System.out.print("금액 : " +account.getBalance());
		account.setBalance(account.getBalance() - balance);
		System.out.println("에서 " + balance + "를 출금하시고 " + account.getBalance() + "가 남았습니다.");

	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account result = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				String dbac = accountArray[i].getAno();
				if(dbac.equals(ano)) {
					result = accountArray[i];
					break;
				}
			}
		}
		return result;
	}
}
