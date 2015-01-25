package ReadingAndWritingFiles;

public class Reading_Writing_XLS_WithXLSReader {

	public static void main(String[] args) {


		//To read from XLSX file
				Xls_Reader d = new Xls_Reader("D:\\Application\\Aishwarya_Selenium\\JavaSamples\\src\\TestData\\TestData.xlsx");
				int r=d.getRowCount("Record");
				System.out.println(r);
				
				String data=d.getCellData("Record", 1, 2);
				System.out.println(data);
				
				String data1=d.getCellData("Record", "Location", 3);
				System.out.println(data1);
				
				System.out.println(d.getColumnCount("Record"));
				
				
				//Xls_Reader d1 = new Xls_Reader("PATH");
				
				//To write in XLSX file, file should be kept closed
				
				d.setCellData("Record", "Name", 6, "Lakshmi");

	}

}
