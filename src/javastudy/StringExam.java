package javastudy;
public class StringExam {
	public static void main(String[] args) {
//		String str1 = "hello";
//		String str2 = "hello";
		
		String str1 = new String("Hello world");
		String str2 = new String("Hello world");
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 레퍼런스입니다.");
		}
		else {
			System.out.println("str1과 str2는 다른 레퍼런스입니다.");
		}
//		System.out.println(str1);
//		System.out.println(str1.substring(3));
//		System.out.println(str1);
		
//		if(str1 == str2)
//		System.out.println("str1과 str2는 같은 레퍼런스입니다.");
//		
//		if(str1 == str3)
//		System.out.println("str1과 str3은 같은 레퍼런스입니다.");
//		
//		if(str3 == str4)
//		System.out.println("str3과 str4는 같은 레퍼런스입니다.");
	}
}
