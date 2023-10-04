package javastudy;

public class StaticExam {
	public static void main(String []args) {
		Car2 taxi = new Car2();
		Car2 suv = new Car2();
		
		taxi.wheelCount = 10;
		suv.wheelCount = 4;
		
		System.out.println("taxi의 바퀴 수:"+ taxi.wheelCount);
		System.out.println("suv의 바퀴 수:"+ suv.wheelCount);
	}
}
