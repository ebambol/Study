//2020-12-11 �̰��� �ڹٴ� p37 ������
public class VariableScopeExample {
	public static void main (String[] args) {
		//v1������  main �޼ҵ� ��Ͽ� ����
		//if������ ����� �ܺο� ����
		int v1 = 15;
		int v2 = 0;
		/*
		 * ���� : byte:1, char:2, short:2, int:4, long:8
		 * �Ǽ� : float:4, double:8
		 * �� : boolean:1
		 */


		if (v1 > 10) { //15 > 10 => true
			//v2 ������ if��Ͽ� ���� =>
			// if ��� ������ ����ϴ� ��������
			v2 = v1 - 10; //15 - 10 => 5;
			// v2 = 5;
		}

		int v3 = v1 + v2 + 5;
	}
}
