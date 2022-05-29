package part3.ex5.abst.entity;

public class NewlecExam extends Exam {
// Exam은 추상클래스로, 자식을 통해서만 객체가 될 수 있음
// 자식클래스가 생성될 때 super()을 통해 생성됨
	private int com;
	 
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		return super.total() + com;
	}

	public NewlecExam() {
		super();
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	@Override
	public double avg() {
		return total() / 4.0;
	}
}
