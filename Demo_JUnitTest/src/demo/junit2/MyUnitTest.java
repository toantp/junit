package demo.junit2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import demo.junit.objects.*;



public class MyUnitTest {
	List<NhanVien> nhanViens;

	@Before
	public void setUp() {
		// Create new instance of nhanViens
		nhanViens = new ArrayList<NhanVien>();
		nhanViens.add(new NhanVien("Toan 1", 21, new CongViec("Hang khong")));
		nhanViens.add(new NhanVien("Toan 2", 22, new CongViec("Kinh doanh")));
		nhanViens.add(new NhanVien("Toan 3", 23, new CongViec("Thiet ke")));
	}

	@Test
	public void testCase1() { 
		NhanVien nhanVien1 = new NhanVien("Toan 1", 22, new CongViec("Hoa chat"));
		NhanVien nhanVien2 = null;
		
		for (NhanVien nv : nhanViens) {
			if (nv.getTenNhanVien().equals("Toan 1")) {
				nhanVien2 = nv;
			}
		}
		
		assertEquals(nhanVien1.getTenNhanVien(), nhanVien2.getTenNhanVien());
	}
	
	@Test
	public void testCase2() { 
		NhanVien nhanVien1 = new NhanVien("Toan 4", 21, new CongViec("Hoa chat"));
		NhanVien nhanVien2 = null;
		
		for (NhanVien nv : nhanViens) {
			if (nv.getTenNhanVien().equals("Toan 1")) {
				nhanVien2 = nv;
			}
		}
		
		assertFalse(nhanVien1.getTenNhanVien() != nhanVien2.getTenNhanVien());
	}
	
	@Test
	public void testCase8() { 
		NhanVien nhanVien1 = new NhanVien("Toan 1", 22, new CongViec("Hoa chat"));
		NhanVien nhanVien2 = null;
		
		for (NhanVien nv : nhanViens) {
			if (nv.getTenNhanVien().equals("Toan 1")) {
				nhanVien2 = nv;
			}
		}
		
		assertSame(nhanVien1.getTuoiNhanVien(), nhanVien2.getTuoiNhanVien());
	}
}
