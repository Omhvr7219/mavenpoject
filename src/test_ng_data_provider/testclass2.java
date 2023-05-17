package test_ng_data_provider;

import org.testng.annotations.Test;

public class testclass2 {
@Test(dataProvider = "data", dataProviderClass = testclass.class)
public void login1(String USN,String PWD){
	System.out.println(USN+" "+ PWD);
}

}
