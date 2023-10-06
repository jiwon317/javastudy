package javastudy;

public class EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
	}
}
//		gender1 = "boy"; 원하는 값이 아니므로 열거형을 사용합니다.
enum Gender {
	MALE, FEMALE;

}

