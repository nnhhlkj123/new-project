package ShakerShort;

import java.util.Scanner;

public class ShellShort {
	public static void Swap(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
	public static void ShellShort(int A[],int n,int H[], int k) {
		int step,i,j,x,len;
		for(step =0; step<k; step++) {
			len=H[step];
			for(i=len;i<n;i++) {
				x=A[i];
				j=i-len;
				while(x<A[j]&&j>=0) {
					A[j+len]=A[j];
					j=j-len;
				}
				A[j+len]=x;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(A[i]+" ");
		}
	}
}
