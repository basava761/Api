package Api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo001 {

	
@Test
public void get() {
		
	
	
	
	
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	
	RequestSpecification httprequest=RestAssured.given();
	
	Response Response=httprequest.request(Method.GET,"/employees");
			
			
			
			
		String responseBody=Response.getBody().asString();
		System.out.println("response body is:" + responseBody);
		
		int Status_code=Response.getStatusCode();
		System.out.println(Status_code);
			Assert.assertEquals(Status_code, 200);
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
		
	}
	
	
}
