package com.java.test3;

import java.util.Comparator;
import com.java.test3.CompareExample.Student;

public class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) {
			return -1; 	// a.sno 값이 b.sno값 보다 작으면 -1 리턴
		} else if(a.sno == b.sno){
			return 0;	// a.sno 값이 b.sno값과 같으면 0 리턴
		} else {
			return 1;	// a.sno 값이 b.sno값 보다 크면 1 리턴
		}
	}
}
