package org.test.project.jan11;

import org.testng.annotations.DataProvider;

public class methodsForAddatin {
		
//		@DataProvider(name="login",indices = {3})
//		private Object[][] login() {
//			
//			Object[][] obj=new Object[][] {
//		
//				{"kalai123","123455"},
//				{"selvan456","kalai123345"},
//				{"selvan@123","kalai445566"},
//				{"kalaiselvan123","kalai1991"}
//		};
//			return obj;
//		
//		}
		
	@DataProvider(name="login")
	private Object[][] login() {
		
		Object[][] obj=new Object[][] {
			{"kalaiselvan123","kalai1991","20/01/2022","21/01/2022","KALAI","SELVAN","pammal","1234567890123456","123"}
		
	};
		return obj;
	
	}
	
	@DataProvider(name="address")
	private Object[][] address() {
		
		Object[][] obj=new Object[][] {
			
			{"kalaiselvan123","kalai1991","15/01/2022","16/01/2022","samay","SELVAN","giri","1234567890146756","321"}
	};
return obj;
	}

@DataProvider(name="booking")
private Object[][] booking() {
	
	Object[][] obj=new Object[][] {
		
		{"kalaiselvan123","kalai1991","29/01/2022","30/01/2022","KALAI","kani","anakaputhur","0845637890123456","123"}
};

return obj;
}
@DataProvider(name="date")
private Object[][] date() {
	
	Object[][] obj=new Object[][] {
		
		{"kalaiselvan123","kalai1991","08/02/2022","10/02/2022","KALAI","thangasamy","chennai","1234567890123421","123"}
};
return obj;
	}
	

}
