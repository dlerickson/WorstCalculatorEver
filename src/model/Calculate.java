package model;

public class Calculate {

	//vars
	private int num1;
	private int num2;
	private int answer;
	
	//default no-args
	public Calculate(String[] values) {
		super();
	}
	
	//constructor without an answer
	public Calculate(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}


	//getters and setters
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		//this.answer = answer;
	}
	
	//math is hard and instance variables
	public int Addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public int Subtraction(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}
	

	@Override
	public String toString() {
		return "Calculate [answer=" + answer + "]";
	}
	
	
	
}
