package test1;

public class Student {
	String name;	//학생이름
	int kor;	//국어성적
	int eng;	//영어성적
	int mat;	//수학성적
	int sum;	//합계
	double avg; //평균
	char grade;
	boolean chksum;
	boolean chkavg;
	boolean chkgrade;
	
	//생성자
	public Student() { }
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//메소드
	public void sum() {
		chksum = true;
		sum = kor+eng+mat;
	}
	
	public void avg() {
		chkavg = true;
		avg = sum/3;
	}
	
	public void grade() {
		chkgrade = true;
		if(avg>=90) {
			grade = 'A';
		} else if (avg>=80 && avg<90) {
			grade = 'B';
		} else if (avg>=70 && avg<80) {
			grade = 'C';
		} else if (avg>=60 && avg<70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
	}
	
	public void report() {
		System.out.println("===================");
		System.out.printf("%s %s\n","이름       : ",name);
		System.out.printf("%s %3d \n","국어성적 : ",kor);
		System.out.printf("%s %3d \n","영어성적 : ",eng);
		System.out.printf("%s %3d \n","수학성적 : ",mat);
		System.out.printf("%s %3d\n","합계       : ",sum);
		System.out.printf("%s %5.1f\n","평균       : ",avg);
		System.out.printf("%s %3s\n","학점       : ",grade);
		System.out.println("===================");
	}
}
