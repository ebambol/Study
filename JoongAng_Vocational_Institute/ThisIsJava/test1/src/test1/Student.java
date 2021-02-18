package test1;

public class Student {
	String name;	//�л��̸�
	int kor;	//�����
	int eng;	//�����
	int mat;	//���м���
	int sum;	//�հ�
	double avg; //���
	char grade;
	boolean chksum;
	boolean chkavg;
	boolean chkgrade;
	
	//������
	public Student() { }
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//�޼ҵ�
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
		System.out.printf("%s %s\n","�̸�       : ",name);
		System.out.printf("%s %3d \n","����� : ",kor);
		System.out.printf("%s %3d \n","����� : ",eng);
		System.out.printf("%s %3d \n","���м��� : ",mat);
		System.out.printf("%s %3d\n","�հ�       : ",sum);
		System.out.printf("%s %5.1f\n","���       : ",avg);
		System.out.printf("%s %3s\n","����       : ",grade);
		System.out.println("===================");
	}
}
