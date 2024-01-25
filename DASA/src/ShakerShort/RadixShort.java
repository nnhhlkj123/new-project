package ShakerShort;

import java.util.Scanner;

public class RadixShort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int []a = new int[n];
    	for(int i = 0; i < n; i++)
    	{
    		a[i] =sc.nextInt();
    	}
    	int chuSo=1;
    	int kt=0;
    	int i=0;
    	while(kt<n) {
    		int so=chia10NLan(chuSo,a[i]);
    		
    	}
	}
	public static int chia10NLan(int n,int so) {
		int kq=0;
		for(int i=1; i<=n;i++) {
			kq=so%10;
			so=so/(10*i);
		}
		return kq;
	}
}
