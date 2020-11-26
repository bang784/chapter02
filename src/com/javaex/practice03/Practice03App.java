package com.javaex.practice03;

public class Practice03App {

	public static void main(String[] args) {
		
		Practice03 s1 = new Practice03();
		s1.setAlbum("Real");
		s1.setArtist("아이유");
		s1.setComposer("이민수");
		s1.setTitle("좋은날");
		s1.setTrack(3);
		s1.setYear(2010);
		
		s1.showInfo();
		
		Practice03 s2 = new Practice03();
		s2.setAlbum("Always");
		s2.setArtist("BIGBANG");
		s2.setComposer("G-DRAGON");
		s2.setTitle("거짓말");
		s2.setTrack(2);
		s2.setYear(2007);
		
		s2.showInfo();
		
		Practice03 s3 = new Practice03();
		s3.setAlbum("버스커버스커1집");
		s3.setArtist("버스커버스커");
		s3.setComposer("장범준");
		s3.setTitle("벚꽃엔딩");
		s3.setTrack(4);
		s3.setYear(2012);
		
		s3.showInfo();
		
		
	}
		
	}
	

