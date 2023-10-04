package javastudy;

public class VariableScopeExam2 {
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
		
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		System.out.println(value2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(staticVal);
		
		VariableScopeExam2 v1 = new VariableScopeExam2();
		System.out.println(v1.globalScope);
		VariableScopeExam2 v2 = new VariableScopeExam2();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		v1.staticVal = 50;
		v1.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
	}
}
