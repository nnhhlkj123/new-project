package QuanLyDanhSachDoiBong;

public class ThongTinHLV {
	private String ten;
	private String soDT;
	private DSDoiBong doiBong;
	
	public ThongTinHLV(String ten, String soDT,DSDoiBong doiBong) {
		this.ten=ten;
		this.soDT=soDT;
		this.doiBong=doiBong;
	}
	public void themDoiBong(DoiBong them) {
		doiBong=new Co(them,this.doiBong);
	}
	public int demSoDoiBong() {
		return this.doiBong.demDoiBong();
	}
}
