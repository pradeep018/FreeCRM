package Excel;

import com.excel.lib.util.Xls_Reader;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Dharmik-Karthik\\eclipse-workspace\\ExcelMaven\\src\\main\\java\\Excel\\Sample1.xlsx");

		
		int b=(int) Math.random();
		int A=(int) Math.pow(2, 3);
		System.out.println(A);
		System.out.println(b);
	}

}
