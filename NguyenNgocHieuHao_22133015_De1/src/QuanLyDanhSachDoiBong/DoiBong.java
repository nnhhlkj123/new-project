package QuanLyDanhSachDoiBong;

public class DoiBong {
	private String tenDoi;
	private ThongTinHLV huanLuyenVien;
	private DSCT danhSach;
	private int tranThang;
	private int tranThua;
	
	public DoiBong(String tenDoi,ThongTinHLV huanLuyenVien,DSCT danhSach,int tranThang, int tranThua) {
		this.tenDoi=tenDoi;
		this.huanLuyenVien=huanLuyenVien;
		this.danhSach=danhSach;
		this.tranThang=tranThang;
		this.tranThua=tranThua;
		this.huanLuyenVien.themDoiBong(this);
	}
}