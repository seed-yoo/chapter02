package com.javaex.practice;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song("Real", "아이유", "이민수", "좋은날", 3, 2010);

		Song bigbang = new Song("Always", "BIGBANG", "G-DRAGON", "거짓말", 2, 2007);

		Song busker = new Song("버스커버스커1집", "버스커버스커", "장범준", "벚꽃엔딩", 4, 2012);

		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();

		// TEST용
//		System.out.println(iu.toString());
//		System.out.println(bigbang.toString());
//		System.out.println(busker.toString());

	}

}
