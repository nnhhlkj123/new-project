package ShakerShort;

import java.util.Scanner;



public class Shaker {
	public static void Swap(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
	public static void InsertSort(int A[],int n) {
		int x,p;
		for(int i=1;i<=n;i++) {
			x=A[i];
			p=i-1;
			while(p>=0&&A[p]>x) {
				A[p+1]=A[p];
				p--;
			}
			A[p+1]=x;
		}
	}
	public static void shaker(int A[],int n){
		int l=0; int r=n-1; int k=n;
		while(l>r) {
			for(int i=r; r>l; i--) {
				if(A[i]<A[i-1]) {
					Swap(A[i],A[i-1]);
					k=i;
				}
			}
			for(int j=l ; j<r; j++) {
				if(A[j]>A[j+1]) {
					Swap(A[j],A[j+1]);
					k=j;
				}
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
		
		for(int i=0;i<n;i++) {
			System.out.println(A[i]+" ");
		}
	}

}
