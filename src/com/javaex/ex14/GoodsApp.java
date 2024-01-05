package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {

		// 배열 만들기
		Goods[] goodsArray = new Goods[3];

		// 상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);

		// 배열에 상품 넣기
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;

		/*
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[1].getPrice());
		System.out.println(goodsArray[2]);
		
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		*/
		
		int count = 0;
		for (int i = 0; i < goodsArray.length; i++) {
			if(goodsArray[i] != null) {
				// 카운트+
				goodsArray[i].showInfo();
				
				/*
				// 둘다 같은 뜻 표현만 다르다.
				sum = sum + 2
				sum += 2
				
				 */
				count++;
			}
		}
		System.out.println("제품 개수: " + count);
	}
}
