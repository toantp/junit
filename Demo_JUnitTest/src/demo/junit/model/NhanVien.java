package demo.junit.model;

public class NhanVien {
	private String ten;
	private int ngayCong;
	private int hieuSoLuong;
	
	public NhanVien(){}
	
	public NhanVien(String ten, int ngayCong, int hieuSoLuong) {
		super();
		this.ten = ten;
		this.ngayCong = ngayCong;
		this.hieuSoLuong = hieuSoLuong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNgayCong() {
		return ngayCong;
	}

	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}

	public int getHieuSoLuong() {
		return hieuSoLuong;
	}

	public void setHieuSoLuong(int hieuSoLuong) {
		this.hieuSoLuong = hieuSoLuong;
	}

	public int tinhLuongNhanVien() {
		return ngayCong * hieuSoLuong;
	}
	
	public boolean isNhanVienChuyenCan() {
		if (ngayCong < 25) {
			return false;
		} else {
			return true;
		}
	}
}
