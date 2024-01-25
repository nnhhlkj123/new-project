package Xe;

public class XeDap extends Xe{
	private LoaiXe loaiXe;
	
	public XeDap(String nhanHieu, int giaBan, NhaSanXuat nhaSanXuat, ThoiGianBaoHanh thoiGianBaoHanh, LoaiXe loaiXe) {
		super(nhanHieu, giaBan, nhaSanXuat, thoiGianBaoHanh);		
		this.loaiXe=loaiXe;
	}
}
