package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song();

		iu.setAlbum("Real");
		iu.setArtist("아이유");
		iu.setComposer("이민수");
		iu.setTitle("좋은날");
		iu.setTrack(3);
		iu.setYear(2010);

		Song bigbang = new Song();
		
		bigbang.setAlbum("Always");
		bigbang.setArtist("BIGBANG");
		bigbang.setComposer("G-DRAGON");
		bigbang.setTitle("거짓말");
		bigbang.setTrack(2);
		bigbang.setYear(2007);

		Song busker = new Song();
		
		busker.setAlbum("버스커버스커1집");
		busker.setArtist("버스커버스커");
		busker.setComposer("장범준");
		busker.setTitle("벚꽃엔딩");
		busker.setTrack(4);
		busker.setYear(2012);

		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();

		// TEST용
//		System.out.println(iu.toString());
//		System.out.println(bigbang.toString());
//		System.out.println(busker.toString());

	}

}
