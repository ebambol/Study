package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println("oldStr: " + oldStr);
		System.out.println("newStr: " + newStr);
	}

}
