package ex;

import java.util.*;

public class ex04 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println(fun(a));
	}

	public static int fun(int x) {
		if (x == 1) {
			return x;
		} else {
			return x * fun(x - 1);
		}
	}
}
