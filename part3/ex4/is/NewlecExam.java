package part3.ex4.is;

// 부모 super Exam
// 내 자신 this NewlecExam

public class NewlecExam extends Exam { // ISA 상속
	 private int com;
	 
		public int getCom() {
			return com;
		}

		public void setCom(int com) {
			this.com = com;
		}
		
//	// 자동으로 호출되는 기본 생성자 내용
//	public NewlecExam() {
//		super(); // 부모의 생성자를 호출
//		this.com = 0;
//	}
	 
	// 메서드 오버라이드
	// 부모 클래스에 있는 메서드를 재정의
	 @Override
		public int total() {
			return super.total() + com;
			// return getKor()+getEng()+getMath()+com
		}

	public NewlecExam() {
		 this(0,0,0,0);
	 }

	public NewlecExam(int kor, int eng, int math, int com) {
		// 부모 생성자
		super(kor, eng, math);
		this.com = com;
	}
	
	
}
