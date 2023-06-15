package com.tech.m1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoumCount4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하세요.");
		String str = sc.nextLine();
		System.out.println(str);

//		정규식 사용2
		int cnt = 0;
		int i = 0;
		while (i < str.length()) {
			// char형식을 스트링으로 변환
			if (String.valueOf(str.charAt(i)).matches("[aeiouAEIOU]+")) {
				cnt++;
			}
			i++;
		}
		System.out.println("모음 갯수 : "+ cnt);
	}

}
