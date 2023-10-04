package javastudy;

public class VariableScopeExam {
	int globalScope = 10;
		
		public void scopeTest(int value) {
			int localScope = 20;
			
			System.out.println(globalScope);
			System.out.println(localScope);
			System.out.println(value);
		}
		
		public void scopeTest2(int value2) {
			System.out.println(globalScope);
//			System.out.println(localScope); 오류
//			System.out.println(value); 오류
			System.out.println(value2);
		}
		
		public static void main(String[] args) {
//			System.out.println(globalScope);	오류
//			System.out.println(localScope);	오류
//			System.out.println(value);	오류
		}	
		
	
}
