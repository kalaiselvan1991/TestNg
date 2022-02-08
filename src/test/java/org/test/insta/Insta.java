package org.test.insta;

import org.testng.annotations.DataProvider;

public class Insta  {
	
	@DataProvider(name="details")
	private Object[][] myntraProducts() {
	
	Object[][] obj=new Object[][] {
	
		{"9790955825","KALAISELVAN","kalai@123","Kalai@324"},
		{"9789004910","selvan","selvan&$@123","ru&tyhj^8hgh8778"},
		{"9790955825","kalai","kalaiweedd@1122","akjfcjewaiuf$%2313"},
		{"9790754357","raja","raja&123","rAdf@13456"}
};
	return obj;
}
}