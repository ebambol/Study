package test1;

public class TestScore {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		String[] name = {"김유신", "강감찬", "이순신"};
		int[] kor = {70, 100, 70};
		int[] eng = {90, 60, 100};
		int[] mat = {50,90,100};

		int[] sum = {0,0,0};
		double[] avg = {0,0,0};
		int[] rank = {0,0,0};

		for(int i=0; i<3;i++) {
			sum[i] = cl.sum(kor[i], eng[i], mat[i]);
		}

		//순위계산
		if(sum[0]<sum[1] && sum[1]< sum[2]) {
			rank[0]=3;
			rank[1]=2;
			rank[2]=1;
		}else if(sum[0]>sum[1] && sum[1]<sum[2]) {
			rank[0]=2;
			rank[1]=3;
			rank[2]=1;
		} else if (sum[0]<sum[1] && sum[1]>sum[2]) {
			rank[0]=3;
			rank[1]=1;
			rank[2]=2;
		} else if (sum[0]>sum[1] && sum[1]>sum[2]) {
			rank[0]=3;
			rank[1]=1;
			rank[2]=2;
		} else if(sum[0]>sum[1] && sum[1]> sum[2]) {
			rank[0]=1;
			rank[1]=2;
			rank[2]=3;
		} else if (sum[0]>sum[1] && sum[1]<sum[2]) {
			rank[0]=1;
			rank[1]=3;
			rank[2]=2;
		}
		
		System.out.println("***********************************");
		System.out.printf("** %1d. 과정명 : Java기반응용SW개발자과정     **\n",1);
		System.out.printf("** %1d. 프로그램 제목: 성적처리 프로그램            **%n",2);
		System.out.printf("** %1d. 개발자 성명 : 이현국                              **\n",3);
		System.out.println("***********************************");
	
		System.out.printf("%3s %6s %6s %6s %4s %7s %5s %n","이름", "국어성적", "영어성적", "수학성적", "합계" , "평균", "등수");
		System.out.println("======================================");
		for(int i =0;i<3;i++) {
		System.out.printf("%3s %6d %6d %6d %4d %5.1f %2d%n", name[i], kor[i],eng[i],mat[i], sum[i]=cl.sum(kor[i], eng[i], mat[i]), avg[i]=cl.avg(kor[i],eng[i], mat[i]), rank[i]);
		}
		
	}

}
