package Xe;

public class XeMay extends Xe {
	private PhanKhoi phanKhoi;
	
	public XeMay(String nhanHieu, int giaBan, NhaSanXuat nhaSanXuat, ThoiGianBaoHanh thoiGianBaoHanh,PhanKhoi phanKhoi) {
		super(nhanHieu, giaBan, nhaSanXuat, thoiGianBaoHanh);
		
		this.phanKhoi=phanKhoi;
	}
}
