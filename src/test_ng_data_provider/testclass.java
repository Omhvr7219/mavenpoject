package test_ng_data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testclass {
@Test(dataProvider = "data")
public void login (String USN,String PWD) {
	System.out.println(USN +" "+ PWD);
}
@DataProvider(name="data")
public Object[][] getdata() {
	Object data[][] = {{"abc@gmail.com","abc"},{"pqr@gmail.com","pqr"},{"xyz@gmail.com","xyz"}};
	return data;
}





}
