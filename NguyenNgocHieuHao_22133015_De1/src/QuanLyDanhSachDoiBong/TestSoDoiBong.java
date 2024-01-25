package QuanLyDanhSachDoiBong;

import junit.framework.TestCase;

public class TestSoDoiBong extends TestCase {
	public void testDemSoDoiBong() {
		
	CT ct1=new CT("ten1",2000,20.4);
	CT ct2=new CT("ten2",2001,19.4);
	CT ct3=new CT("ten3",2001,21.3);
	CT ct4=new CT("ten4",1999,15.4);
	
	DSCT d1=new ConCT(ct1,new ConCT(ct2,new KhongConCT()));
	DSCT d2=new ConCT(ct3,new ConCT(ct4,new KhongConCT()));
	
	ThongTinHLV hLV1=new ThongTinHLV("tenhlv1","0141491",new KhongCo());
	ThongTinHLV hLV2=new ThongTinHLV("tenhlv2","0141329",new KhongCo());
	
	DoiBong dB1=new DoiBong("tenDB1",hLV1,d1,10,4);
	DoiBong dB2=new DoiBong("tenDB2",hLV2,d2,12,6);
	assertEquals(hLV1.demSoDoiBong(),1,0.01);
	assertEquals(hLV2.demSoDoiBong(),1,0.01);
	}
}
