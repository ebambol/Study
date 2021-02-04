package com.java.vending;

import java.util.InputMismatchException;
import java.util.Scanner;
public class JuiceCategoryImprove {
	
	String[] juiceCategory;// = {"�ݶ�", "��������Ʈ", "ȯŸ", "�����", "�׽�ī��", "����", "����ƾ��", "Ʈ����ī��"}; // ����
	String[] juiceName;// = {"�ݶ�", "��������Ʈ", "ȯŸ", "�����", "�׽�ī��", "����", "����ƾ��", "Ʈ����ī��"}; // ����
	int[] juiceAmount;// = {20, 15, 15, 10, 10, 12, 8, 14}; // ��� ����
	int[] willAmount;// = {0, 0, 0, 0, 0, 0, 0, 0}; // ����ڰ� �����Ϸ��� ���� ������ ���� �����
	int[] juicePrice;// = {500, 500, 500, 1200, 1000, 700, 600, 900}; // ���� ����
		
	JuiceCategoryImprove(){
		juiceCategory = new String[] {"�ݶ�", "��������Ʈ", "ȯŸ", "�����", "�׽�ī��", "����", "����ƾ��", "Ʈ����ī��"};
		juiceName = new String[] {"�ݶ�", "��������Ʈ", "ȯŸ", "�����", "�׽�ī��", "����", "����ƾ��", "Ʈ����ī��"};
		juiceAmount = new int[] {20, 15, 15, 10, 10, 12, 8, 14}; // ��� ����
		willAmount = new int[] {0, 0, 0, 0, 0, 0, 0, 0}; // ����ڰ� �����Ϸ��� ���� ������ ���� �����
		juicePrice = new int[] {500, 500, 500, 1200, 1000, 700, 600, 900}; // ���� ����
	}
	
	void printJuice() {
		System.out.println("---[�������Ǳ�]---");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<juiceCategory.length;i++) {
			this.defineStringSize(i+1);
			System.out.print("|"+(i+1)+". "+juiceName[i]);
			System.out.println("\t|��������: "+juiceAmount[i]+"\t|����: "+juicePrice[i]+"\t|");
		}
		System.out.println("-------------------------------------------------");
		System.out.print("(������ ��� ���� ����)\n|������� �������ּ���> ");
	}

	void printJuiceReserve1() { // ������ ������� ������
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]!=0) {
					System.out.print(this.juiceCategory[i]+this.willAmount[i]+"�� | ");
				}
			}
		}
	}

	void printJuiceReserve2() { // |2.�߰��ϱ�| ������ ������ ��������� ������
		System.out.print("|���ſ��� �����: ");
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]!=0) {
					System.out.print(this.juiceCategory[i]+this.willAmount[i]+"��| ");
				}
			}
		}
		System.out.println();
	}
	// ������ ������� ������ ������ ������ ���ؼ� ����� ����
	int cal1(int juiceSelect) { 
		Scanner sc = new Scanner(System.in);

		do {
			if(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1]!=0) {
				int checkNum = 0; // ������ ���� �Է�
				System.out.print(" ["+this.juiceCategory[juiceSelect-1]+"] ���� "+" | ���Ű��ɼ���: "+(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1])+"��"+"\n|������ �Է����ּ���> ");
				while(true) {
					try {
						checkNum = sc.nextInt();
						if(this.juiceAmount[juiceSelect-1]>=this.willAmount[juiceSelect-1]+checkNum) {
							this.willAmount[juiceSelect-1] += checkNum;
							return willAmount[juiceSelect-1];
						} else { 
							if(0>this.juiceAmount[juiceSelect-1]-(this.willAmount[juiceSelect-1]+checkNum)) {
								System.out.println("---���Ű��ɼ����� �ʰ��Ͽ����ϴ�---");
							}
							else if(0==this.juiceAmount[juiceSelect-1]-(this.willAmount[juiceSelect-1]+checkNum)) {
								System.out.println(this.juiceCategory[juiceSelect-1]+" ���Ű����� ������� �����ϴ�.\n");
								return 0;
							}
						}
						break;
					}
					catch(InputMismatchException ime) {
						sc = new Scanner(System.in);
						System.out.print("�߸��� �Է��Դϴ�(������ �Է°���)"+"\n|������ �Է����ּ���> ");
					}
				}
			} else {
				System.out.println("---���Ű��ɼ����� �ʰ��Ͽ����ϴ�---");
				return 0;
			}
		} while(true);
	}
	// ���Ű��� ���� ����
	int cal2(int juiceSelect) { 
		Scanner sc = new Scanner(System.in);
		do {
			if((this.willAmount[juiceSelect-1]>this.juiceAmount[juiceSelect-1])&&this.juiceAmount[juiceSelect-1]!=0) {
				System.out.println("---���Ű��ɼ����� �ʰ��Ͽ����ϴ�---\n���Ű��ɼ���: "+this.juiceAmount[juiceSelect-1]+"��");
				System.out.print(this.juiceCategory[juiceSelect-1]+"\n������ �Է����ּ���> ");
				this.willAmount[juiceSelect-1] += sc.nextInt();
			} else if(this.juiceAmount[juiceSelect-1]==0){
				System.out.println(this.juiceCategory[juiceSelect-1]+" ��� �����մϴ�.\n");
				return 0;
			} else {
				System.out.println(" ["+this.juiceCategory[juiceSelect-1]+"] "+this.willAmount[juiceSelect-1]+"���� �����ϼ̽��ϴ�\n|�Ǹűݾ�: "+this.juicePrice[juiceSelect-1]*this.willAmount[juiceSelect-1]);
				System.out.println("|���� ���� ����: "+(this.juiceAmount[juiceSelect-1]-this.willAmount[juiceSelect-1]));
				return willAmount[juiceSelect-1];
			}
		} while(true);
	}
	// ����ڰ� ������ ������� ������ŭ ���� �������� ����
	void changeJuiceNumber() {
		for(int i=0;i<this.willAmount.length;i++) { 
			if(this.willAmount[i]!=0) {
				if(this.juiceAmount[i]>0) {
					System.out.println(this.juiceCategory[i]+" "+this.willAmount[i]+"�� ���ſϷ�");
					this.juiceAmount[i]-=this.willAmount[i];
				} else {
					this.juiceAmount[i]=0;
				}
			}
		}
	}
	// ����ڰ� �����ߴ� ��������� ���� 0���� �ʱ�ȭ �޼ҵ�
	void changeWillAmount() {
		for(int i=0;i<this.willAmount.length;i++) { 
			this.willAmount[i] = 0;
		}
	}
	//������ ��� ���� ���� ����
	void adminSet(String[] setting, String a){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<setting.length;i++){
			System.out.print((i+1)+"�� ����>");
			a = sc.next();
			setting[i] = a;
			this.juiceCategory[i] = a;
			this.juiceName[i] = a;
			System.out.println((i+1)+"�� '"+setting[i]+"' ���� �Ϸ�");
			this.defineStringSize(i);
		}
	}
	//������ ��� ���� ����, ���� ����
	void adminSet(int[] setting, int a){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<setting.length;i++){
			System.out.print((i+1)+"�� ����>");
			a = sc.nextInt();
			setting[i] = a;
			System.out.println((i+1)+"�� '"+setting[i]+"' ���� �Ϸ�");
		}
	}
		
	void defineStringSize(int index) {
		if(this.juiceCategory[index-1].length()<=2) {
			this.juiceName[index-1] = this.juiceCategory[index-1]+"\t";
		}else {
			this.juiceName[index-1] = this.juiceCategory[index-1];
		}
		
	}
}
