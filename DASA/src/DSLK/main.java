package DSLK;

public class main {
	public static void main(String[] args) {
		List list=new List();
		list.ThemVaoCuoi(5);
		list.ThemVaoCuoi(1);
		list.ThemVaoCuoi(6);
		list.ThemVaoCuoi(2);
		list.ThemVaoCuoi(3);
		list.ThemVaoCuoi(7);
		list.ThemVaoCuoi(4);
		list.XuatList();
		list.Short();
		System.out.println();
		//list.XuatList();
		//System.out.println(list.pHead.info);
		/*List listTest=new List();
		listTest.ThemVaoCuoi(1);
		listTest.ThemVaoCuoi(2);
		listTest.ThemVaoCuoi(3);
		listTest.ThemVaoCuoi(4);
		listTest.ThemVaoCuoi(5);
		Node a1=new Node(1);
		Node a2=new Node(2);
		a1.pNext=a2;
		System.out.println("a1= "+a1.info);
		System.out.println("a1.pNext= "+a1.pNext);
		System.out.println("a2= "+a2.info);
		System.out.println("a2.pNext= "+a2.pNext);
		listTest.SwapNode(a1,a2);
		System.out.println("a1= "+a1.info);
		System.out.println("a1.pNext= "+a1.pNext);
		System.out.println("a2= "+a2.info);
		System.out.println("a2.pNext= "+a2.pNext);*/
		//list.XuatList();
		//System.out.println();
		//boolean kt=list.XoaTatCaNodeYDangSauNodeX(6, 5);
		//Node mid=list.TimNodeOGiua();
		//System.out.println(kt);
		//list.XuatList();
		//System.out.print(mid.info);
	}
	public static class Node {
		int info;
		Node pNext;
		
		public Node(int info) {
			this.info=info;
			this.pNext=null;
		}
	}
	public static class List {
		Node pHead;
		Node pTail;
		
		public List() {
			this.pHead=null;
			this.pTail=null;
		}
		public void SwapNode(Node t, Node s) {
			Node a=TimNodeTruocNodeX(pTail);
			Node tmp=new Node(0);
			tmp.info=t.info;
			tmp.pNext=t.pNext;
			t.info=s.info;
			t.pNext=s.pNext;
			s.info=tmp.info;
			s.pNext=tmp.pNext;
			if(t.pNext!=null) {
				//if(t.pNext.info==s.info) {
				//	t.pNext=s;
				//}
				//else {
					s.pNext.pNext=t.pNext.pNext;
					t.pNext.pNext=s;
				//}
			}
			else{
					a.pNext=null;
					t.pNext=s;
				}
			if(s.info==pHead.info) {
				System.out.println("Head  ");
				pHead=t;
			}
			if(t.info==pTail.info) {
				System.out.println("Tail  ");
				pTail=s;
			}
		}
		public void XuatList() {
			if(pHead==null) {
				System.out.print("List rong");
				return;
			}
			if(pHead.pNext==null&&pTail.pNext==null) {
				System.out.print(pHead.info);
				return;
			}
			Node ht=pHead;
			while(ht.pNext!=null) {
				System.out.print(ht.info+" ");
				ht=ht.pNext;
			}
			System.out.print(ht.info);
		}
		public Node TimNodeTruocNodeX(Node x) {
			if(pHead==null)
				return null;
			if(pHead.pNext==null&&pTail.pNext==null)
				return null;
			if(pHead.info==x.info)
				return null;
			Node ht=pHead;
			Node kq=null;
			while(ht.pNext!=null)
			{
				if(ht.pNext.info==x.info) {
					kq=ht;
					break;
				}
				ht=ht.pNext;
			}
				if(pTail.info==x.info)
					kq=ht;
			return kq;
		}
		public void Short() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pNext==null)
				return;
			Node cur=pHead;
			while(cur.pNext!=null) {
				Node run=cur.pNext;
			
				while(run!=null) {
					if(run.info<cur.info) {
						SwapNode(cur,run);
					}
					
					run=run.pNext;
				}
				cur=cur.pNext;
			}
		}
		public boolean XoaTatCaNodeYDangSauNodeX(int y, int x ) {
			if(pHead==null||pHead.pNext==null&&pTail.pNext==null) 
				return false;
			else if(pHead.pNext==pTail){
				pHead=new Node(x);
				pTail=pHead;
				return true;
			}
			else {
				boolean kt=false;
				Node tht=pHead;
				Node ht=pHead.pNext;		
				while(tht.pNext!=null&&ht.pNext!=null) {
					if(ht.info==y&&tht.info==x) {
						tht.pNext=ht.pNext;
						ht.pNext=null;
						kt=true;
					
					}
						tht=tht.pNext;
						ht=tht.pNext;
			}
				if(ht.info==y&&tht.info==x)
				{
					tht.pNext=ht.pNext;
					ht.pNext=null;
					kt=true;
				}
				return kt;
		}
	}
		public void Tao(int x) {
			Node a=new Node(x);
		}
		public void ThemVaoCuoi(int x) {
			Node them=new Node(x);
			if(pHead==null&&pTail==null) {
				pHead=them;
				pTail=them;
			}
			else {
				pTail.pNext= them;
				pTail=them;
			}
		}
		public Node TimNodeOGiua() {
			int i=0;
			if(pHead==null)
				return null;
			if(pHead.pNext==null&&pTail.pNext==null)
				return pHead;
			Node dem=pHead;
			while(dem!=pTail)
			{
				i++;
				dem=dem.pNext;
			}
			i++;
			int dem1=(i-1)/2;
			i=0;
			dem=pHead;
			while(dem.pNext!=null)
			{
				if(i==dem1)
					break;
				i++;
				dem=dem.pNext;
			}
			return dem;
		}
		public void Tim1(int x) {
			Node ht=pHead;
			int dem=0;
			int kq=-1;
			while(ht.pNext!=null) {
				if(ht.info==x) {
					kq=dem;
				}
				else {
					ht=ht.pNext;
				}
			}
			System.out.print(dem);
		}
		public void Tim2(int x) {
			Node ht=pHead;
			int dem=0;
			int kq=-1;
			while(ht.pNext!=null) {
				if(ht.info==x) {
					kq=dem;
				}
				else {
					ht=ht.pNext;
				}
			}
			if(dem!= -1)
				System.out.print("Tim thay Node");
			else
				System.out.print("null");
		}
		public void ThemVaoDau(int x) {
			Node them=new Node(x);
			if(pHead==null&&pTail==null) {
				pHead=them;
				pTail=them;
			}
			else {
			them.pNext= pHead;
			pHead=them;
			}
		}
		public void ThemVaoSau1NodeY(int y,int x) {
			Node them=new Node(x);
			Node ht=pHead;
			if(pTail.info==them.info) {
				pTail.pNext= them;
				pTail=them;
				return;
			}
				while(ht.pNext!=null) {
					if(ht.info==y) {
						them.pNext=ht.pNext;
						ht.pNext=them;
						return;
				}
					else
						ht=ht.pNext;
				}
		}
		public void ThemVaoTruocNode1Y(int y,int x) {
			Node them=new Node(x);
			Node ht=pHead;
			Node sauht=pHead.pNext;
			if(ht.info==them.info) {
				them.pNext=pHead;
				pHead=them;
				return;
			}
				while(sauht.pNext!=null) {
					if(sauht.info==y) {
						ht.pNext=them;
						them.pNext=sauht;
						return;
				}
					else {
						ht=ht.pNext;
						sauht=sauht.pNext;
					}
				}
		}
		public void ThemVaoSauNodeY(int y,int x) {
			Node them=new Node(x);
			Node ht=pHead;
			if(pTail.info==them.info) {
				pTail.pNext= them;
				pTail=them;
			}else {
				while(ht.pNext!=null) {
					if(ht.info==y) {
						them.pNext=ht.pNext;
						ht.pNext=them;
				}
					else
						ht=ht.pNext;
				}
			}
			
		}
		public void ThemVaoTruocNodeY(int y,int x) {
			Node them=new Node(x);
			Node ht=pHead;
			Node sauht=pHead.pNext;
			if(ht.info==them.info) {
				them.pNext=pHead;
				pHead=them;
			}
			else {
				while(sauht.pNext!=null) {
					if(sauht.info==y) {
						them.pNext=sauht;
						ht.pNext=them;
				}
					else {
						ht=ht.pNext;
						sauht=sauht.pNext;
					}
				}
			} 
		}
		public void XoaNodeDau() {
			if(pHead.pNext==null&&pTail.pNext==null) {
				pHead=null;
				pTail=null;
			}
			else {
				Node tam=pHead;
				pHead.pNext=null;
				pHead=tam.pNext;
			}
		}
		public void XoaNodeCuoi() {
			Node ht=pHead;
			Node sauht=pHead.pNext;
			if(pHead.pNext==null&&pTail.pNext==null) {
				pHead=null;
				pTail=null;
				return;
			}
			while(sauht.pNext!=null) {
				ht=ht.pNext;
				sauht=sauht.pNext;
			}
			ht.pNext=null;
			pTail=ht;
		}
		public void XoaNodeX(int x) {
			Node tht=pHead;
			Node ht=pHead.pNext;
			if(pHead.pNext==null&&pTail.pNext==null) {
				if(pHead.info==x)
				{
					pHead=null;
					pTail=null;
				}
			}
			else {
				if(tht.info==x)
					pHead=ht;
				while(tht.pNext!=null&&ht.pNext!=null) {
					if(ht.info==x) {
						tht.pNext=ht.pNext;
						ht.pNext=null;
						break;
					}
					else {
						tht=tht.pNext;
						ht=ht.pNext;
					}
				}
			}
		}
		public void XoaNodeDangTruocX(int x) {
			Node ttx=pHead;
			Node tx=pHead.pNext;
				
			while(ttx.pNext!=null&&tx.pNext!=null) {
				if(tx.pNext.info==x) {
					ttx.pNext=tx.pNext;
					tx.pNext=null;
					break;
				}
				else {
					ttx=ttx.pNext;
					tx=tx.pNext;
				}
			}
		}
		public void XoaNodeSauX(int x) {
			Node ht=pHead;
			Node sauht=pHead.pNext;
			while(ht.pNext!=null&&sauht.pNext!=null) {
				if(ht.info==x) {
					ht.pNext=sauht.pNext;
					sauht.pNext=null;
					break;
				}
				else {
					ht=ht.pNext;
					sauht=sauht.pNext;
				}
			}
		}
		public void UpdateNodeXBangY(int x,int y) {
			Node ht=pHead;
			while(ht.pNext!=null) {
				if(ht.info==x)
					ht.info=y;
				else
					ht=ht.pNext;
			}
		}
		public void XoaHetNodeSauX(int x) {
				Node ht=pHead;
				Node sauht=pHead.pNext;
				while(ht.pNext!=null&&sauht.pNext!=null) {
					if(ht.info==x) {
						ht.pNext=sauht.pNext;
						sauht.pNext=null;
						ht=ht.pNext;
						sauht=sauht.pNext;
					}
						ht=ht.pNext;
						sauht=sauht.pNext;
					}
				}
		public void XoaNodeDauTienX(int x) {
			Node ht=pHead;
			Node sauht=pHead.pNext;
			while(ht.pNext!=null&&sauht.pNext!=null) {
				if(ht.info==x) {
					ht.pNext=sauht.pNext;
					sauht.pNext=null;
				}
					ht=ht.pNext;
					sauht=sauht.pNext;
				}
		}
		public void XoaNodeCuoiCungX(int x) {
			Node ht=pHead;
			Node sauht=pHead.pNext;
			Node Xoaht=null;
			Node Xoasauht=null;
			while(ht.pNext!=null&&sauht.pNext!=null) {
				if(ht.info==x) {
					Xoaht=ht;
					Xoasauht=sauht;
				}
					ht=ht.pNext;
					sauht=sauht.pNext;
				}
			Xoaht.pNext=Xoasauht.pNext;
			Xoasauht.pNext=null;
		}
	}
}
