package DSLKD;

import DSLK.main.Node;

public class DSLKD {
	public static void main(String[] args) {
		//List lkd=new List();
		//lkd.add(1);
		//lkd.add(2);
		//lkd.add(3);
		//lkd.deleteLastNode();
		//lkd.deleteFirstNode();
		//lkd.deleteNodeX(2);
		//lkd.XuatDSLKD();
		List lkdTest=new List();
		lkdTest.add(5);
		lkdTest.add(6);
		lkdTest.add(1);
		lkdTest.add(2);
		lkdTest.add(3);
		lkdTest.add(7);
		lkdTest.add(4);
		lkdTest.XuatDSLKD();
		lkdTest.Short();
		lkdTest.XuatDSLKD();
	}
	public static class Node {
		int info;
		Node pNext;
		Node pPre;
		
		public Node(int info) {
			this.info=info;
			this.pNext=null;
			this.pPre=null;
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
			
	}
		public void Short() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null)
				return;
			Node cur=pHead;
			while(cur.pNext!=null) {
				Node run=cur.pNext;
			
				while(run!=null) {
					if(run.info<cur.info) {
						SwapNode(cur,run);
						//Node tmp=cur;
						//cur=run;
						//run=tmp;
					}
					
					run=run.pNext;
				}
				System.out.println();
				XuatDSLKD();
				cur=cur.pNext;
			}
		}
		public void XuatDSLKD() {
			if(pHead==null&&pTail==null)
			{
				System.out.print("Danh sach rong");
				return;
			}
			Node a=pHead;
			while(a!=null)
			{
				System.out.print(a.info+" ");
				a=a.pNext;
			}
		}
		public void add(int x) {
			Node add=new Node(x);
			if(pHead==null&&pTail==null)
			{
				pHead=add;
				pTail=add;
				return;
			}
			add.pPre=pTail;
			pTail.pNext=add;
			pTail=add;
		}
		public void addFirst(int x) {
			Node add=new Node(x);
			if(pHead==null&&pTail==null)
			{
				pHead=add;
				pTail=add;
				return;
			}
			add.pNext=pHead;
			pHead.pPre=add;
			pHead=add;
		}
		public void addNodeXBeforeNodeY(int x,int y) {
			if(pHead==null&&pTail==null)
				return;
			Node add=new Node(x);
			Node cur=pHead;
			while(cur!=null)
			{
				if(cur.info==y)
				{
					add.pNext=cur;
					add.pPre=cur.pPre;
					cur.pPre.pNext=add;
					cur.pPre=add;
					return;
				}
				cur=cur.pNext;
			}
		}
		public void addNodeXAfterNodeY(int x,int y) {
			if(pHead==null&&pTail==null)
				return;
			Node add=new Node(x);
			Node cur=pHead;
			while(cur!=null)
			{
				if(cur.info==y)
				{
					add.pPre=cur;
					add.pNext=cur.pNext;
					cur.pNext.pPre=add;
					cur.pNext=cur;
					return;
				}
				cur=cur.pNext;
			}
		}
		public void deleteLastNode() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null) {
				pHead=null;
				pTail=null;
				return;
			}
			pTail=pTail.pPre;
			pTail.pNext.pPre=null;
			pTail.pNext=null;
		}
		public void deleteFirstNode() {
			if(pHead==null)
				return;
			if(pHead.pNext==null&&pTail.pPre==null) {
				pHead=null;
				pTail=null;
				return;
			}
			pHead=pHead.pNext;
			pHead.pPre.pNext=null;
			pHead.pPre=null;
		}
		public void deleteNodeX(int x) {
			if(pHead==null)
				return;
			if(pHead.info==x) {
				deleteFirstNode();
				return;
			}
			if(pTail.info==x) {
				deleteLastNode();
				return;
			}
			Node cur=pHead;
			while(cur!=null) {
				if(cur.info==x)
				{
					cur.pNext.pPre=cur.pPre;
					cur.pPre.pNext=cur.pNext;				
				}
				cur=cur.pNext;
			}
		}
		public void deleteNodeXBeforeNodeY(int x) {
			if(pHead==null||pHead.info==x||(pHead.pNext==null&&pTail.pPre==null))
				return;
			Node cur=pHead;
			while(cur!=null) {
				if(cur.info==x) {
					deleteNodeX(cur.pPre.info);
				}
			}
		}
		public void deleteNodeXAfterNodeY(int x) {
			if(pHead==null||pTail.info==x||(pHead.pNext==null&&pTail.pPre==null))
				return;
			Node cur=pHead;
			while(cur!=null) {
				if(cur.info==x) {
					deleteNodeX(cur.pNext.info);
				}
			}
		}
	}
}