package javaStudy;

public class IfExam {
public static void main(String[] args) {
//	int x = 50;
//	int y = 50;
//	
//	if(x>y) {
//		System.out.println("x는 y보다 작습니다");
//	}
//	
//	if(x<y) {
//		System.out.println("x는 y와 같습니다.");
//	}else if(x==y){
//	System.out.println("x와 y는 다릅니다.");}
//	else {
//		System.out.println("test");
//	}
	
	boolean b1 = true;
	boolean b2 = false;
	boolean b3 = true;
	
	System.out.println(b1&&b2);
	System.out.println(b1&&b3);
	
	System.out.println(b1||b2);
	System.out.println(b1||b3);
	System.out.println(b2||b2);
	
	int score = 58;
	if(score<=100 && score>=70) {
		System.out.println("합격");
	}
	else {
		System.out.println("불합격");
	}
	
	System.out.println(b1^b3);
	System.out.println(b1^b2);
	System.out.println(!b1);
}
	
}

