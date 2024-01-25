package FinalExam;

public class main {
	public static void main(String[] args) {
		DSSV d1=new DSSV();
		InFoSV sv1=new InFoSV("12abcd","Nguyen Van A",8.0);
		InFoSV sv2=new InFoSV("13abcd","Nguyen Van B",7.5);
		InFoSV sv3=new InFoSV("14abcd","Nguyen Thi C",9.0);
		InFoSV sv4=new InFoSV("15abcd","Nguyen Thi D",8.5);
		InFoSV sv5=new InFoSV("16abcd","Nguyen Van E",4.0);
		InFoSV sv6=new InFoSV("17abcd","Nguyen Van F",3.25);
		InFoSV svAdd1=new InFoSV("113abcd","Tran Van A",5.25);
		InFoSV svAdd2=new InFoSV("123abcd","Tran Van B",6.25);
		d1.themSVVaoDSSV(sv1);
		d1.themSVVaoDSSV(sv2);
		d1.themSVVaoDSSV(sv3);
		d1.themSVVaoDSSV(sv4);
		d1.themSVVaoDSSV(sv5);
		d1.themSVVaoDSSV(sv6);
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 2:  ");
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 3:  ");
		d1.xuatDSSVDTBLH5();;
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 4:  ");
		Node timSV=d1.timSVCoMSSVX("14abcd");
		if(timSV!=null) {
			System.out.println("Tim thay:");
			System.out.println("MSSV: "+timSV.info.mSSV);
			System.out.println("Ho va ten: "+timSV.info.hoVaTen);
			System.out.println("Diem TB: "+timSV.info.diemTB);
		}
		else {
			System.out.println("Khong tim thay");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 5:  ");
		//d1.sapXepDSSVDTBTangDan();
		//d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 6:  ");
		d1.themSVVaoSauSVMSSVX(sv2,svAdd1);
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 7:  ");
		d1.xoaSVDauDSSV();
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 8:  ");
		d1.xoaSVCuoiDSSV();
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 9:  ");
		d1.xoaSVMSSVX("113abcd");
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
		System.out.println("Cau 10:  ");
		d1.xoaToanBoDSSV();
		d1.xuatDSSV();
		System.out.println("-------------------------------------------------");
	}
	public static class  InFoSV{
		String mSSV;
		String hoVaTen;
		double diemTB;
		
		public InFoSV(String mSSV,String hoVaTen, double diemTB) {
			this.mSSV=mSSV;
			this.hoVaTen=hoVaTen;
			this.diemTB=diemTB;
		}
	}
	public static class Node {
		InFoSV info;
		Node pPre;
		Node pNext;
		
		public Node(InFoSV info) {
			this.info=info;
			this.pNext=null;
			this.pPre=null;
		}
	}
	public static class DSSV{
		Node pHead;
		Node pTail;
		
		public DSSV() {
			this.pHead=null;
			this.pTail=null;
		}
		public void xuatDSSV() {
			if(pHead==null)
			{
				System.out.println("Danh sach khong co sinh vien nao");
				return;
			}
			int i=1;
			Node cur=pHead;
			while(cur!=null)
			{
				System.out.println("sv"+i+": ");
				System.out.println("MSSV:  "+cur.info.mSSV);
				System.out.println("Ho Va Ten:  "+cur.info.hoVaTen);
				System.out.println("Diem TB:  "+cur.info.diemTB);
				cur=cur.pNext;
				i++;
			}
		}
		public void themSVVaoDSSV(InFoSV sv) {
			Node them=new Node(sv);
			if(pHead==null)
			{
				pHead=them;
				pTail=them;
				return;
			}
			pTail.pNext=them;
			them.pPre=pTail;
			pTail=them;
		}
		public void xuatDSSVDTBLH5() {
			if(pHead==null)
			{
				System.out.println("Khong co sinh vien nao diem trung binh > 5");
				return;
			}
			int i=1;
			Node cur=pHead;
			while(cur!=null)
			{
				if(cur.info.diemTB>5) {
					System.out.println("sv"+i+": ");
					System.out.println("MSSV:  "+cur.info.mSSV);
					System.out.println("Ho Va Ten:  "+cur.info.hoVaTen);
					System.out.println("Diem TB:  "+cur.info.diemTB);
				}
				i++;
				cur=cur.pNext;
			}
		}
		public Node timSVCoMSSVX(String x) {
			if(pHead==null)
				return null;
			Node cur=pHead;
			while(cur !=null) {
				if(cur.info.mSSV.equals(x)) {
					return cur;
				}
				cur=cur.pNext;
			}
			return null;
		}
		public void themSVVaoDauDSSV(InFoSV sv) {
			Node them=new Node(sv);
			if(pHead==null) {
				pHead=them;
				pTail=them;
				return;
			}
			pHead.pPre=them;
			them.pNext=pHead;
			pHead=them;
		}
		public void swapNode(Node a, Node b) {
			Node tmp;
			if(a.pNext==b) {
				if(a==pHead&&b==pTail) {
					tmp=a;
					a.pNext=null;
					a.pPre=b;
					b.pPre=null;
					b.pNext=a;
					pHead=b;
					pTail=a;
					System.out.println(1);
					return;
					
				}
				if(a==pHead) {
					b.pNext.pPre=a;
					tmp=b.pNext;
					b.pPre=null;
					b.pNext=a;
					a.pPre=b;
					a.pNext=tmp;
					pHead=b;
					System.out.println(2);
				}
				else if(b==pTail) {
					tmp=b;
					b.pPre=a.pPre;
					a.pNext=null;
					b.pNext=a;
					a.pPre=b;
					b.pPre.pNext=b;
					pTail=a;
					System.out.println(3);
				}
				else {
					tmp=b;
					a.pNext=b.pNext;
					b.pPre=a.pPre;
					a.pPre=b;
					b.pNext=a;
					b.pPre.pNext=b;
					a.pNext.pPre=a;
					System.out.println(4);
				}
			}
			else {
				if(a==pHead&&b==pTail) {
					a.pPre=b.pPre;
					a.pNext.pPre=b;
					b.pNext=a.pNext;
					a.pNext=null;
					b.pPre.pNext=a;
					b.pPre=null;
					pHead=b;
					pTail=a;
					return;
				}
				if(a==pHead) {
					tmp=b;
					a.pNext.pPre=b;
					a.pPre=b.pPre;
					b.pPre.pNext=a;
					b.pNext.pPre=a;
					b.pNext=a.pNext;
					a.pNext=tmp.pNext;
					b.pPre=null;
					pHead=b;
				}
				else if(b==pTail) {
					tmp=a;
					b.pNext=a.pNext;
					a.pPre.pNext=b;
					a.pNext.pPre=b;
					a.pPre=b.pPre;
					a.pNext=null;
					b.pPre=tmp.pPre;
					b.pNext=tmp.pNext;
					pTail=a;
				}
				else {
					tmp=a;
					a.pNext=b.pNext;
					a.pPre=b.pPre;
					b.pPre.pNext=a;
					b.pNext.pPre=a;
					b.pNext=tmp.pNext;
					b.pPre=tmp.pPre;
					b.pPre.pNext=b;
					b.pNext.pPre=b;
				}
			}
		
		}
		public void sapXepDSSVDTBTangDan() {
			Node cur=pHead;
			Node run=pHead.pNext;
			while(cur.pNext!=null) {
				while(run!=null) {
					if(run.info.diemTB<cur.info.diemTB) {
						swapNode(cur,run);
						System.out.println(cur.info.diemTB);
						
						System.out.println(run.info.diemTB);
						//Node tmp=cur;
						//cur=run;
						//run=tmp;
					}
					xuatDSSV();
					System.out.println(cur.info.diemTB);
					
					System.out.println(run.info.diemTB);
					run=run.pNext;
					System.out.println("a");
				}
				cur=cur.pNext;
				System.out.println(cur.info.diemTB+"b");
			}
		}
		public void themSVVaoSauSVMSSVX(InFoSV x,InFoSV y) {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null&&pHead.info==x) {
				themSVVaoDSSV(x);
				return;
			}
			Node tThem=timSVCoMSSVX(x.mSSV);
			Node them=new Node(y);
			if(tThem!=null) {
				them.pPre=tThem;
				them.pNext=tThem.pNext;
				tThem.pNext.pPre=them;
				tThem.pNext=them;
			}
		}
		public void xoaSVDauDSSV() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null)
			{
				pHead=null;
				pTail=null;
				return;
			}
			pHead=pHead.pNext;
			pHead.pPre=null;
		}
		public void xoaSVCuoiDSSV() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null)
			{
				pHead=null;
				pTail=null;
				return;
			}
			pTail=pTail.pPre;
			pTail.pNext=null;
		}
		public void xoaSVMSSVX(String x) {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null||pHead.info.mSSV.equals(x)) {
				xoaSVDauDSSV();
				return;
			}
			if(pTail.info.mSSV.equals(x)) {
				xoaSVCuoiDSSV();
				return;
			}
			Node xoa=timSVCoMSSVX(x);
			xoa.pPre.pNext=xoa.pNext;
			xoa.pNext.pPre=xoa.pPre;
			xoa.pPre=null;
			xoa.pNext=null;
		}
		public void xoaToanBoDSSV() {
			pHead=null;
			pTail=null;
		}
	}
}
