package test1;

public class RunStatementExample {
	public static void main(String[] args) {
        // 이스케이프 문자(제어문자) :인쇄할수 없거나 키보드로 표현할수없는 특별한 문자를 가리키며,
        // 역슬래시(\)와 한개의 문자와 결합하여 작성
       
        /*
          \n 개행 . 스크린 커서 위치를 다음줄의 처음으로 옮기 10
          \t 수평탭. 스크린 커서를 다음 탭으로 옮김
          \r 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다.
             이 기호 다음에 오는 문자를 덮어 쒸운다. 13
          \\ : 역슬래시 문자를 출력할때 사용.
          \" : 큰 따옴표를 출력할때 사용
          \' : 작은 따옴표를 출력할때 사용       
        */
       
        System.out.print("여기는 첫째줄");
        System.out.println("입니다.");
        System.out.println("여기는 둘재 줄\n여기는 셋째줄...");
        System.out.println("--------------------------------");
        System.out.println("국어\t영어\t수학");
        System.out.println("90\t80\t70");
        System.out.println("이번엔 캐리지 리턴을 써볼까요.\rA"); //A 번엔 캐리지 리턴을 써볼까요.
        System.out.println("역슬래시(\\)를 출력할때는 이스케이프 문자를 사용합니다.");
        System.out.println("\"안녕하세요. 저는 자바킹입니다.\"");
	}	

}