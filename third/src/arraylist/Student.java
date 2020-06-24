package arraylist;

import java.util.ArrayList;

// 226쪽 배열 응용프로그램 구현 스스로 해보기!
public class Student {
	int id;
	String name;
	ArrayList<Subject> subList;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		subList = new ArrayList<Subject>();
	}
	
	public void addSub(String sb, int score) {
		Subject subject = new Subject();		
		// 과목명과 점수 추가해서 배열에 저장 
		subject.setSb(sb);
		subject.setScore(score);		
		subList.add(subject);
	}
	
	public void showStudentInfo() {
		int tot = 0;
		
		for(Subject sj : subList) {
			tot += sj.getScore();	// 총점 합계
			System.out.println(name +"학생의 " + sj.getSb() + " 과목 점수는 " + sj.getScore()+"점 입니다.");
		}
		System.out.println(name + "학생의 총점은 " + tot + "점 입니다." );
	}
	
}
