package com.bihu.utils;

import java.util.Random;
import java.util.Scanner;

public class CommonUtils {
	private static Scanner in = new Scanner(System.in);
	private static Random random =new Random();
	public static int random(int n){
		return random.nextInt(n);
	}
	public static int random(int a,int b){
		return a+random.nextInt(b+1-a);
	}
	public static Scanner getScanner(){
		return in;
	}
}
