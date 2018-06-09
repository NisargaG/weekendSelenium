package pac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CartTest {
	
	@Test(dataProvider="getData")
	public void addtoCartTest(String cata, String product) {
		System.out.println("catagary="+cata +", product="+product);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[5][2];
		objArr[0][0]="mobile";
		objArr[0][1]="iphone-6";
		
		objArr[1][0]="mobile";
		objArr[1][1]="iphone-7";
		
		objArr[2][0]="mobile";
		objArr[2][1]="iphone-10";
		
		objArr[3][0]="mobile";
		objArr[3][1]="nokia";
		
		objArr[4][0]="mobile";
		objArr[4][1]="lg";
		return objArr;
	}

}
