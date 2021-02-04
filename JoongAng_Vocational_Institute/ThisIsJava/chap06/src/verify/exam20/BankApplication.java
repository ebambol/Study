package verify.exam20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����>");
			
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
		System.out.println("���α׷� ����");
	}

	
	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���� ����");
		System.out.println("---------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();

		System.out.print("������: ");
		String owner = scanner.next();
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}


	}
	
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���� ���");
		System.out.println("---------");
		for(int i=0; i<accountArray.length; i++) {
			if((accountArray[i]!=null)) {
				System.out.println("���¹�ȣ: "+ accountArray[i].getAno());
				System.out.println("������: "+ accountArray[i].getOwner());
				System.out.println("�ʱ��Աݾ�: "+ accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}

	//�����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		System.out.println("�Ա� �Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + account.getBalance());
	}

	//����ϱ�
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ� : ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account.getBalance() < balance) {
			System.out.println("������");
		}
		System.out.print("�ݾ� : " +account.getBalance());
		account.setBalance(account.getBalance() - balance);
		System.out.println("���� " + balance + "�� ����Ͻð� " + account.getBalance() + "�� ���ҽ��ϴ�.");

	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
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
