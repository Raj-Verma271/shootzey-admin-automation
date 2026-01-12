//package utilities;
//
//import java.io.IOException;
//
//import org.testng.annotations.DataProvider;
//
//public class Dataprovider {
//	@DataProvider(name="LoginData")
//	public String [][]getData() throws IOException{
//		String path=".\\testdata\\ShootzyData.xlsx";  //taking xl file from test data.
//		ExcelUtility xlutil=new ExcelUtility(path);  // creating an object of ExcelUtility.
//		
//		
//		int totalrows=xlutil.getRowCount("Sheet1");
//		int totalcols=xlutil.getCellCount("Sheet1",1);
//		
//		String loginData[][]=new String[totalrows][totalcols];  // created for Two Dimentional Array which can store..
//		
//		for(int i=1;i<=totalrows;i++) {   //1  read data from xl storing in two dimensional Array
//			
//			for(int j=0;j<totalcols;j++) {  // 0 i is rows and j is col
//				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
//			}
//		}
//		
//		return loginData;
//		
//
//}
//}


package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class Dataprovider {
//    @DataProvider(name="LoginData")
//    public String [][] getData() throws IOException {
//        String path = "./testdata/NewShootzyData.xlsx";  // Adjusted path format
//        ExcelUtility xlutil = new ExcelUtility(path);
//
//        String sheetName = "Sheet1";
//        int totalRows = xlutil.getRowCount(sheetName);
//        int totalCols = xlutil.getCellCount(sheetName, 1);
//
//        String loginData[][] = new String[totalRows][totalCols];
//
//        for (int i = 1; i <= totalRows; i++) {  // Start from row 1 (skip header)
//            for (int j = 0; j < totalCols; j++) {
//                loginData[i - 1][j] = xlutil.getCellData(sheetName, i, j).trim();  // Trim to remove spaces
//            }
//        }
//        return loginData;
//    }
//}
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException {
	    String path = "./testdata/NewShootzyData.xlsx";  // Ensure correct file path
	    ExcelUtility xlutil = new ExcelUtility(path);

	    String sheetName = "Equipment";  
	    int totalRows = xlutil.getRowCount(sheetName);
	    int totalCols = xlutil.getCellCount(sheetName, 0);

	    System.out.println("Total Rows: " + totalRows);
	    System.out.println("Total Columns: " + totalCols);

	    String loginData[][] = new String[totalRows][totalCols];

	    for (int i = 1; i <= totalRows; i++) {  
	        for (int j = 0; j < totalCols; j++) {
	            loginData[i - 1][j] = xlutil.getCellData(sheetName, i, j).trim();  
	            System.out.println("Reading: " + loginData[i - 1][j]);  // Debugging output
	        }
	    }
	    return loginData;
	}
}
	
	
//@DataProvider(name="LoginData")
//public String [][]getData() throws IOException{
//    String path=".\\testdata\\NewShootzyData.xlsx";
//    ExcelUtility xlutil=new ExcelUtility(path);
//
//    int totalrows=xlutil.getRowCount("Sheet1");
//    int totalcols=xlutil.getCellCount("Sheet1",1);
//
//    String loginData[][]=new String[totalrows][totalcols]; 
//
//    for(int i=1;i<=totalrows;i++) {   
//        for(int j=0;j<totalcols;j++) {  
//            loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
//            System.out.println("Reading Data: " + loginData[i-1][j]);  // 👀 Debug Print
//        }
//    }
//    return loginData;
//}
//}
