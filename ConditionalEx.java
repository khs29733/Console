package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {
	public static void main(String[] args) {
	//ifEx();
	//ifElseEx();
	//	ifPractice();
	//	switchEx();
	//switchEx2();
	//	switchEx3();
		ifPractice2();	
	
	}
	private static void ifPractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		
		int score = sc.nextInt();
		/*
		if(score % 3 == 0) {
			//3의 배수
			System.out.println(score + "는 3의 배수입니다");
		}else {
			System.out.println(score + "는 3의 배수가 아닙니다");
		}
		sc.close();
		*/
		System.out.println(score % 3 == 0 ?"3의 배수입니다" :"3의 배수가 아닙니다" );
		
		sc.close();
	}
	//java의 case문에느느 char, String도 점검할 수 있다
	//요일 변수 : 지정된 범위의 값만 들어와야 한다
	//문자열 사용을 자제하도록하자(오타의 위험성) -> enum 데이터 타입으로 변경하는게 좋다
	private static void switchEx3() {
		String day = "TUE";
		String message = ""; //결과변수
		
		switch(day) {
		case "Sun" :
			message = "일요일";
			break;
		case "Mon" :
		case "Tue" :
		case "Wed" :
		case "Thu" :
			message = "열공";
		case "Fri" :
			message = "불금";
		case "Sat" :
			message = "주말";
		default :
			message = "?";
			
		}
		System.out.println(day + "에는" + message);
	}
	//월,일을 입력받아 해당월의 일수를 출력하는 프로그램 작성
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은" + "월은 31일입니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다");
			break;
			default : 
				System.out.println("?");
		}
		scanner.close();
	}
	
	//switch ~ case
	private static void switchEx() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요\n(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.println("과목 번호 :");
		int code = scanner.nextInt();
		
		switch (code) {
			case 1 :
				System.out.println("R101입니다");
				break;
			case 2 : 
				System.out.println("R202입니다");
				break;
			case 3 :
				System.out.println("R303입니다");
				break;
			case 4 : 
				System.out.println("R404입니다");
				break;
			default : 
				System.out.println("관리자에게 문의하세요");
	}
		scanner.close();
		
		//이 뒤에서는 scanner의 메서드를 사용할 수 없다
		
	}
	//연습문제
	//이 연습문제 같은 경우 switch문으로 더 깔끔하게 작성 가능
	//switch문의 default는 해당 내용이 없을 때 실행내용 
	//case와 break는 짝꿍이다
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요\n(1.자바 2.c 3.c++ 4.파이썬)");
		System.out.println("과목 번호 :");
		int code = scanner.nextInt();
		
		if(code == 1) {
			System.out.println("R101호 입니다");
		}else if(code == 2){
			System.out.println("R202호 입니다");
		}else if(code == 3) {
			System.out.println("R303호 입니다");
		}else if(code == 4) {
			System.out.println("R404호 입니다");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		scanner.close();
	}
	
	
	//if ~ else if ~else문
	private static void ifElseEx() {
		//숫자를 입력받아 숫자가 
		//0보다 크면 양수 영보다 작으면 음수 0일때는 0입니다를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num =scanner.nextInt();//정수입력
		/*
		if (num > 0 ) {
			System.out.println("양수입니다");
		}else if(num < 0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
		scanner.close();
	}
	*/
		
		//중첩 if : if문은 중첩될 수 있다
		if ( num == 0) {
			System.out.println("0입니다");
		}else {			//	!=0
			if(num > 0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다.");
			}
		}
		}
		//if문의 중첩이 3단계 이상이면 의심해보자
	//if 분기문
	private static void ifEx(){
		//점수를 
		//입력받아
		//점수가
		//60점 이상이면 합격입니다." 를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			//거짓이다
			System.out.println("불합격입니다");
		}
		scanner.close();
	
	}
}
