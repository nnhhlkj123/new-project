package Xe;

public abstract class Xe {
	protected String nhanHieu;
	protected int giaBan;
	protected NhaSanXuat nhaSanXuat;
	protected ThoiGianBaoHanh thoiGianBaoHanh;
	
	protected Xe(String nhanHieu, int giaBan, NhaSanXuat nhaSanXuat, ThoiGianBaoHanh thoiGianBaoHanh) {
		this.nhanHieu=nhanHieu;
		this.giaBan=giaBan;
		this.nhaSanXuat=nhaSanXuat;
		this.thoiGianBaoHanh=thoiGianBaoHanh;
		
	}
}
