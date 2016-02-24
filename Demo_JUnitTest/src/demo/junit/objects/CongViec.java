package demo.junit.objects;

import java.util.ArrayList;
import java.util.List;

public class CongViec {
	private String tenNgheNghiep;
	private List<NhanVien> nhanViens = new ArrayList<NhanVien>();

	public CongViec(String tenNgheNghiep) {
		super();
		this.tenNgheNghiep = tenNgheNghiep;
	}

	public String getTenNgheNghiep() {
		return tenNgheNghiep;
	}

	public void setTenNgheNghiep(String tenNgheNghiep) {
		this.tenNgheNghiep = tenNgheNghiep;
	}

	public List<NhanVien> getNhanViens() {
		return nhanViens;
	}

	public void setNhanViens(List<NhanVien> nhanViens) {
		this.nhanViens = nhanViens;
	}
}
