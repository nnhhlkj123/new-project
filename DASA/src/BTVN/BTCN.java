package BTVN;

import java.text.Collator;
import java.util.Locale;


public class BTCN {
	static Collator collator = Collator.getInstance(new Locale("vi", "VN"));
	
	public static boolean sslonhon(String a, String b) {
		int kq = collator.compare(a, b);
		return kq > 0;
	}
	public static void Bai1(String S) {
			int n = S.length();
			String[] A = new String[n];
			int dem = 0;
			String tmp = "";
			
			for(int i = 0;i < S.length();i++) {
				if(S.charAt(i)== ' ') {
					A[dem] = tmp;
					dem++;
					tmp = "";
				}
				else {
					tmp = tmp + S.charAt(i);
				}
			}
			A[dem] = tmp;
			dem++;
			

			for(int i = 1;i < dem;i++) {
				String tam = A[i];
				int pos  = i - 1;
				while(pos >= 0 && sslonhon(A[pos] , tam)) {
					A[pos + 1] = A[pos];
					pos--;
				}
				A[pos + 1] = tam;
			}
			
			for(int i = 0;i < dem;i++) {
				System.out.print(A[i] + " ");
			}
	}
	public static void Bai2(int A[],int n) {
		int[] C=new int[n]; int chan=0;
		int[] L=new int[n]; int le=0;
		for(int i=0;i<n;i++) {
			if(A[i]%2==0)
			{
				C[chan]=i;
				chan++;
			}
			else
			{
				L[le]=i;
				le++;
			}
		}
		int pos1, i1;
		int x1;
		for(i1=1 ; i1 <le ; i1++) 
		{
			x1 = A[L[i1]]; pos1 = i1-1;
		
		while((pos1 >= 0)&&(A[L[pos1]] > x1))
		{ 
		
			A[L[pos1+1]] = A[L[pos1]];
			pos1--;
			}
			A[L[pos1+1]] = x1;
		}
		int pos2, i2;
		int x2;
		for(i2=chan-2 ; i2 >=0 ; i2--) 
		{
			x2 = A[C[i2]]; pos2 = i2+1;
		
		while((pos2 < chan)&&(A[C[pos2]] > x2))
		{ 
		
			A[C[pos2-1]] = A[C[pos2]];
			pos2++;
			}
			A[C[pos2-1]] = x2;
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
	}	
		public static void Bai3(int A[],int n){
			int[] B=new int[100000000];
			for(int i=0;i<n;i++) {
				B[i]=0;
			}
			

			for(int i=0;i<n;i++) {
				B[A[i]]++;
			}
			int pos1, i1;
			int x1;
			for(i1=1 ; i1 <n ; i1++) 
			{
				x1 = A[i1]; pos1 = i1-1;
			
			while((pos1 >= 0)&&(B[A[pos1]] > B[x1]))
			{ 
				A[pos1+1] = A[pos1];
				pos1--;
				}
				A[pos1+1] =x1;
			}
			for(int i=0;i<n;i++) {
				System.out.print(+A[i]+" ");
			}
		}
	public static void main(String[] args) {
		String test1= "hôm nay tôi có tiết học nhưng tôi lười và cúp";
		Bai1(test1); System.out.println();
		
		int[] a1 = {2, 5, 1, 4, 11, 10, 6, 8, 9}; 
		int n1 = 9;
		Bai2(a1, n1); System.out.println();
		int[] a2 = {2, 5, 1, 2, 9, 2, 6, 8, 9};
		int n2 = 9;
		Bai3(a2,n2);
	}
}
