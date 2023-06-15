package com.tech.m1;

import java.util.Scanner;

public class MoumCount2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하세요.");
		String str = sc.nextLine();
		System.out.println(str);

		int cnt = 0;
		str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
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
		System.out.println("입력하신 단어는" + str);
		System.out.println("모음 갯수는" + cnt);

	}

}
