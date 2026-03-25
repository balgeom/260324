package kr.com.beak;

/*
 * Java 프로그램은 편집 -> 컴파일 -> 실행단계를 거쳐 완성
 */

// Hello 클래스 선언

public class Hello {
	//print() 매서드
	public void print(String name) {
		System.out.println("Hello, " + name );
	}
	// 진입 메서드
	public static void main(String[] args) {
		Hello  hello = new Hello(); //new 키워드를 사용용해서 객체조사 
		hello.print("java");
	} 

}
