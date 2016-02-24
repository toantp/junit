package demo.junit.objects;

public class NhanVien {
	private String tenNhanVien;
	private int tuoiNhanVien;
	private CongViec ngheNghiepNhanVien;

	public NhanVien(String tenNhanVien) {
		// TODO Auto-generated constructor stub
		this.tenNhanVien = tenNhanVien;
	}
	
	public NhanVien(String tenNhanVien, int tuoiNhanVien, CongViec ngheNghiepNhanVien) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.tuoiNhanVien = tuoiNhanVien;
		this.ngheNghiepNhanVien = ngheNghiepNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getTuoiNhanVien() {
		return tuoiNhanVien;
	}

	public void setTuoiNhanVien(int tuoiNhanVien) {
		this.tuoiNhanVien = tuoiNhanVien;
	}

	public CongViec getCongViecNhanVien() {
		return ngheNghiepNhanVien;
	}

	public void setNgheNghiepNhanVien(CongViec ngheNghiepNhanVien) {
		this.ngheNghiepNhanVien = ngheNghiepNhanVien;
	}
}
