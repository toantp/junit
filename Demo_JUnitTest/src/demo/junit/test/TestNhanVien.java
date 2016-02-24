package demo.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import demo.junit.model.NhanVien;

public class TestNhanVien {
	
	NhanVien nhanVien;
	
	@Before
	public void setUp () {
		// NhanVien(Tên, Ngày công, Hiệu số lương (vnd/ngày)
		String ten = "Nguyễn Văn A";
		int ngayCong = 26;
		int hieuSoLuong = 100000;
		nhanVien = new NhanVien(ten, ngayCong, hieuSoLuong);
	}
	
	@After
	public void tearDown () {
		nhanVien = null;
		assertNull(nhanVien);
	}
		
	@Test
	public void testTinhLuongNhanVien() {
		int ketQuaDung = 2600000;		
		assertEquals(ketQuaDung, nhanVien.tinhLuongNhanVien());
	}

	@Test
	public void testIsNhanVienChuyenCan() {		
		assertTrue(nhanVien.isNhanVienChuyenCan());
	}
	
}
