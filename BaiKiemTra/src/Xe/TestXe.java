package Xe;
import junit.framework.TestCase;

public class TestXe extends TestCase {
	public void testConstructor() {
		ThoiGianBaoHanh time1=new ThoiGianBaoHanh(3);
		Xe Xe1=new XeMay("Ben bi",40,new NhaSanXuat("Vinfast","VietNam"),time1,new PhanKhoi100());
		Xe Xe2=new XeDap("Nhanh chong",20, new NhaSanXuat("Vinfast","VietNam"),new ThoiGianBaoHanh(1),new XeDapDien());
	}
}
