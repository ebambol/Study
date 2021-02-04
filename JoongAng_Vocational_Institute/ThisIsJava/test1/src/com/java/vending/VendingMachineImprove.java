package com.java.vending;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class VendingMachineImprove {
	public static void main(String[] args) throws IOException{
		int password = 123456; // ������ ��� ���Կ�
		Scanner sc = new Scanner(System.in);
		JuiceCategoryImprove jci = new JuiceCategoryImprove();
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //������ ��� ���� ������(�̿�)
		*������: ���� ���� ���ý� ���� �Է��ϸ� ���� �߻�(�����Ϸ�) / �������� ���� �� ���� �Է��ϸ� ���� �߻�(�����Ϸ�) / (ǥ���Ŀ� �̸�) ���ڿ��� 2�� ������ �� "\t"�ڵ����� ���̴� ��� �߰��ϱ�(��)
		*|'����' '����' '����' �Է�(����� ����)> ���Ŀ��� ����� ��� java.lang.NumberFormatException �߻�
		*�߰��� ���: juiceCategoryŬ������ �ƴ϶� ������ ��忡�� �������� �����ϱ�()
		*/

		do {
			jci.printJuice();
			int juiceSelect = 1;
			boolean exit = true;
			while(true) {
				try {
					juiceSelect = sc.nextInt();
					break;
				}
				catch(InputMismatchException ime) {
					sc = new Scanner(System.in);
					System.out.print("�߸��� �Է��Դϴ�(������ �Է°���)"+"\n|�ٽ� �Է����ּ���> ");
				}
			}

			if(juiceSelect != password) { //���� password�Է½� ������ ��� ���� 

				do {
					if(juiceSelect>0 && juiceSelect<=jci.juiceCategory.length) {
						jci.cal1(juiceSelect); // ������ ������� ������ ������ ������ ���ؼ� ����� ����
						jci.cal2(juiceSelect); // ���Ű��� ���� ����
						exit = false; // do �ݺ��� Ż��
					} else {
						System.out.print("�߸��� �Է��Դϴ�."+"\n|�ٽ� �Է����ּ���> ");
						juiceSelect = sc.nextInt();
					}

				} while(exit);
				exit = true;

				int totalPrice = 0; //����� ���� ���� ����� ���� ����
				int cash=0; // ������� ���� �ݾ� ����� ���� ����

				do {
					System.out.print("|�����ϱ�: 1 |�߰��ϱ�: 2 |����ϱ�: 3\n|�������� ���� �� �ϳ��� �Է����ּ���> ");	

					while(true) {
						try {
							int buyProcess = sc.nextInt();
							if(buyProcess>0 && buyProcess<4) {
								switch(buyProcess) {
								case 1:
									for(int i=0;i<jci.willAmount.length;i++) { //���� ���� �� �ٷ� �����ϱ⸦ �������� �� �� |2.�߰��ϱ�|�� �ٸ� ���Ḧ �߰����� ������ �Ѿ� �ջ��ϱ�
										totalPrice += jci.juicePrice[i]*jci.willAmount[i];
									}
									jci.printJuiceReserve1(); // |2.�߰��ϱ�| ������ ������ ���ſ��� ��������� ������

									System.out.print("\n�����ݾ�: "+totalPrice+"\n|������ �������ּ���> ");
									cash = sc.nextInt(); //����� ���� �ݾ� �Է�
									System.out.println("���Աݾ�: "+cash);

									do {
										if(cash>=totalPrice) {
											jci.changeJuiceNumber(); // ����ڰ� ������ ������� ������ŭ ���� �������� ����
											jci.changeWillAmount();  // ����ڰ� �����Ϸ��� ���� ������ ������ �ٽ� 0���� �ʱ�ȭ

											System.out.println("�Ž�����: "+(cash-totalPrice));
											break;
										} else {
											System.out.print("---�ݾ��� �����մϴ�---\n|����ݾ�: "+cash+" |�ʿ�ݾ�: "+((totalPrice)-cash)+"\n|�����߰��ϱ�> ");
											cash += sc.nextInt(); //���� ������� ���� �ݾװ� �ջ��� ���ο� cash ����
											System.out.println("���Աݾ�: "+cash);
										}
									} while(true);
									exit = false; //�������� ������ Ż���ϰ� '15����'���� ȸ��
									break;

								case 2:	
									jci.printJuiceReserve2();
									System.out.print("|�߰��Ͻ� ������� �������ּ���> ");
									do {
										while(true) {
											try {
												juiceSelect = sc.nextInt();
												break;
											}
											catch(InputMismatchException ime) {
												sc = new Scanner(System.in);
												System.out.print("�߸��� �Է��Դϴ�(������ �Է°���)"+"\n|�ٽ� �Է����ּ���> ");
											}
										}

										if(juiceSelect>0 && juiceSelect<=jci.juiceCategory.length) {
											jci.cal1(juiceSelect); //������ ������� ������ ������ ������ ���ؼ� ����� ����
											jci.cal2(juiceSelect); //���Ű��� ���� ����
											break;
										} else {
											System.out.print("�߸��� �Է��Դϴ�."+"\n|�߰��Ͻ� ������� �ٽ� �������ּ���> ");
										}
									} while(true);
									break;

								case 3:
									System.out.println("�ֹ��� ����մϴ�.");
									jci.changeWillAmount(); // ����ڰ� �����ߴ� ��������� ���� 0���� �ʱ�ȭ
									exit = false; 
									break;
								}
							} else {
								System.out.print("�߸��� �Է��Դϴ�(�������� ������ȣ ����)"+"\n|�ٽ� �Է����ּ���> ");
								buyProcess = sc.nextInt();
							}
							break;
						}
						catch(InputMismatchException ime) {
							sc = new Scanner(System.in);
							System.out.print("�߸��� �Է��Դϴ�(������ �Է°���)"+"\n|�ٽ� �Է����ּ���> ");
						}
					}
				} while(exit);

			} else { //������ ��� ����
				boolean exitAdmin = true;
				do {
					System.out.println("---[������ ��� ����]---");
					System.out.println("\t��-------(�ϰ�����)------��");
					System.out.print("|��������\t|��������\t|��������\t|���ݺ���\t|�������\t|����\n�Է�> ");
					String manegement  = sc.next();
					switch(manegement) {
					/*case "��������":
						System.out.println("|�������� ���� �Ϸ� ");
						System.out.print("�������� �Է�> ");
						int indexNum = sc.nextInt();
						jci.newjuiceCategory(indexNum);
						System.out.println("|���� �Ϸ�");
						
						break;*/
					case "��������":
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("|�������� ���� �Ϸ� ");
						System.out.print(jci.juiceCategory.length+"�� �� ������ ��ġ �Է�> ");
						int index;
						while(true) {
							try {
								index = Integer.parseInt(br.readLine());
								break;
							}
							catch(NumberFormatException ime) {
								br = new BufferedReader(new InputStreamReader(System.in));
								System.out.print("�߸��� �Է��Դϴ�(������ �Է°���)"+"\n|�ٽ� �Է����ּ���> ");
							}
						}
						
						System.out.print("|'����' '����' '����' �Է�(����� ����)> ");

						StringTokenizer st = new StringTokenizer(br.readLine()," ");
						jci.juiceCategory[index-1] = st.nextToken();
						jci.defineStringSize(index);
						jci.juiceAmount[index-1] = Integer.parseInt(st.nextToken());
						jci.juicePrice[index-1] = Integer.parseInt(st.nextToken());
						System.out.print("|"+(index)+". "+jci.juiceCategory[index-1]);
						System.out.println("\t|��������: "+jci.juiceAmount[index-1]+"\t|����: "+jci.juicePrice[index-1]+"\t|");
						System.out.println("|���� �Ϸ�");
						break;
						
					case "��������":
						System.out.println("|�������� ���� �Ϸ� ");
						String reName = "empty";
						jci.adminSet(jci.juiceCategory, reName);
						break;
						
					case "��������":
						System.out.println("|�������� ���� �Ϸ� ");
						int reNumber = 0;
						jci.adminSet(jci.juiceAmount, reNumber);
						break;
						
					case "���ݺ���":
						System.out.println("|���ݺ��� ���� �Ϸ� ");
						int rePrice = 0;
						jci.adminSet(jci.juicePrice, rePrice);
						break;
						
					case "�������":
						System.out.println("|������� ���� �Ϸ� ");
						System.out.print("|������ ��й�ȣ�� �Է��� �ּ���> ");
						password = sc.nextInt();
						System.out.println("|���� �Ϸ�");
						break;	
						
					case "����":
						System.out.println("---[������ ��� ����]---");
						exitAdmin = false;
					}
				} while(exitAdmin);
				exitAdmin = true;

			}
		} while(true);
	}
}
