package sec05_try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();		//file.txt을 읽습니다.
			throw new Exception();	//강제 예외발생 (close()실행)
//			fis.close();	//file.txt을 닫습니다.(자동실행)
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
	}

}
