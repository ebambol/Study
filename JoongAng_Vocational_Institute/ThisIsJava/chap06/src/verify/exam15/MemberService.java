package verify.exam15;

public class MemberService {
	//�ʵ�
	String id;
	String password;
	
	//������
	boolean login (String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout (String id){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}