package ShakerShort;

public class QuickShort {
	public static void Swap(int a,int b)
	{
		int tmp=a;
		a=b;
		b=tmp;
	}
	public static void Short(int A[],int l,int r) {
		int i,j;
		int m=(l+r)/2;
		int x=A[m];
		i=l; j=r;
		while(i<j) {
			while(A[i]<x)
				i++;
			while(A[j]>x)
				j--;
			if(i<j)
				Swap(A[i],A[j]);
		}
	}
}
