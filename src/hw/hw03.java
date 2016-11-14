package hw;

import java.util.*;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		int sum=0;
		System.out.println(fun(sum, sum));
	}

	public static int fun(int m,int n) {
		if (m > n) {
			return (m * fun(m - 1, n) / (n * fun(n - 1, n) * (m - n) * fun(m - n - 1, n)));
		}else{
			return 0;
		}
	}
}