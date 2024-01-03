package com.javaex.ex04;

import java.util.Scanner;

public class PointApp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Point num = new Point();
		
		while(true) {
			System.out.print("x값을 입력하세요: ");
			int n = sc.nextInt();
			System.out.print("y값을 입력하세요: ");
			int n2 = sc.nextInt();
			
			num.setX(n);
			num.setY(n2);
			
			num.draw();
			
			sc.nextLine();
			
			System.out.print("종료하시겠습니까 ?(y/n)");
			String w = sc.nextLine();
			
			if(w.equals("y")) {
				System.out.println("종료.");
				break;
			}
		}
		
		
		sc.close();
		
	}

}
