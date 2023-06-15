package com.tech.m1;

import java.util.Scanner;

public class MoumCount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("영어를 입력하세요.");
		String word = sc.nextLine();

		countmoum(word);
	}

	public static void countmoum(String word) {

		int cnt = 0;
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);
			
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				cnt++;
				break;

			default:
				break;
			}
		}

		System.out.println("입력받은 문자는 : " + word);
		System.out.println("모음의 갯수는 : " + cnt);

	}

}
