package DSLK;


public class List {
	Node pHead;
	Node pTail;
	
	public void main(String[] args) {
		List list=new List();
		ThemVaoCuoi(5);
		ThemVaoCuoi(6);
		XuatList();
	}
	public List() {
		this.pHead=null;
		this.pTail=null;
	}
	public void XuatList() {
		if(pHead==null) {
			System.out.print("List rong");
			return;
		}
		if(pHead.pNext==null&&pTail.pNext==null) {
			System.out.print(pHead.info);
		}
		Node ht=pHead;
		while(ht.pNext!=null) {
			System.out.print(ht.info+" ");
			ht=ht.pNext;
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
	public void ThemVaoSauNodeY(int y,int x) {
		Node them=new Node(x);
		Node ht=pHead;
		while(ht.pNext!=null) {
			if(ht.info==y) {
				them.pNext=ht.pNext;
				ht.pNext=them;
			}
			else
				ht=ht.pNext;
		}
	}
	public void ThemVaoTruocNodeY(int y,int x) {
		Node them=new Node(x);
		Node ht=pHead;
		Node sauht=pHead.pNext;
		while(ht.pNext!=null&&sauht.pNext!=null) {
			if(sauht.info==y) {
				ht.pNext=them;
				them.pNext=sauht;
			}
			else {
				ht=ht.pNext;
				sauht=sauht.pNext;
			}
		}
	}
	public void XoaNodeDau() {
		Node tam=pHead;
		pHead.pNext=null;
		pHead=tam.pNext;
	}
	public void XoaNodeCuoi() {
		Node ht=pHead;
		Node sauht=pHead.pNext;
		while(sauht.pNext!=null) {
			ht=ht.pNext;
			sauht=sauht.pNext;
		}
		ht.pNext=null;
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
	public boolean XoaTatCaNodeYDangTruocNodeX(int y, int x ) {
		if(pHead==null||pHead.pNext==null&&pTail.pNext==null) 
			return false;
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
				else {
					tht=tht.pNext;
					ht=ht.pNext;
				}
		}
			return kt;
	}
}
	public void SwapNode(Node t, Node s) {
			Node tmp=t;
			t=s;
			s=tmp;
		if(t==pHead)
			pHead=s;
		if(s==pTail)
			pTail=t;
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
//1 5 1 5 1 5