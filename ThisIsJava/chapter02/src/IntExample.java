//2020-12-14 �̰��� �ڹٴ� p45 ������
public class IntExample {
	public static void main (String[] args) {
		int var1 = 10;	//10������ ����
		int var2 = 012;	//8������ ����
		int var3 = 0x10; //16������ ����

		System.out.println(var1);	//10
		System.out.println(var2);	//10
		System.out.println(var3);	//10

		int [] var = {10, 012, 0x10};
		System.out.println("�ݺ���");
		for (int i=0; i<3; i++)
			System.out.println(var[i]);
	}
}



 
 /* �����ڵ�
  *  var3 = 0xG
 * Invalid hex literal number*/
 