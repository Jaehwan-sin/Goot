package com.tech.m1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoumCount3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하세요.");
		String str = sc.nextLine();
		System.out.println(str);

//		정규식 사용
		Pattern pattern = Pattern.compile("[aeiouAEIOU]"+"");
		Matcher matcher = pattern.matcher(str);
		
		int cnt = 0;
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
