package com.javaex.basic;
//클래스 임포트 
import java.util.Scanner;
public class ConsoleEx {
	public static void main(String[] args) {
		//consoleOutputEx();
		consoleInputEx();
		
	}
	
	//콘솔 입력
	private static void consoleInputEx() {
		//이름과
		//나이를 입력받아 출력하는 프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);//표준 입력 장치(키보드)
		System.out.println("이름은?");
		String name = scanner.next();	//문자열 입력
		System.out.println("나이는?");
		int age = scanner.nextInt();	//정수입력
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 "+ age + "입니다");
		// 자원을 사용한 이후에는 반드시 닫아주자
		scanner.close();
		
		
	}
	
	//�ܼ� ���
	private static void consoleOutputEx() {
		//ǥ�� ��� (stdout) : System.out
		//ǥ�� ���� (stderr) : system.err
		//�޼��� print() ->��� �� ������ ���� ����
		//�޼��� print() -> ��� �� ����
		//printf -> ������� ->String �׸񿡼� ����
		
		System.out.println("Hello");//���� ����
		System.out.println("Java");//���� ��
		System.out.println("New Line");
		//�̽����̽� ���� 
		//\n(개행), \t(탭), \"(����ǥ), \\(��������)
		System.out.println(("Hello \nJava"));
		
		System.out.println("Hello \t\tJava");//��
		System.out.println("Hello \"Java\"");
		
		String filePath = "D:\tmyfolder\tmyfile.txt";
		System.out.println(filePath);
	}
}
