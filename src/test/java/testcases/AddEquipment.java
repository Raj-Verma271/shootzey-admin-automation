package testcases;

import org.testng.annotations.Test;

import pageobjects.equipment;
import utilities.Dataprovider;

public class AddEquipment extends SetupMethod {
	@Test(dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void AddEquipment(String Email,String pwd, String EquipmentName,String SensorName,String Video,String Connectivity,String Features,String Specification,String MRP1,String SellingPrice1,String MRP2,String SellingPrice2,String MRP3,String SellingPrice3,String MRP4,String SellingPrice4,String MRP5,String SellingPrice5,String MRP6,String SellingPrice6,String Tax,String Latitude,String Longtitude,String ShortDescription,String LongDescription) throws InterruptedException {
		 equipment eq=new  equipment(driver);
		
		 eq.logIn(Email);
		 eq.Setpassword(pwd);
		 eq.Login();
		 Thread.sleep(3000);
		 eq.clickCatalogue();
		 Thread.sleep(2000);
		 eq.clickEquipment();
		 Thread.sleep(2000);
		 eq.clickAddEquipment();
		 eq.SetEquipmentName(EquipmentName);
		 eq.SetBannerImage();
		 eq.SelectCategry();
		 eq.SetSensorType(SensorName);
		 eq.SetVideoResolution(Video);
		 eq.SetConnectivity(Connectivity);
		 eq.selectCity();
		 eq.SelectEquipments();
		 eq.SetFeature(Features);
		 eq.SetSpecifications(Specification);
		 eq.SetMRP1(MRP1);
		 eq.SetSellingPrice(SellingPrice1);
		 eq.SetMRP2(MRP2);
		 eq.SetSellingPrice2(SellingPrice2);
		 eq.SetMRP3(MRP3);
		 eq.SetSellingPrice3(SellingPrice3);
		 eq.SetMRP4(MRP4);
		 eq.SetSellingPrice4(SellingPrice4);
		 eq.SetMRP5(MRP5);
		 eq.SetSellingPrice5(SellingPrice5);
		 eq.SetMRP6(MRP6);
		 eq.SetSellingPrice6(SellingPrice6);
		 eq.SetTax(Tax);
		 eq.setLet(Latitude);
		 eq.setLong(Longtitude);
		 eq.SetShortDescription(ShortDescription);
		 eq.SetLongDescription(LongDescription);
		 eq.ClickSaveButton();
		 
		
		
		 
		 
		
		
		
	}
	

}
