package com.tech.m1;

import java.util.Random;

public class ArrayMaxPos {
	public static void main(String[] args) {
		int[] num = new int[10];
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100) + 1;
			System.out.println(num[i]);
		}

		int max = num[0];
		int maxindex = 0;
		int min = num[0];
		int minindex = 0;

		for (int i = 1; i < num.length; i++) {

			if (max < num[i]) {
				max = num[i];
				maxindex = i + 1;
			}
			if (min > num[i]) {
				min = num[i];
				minindex = i + 1;
			}
		}
		System.out.println("최대값 : " + max + " 최대값의 위치는 : " + maxindex);
		System.out.println("최소값 : " + min + " 최소값의 위치는 : " + minindex);
	}
}
