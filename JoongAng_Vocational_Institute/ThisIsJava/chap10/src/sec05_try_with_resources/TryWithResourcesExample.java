package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();		//file.txt�� �н��ϴ�.
			throw new Exception();	//���� ���ܹ߻� (close()����)
//			fis.close();	//file.txt�� �ݽ��ϴ�.(�ڵ�����)
		} catch(Exception e) {
			System.out.println("����ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
