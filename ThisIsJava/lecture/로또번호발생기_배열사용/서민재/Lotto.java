
public class Lotto {
	/*
	 * (1 ~ 45) 45개의 숫자 중 6개의 숫자를 중복없이 발생시켜 출력
	 * int 배열을 사용하여 작성
	 */
	
	public static void main(String[] args) {
		
		
		//1.
		int[] num = new int[6];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				while(num[i]==num[j]) {	
					num[i] = (int)(Math.random() * 45) + 1;
					j = 0;
				} 
			}
			System.out.println("로또 번호 : " + num[i]);
		}
		
		/*
		//2.
		int[] num = new int[6];
		boolean check = true;
		do {
			System.out.println("--------------");
			for(int i = 0; i < num.length; i++) {
				num[i]=(int)(Math.random() * 45 + 1);
				System.out.println("로또 번호 : " + num[i]);
			}
			
			check = false;
			
			BP : for(int j = 0; j < num.length; j++) {
				for(int k = j + 1; k < num.length; k++) {
					if(num[j] == num[k]) {
						check = true;
						System.out.println("####다시 추첨####");
						break BP;
					}
				}
			}
		}while(check);
		*/
		
		
		
	}
}
