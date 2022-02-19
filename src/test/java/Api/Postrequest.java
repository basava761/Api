package Api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class Postrequest {
	
	
	@Test
	
public void Post() {
		
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/";
		Response httprequest=RestAssured.post();
		
		JSONObject jsnb=new JSONObject();
		jsnb.put("salary","1000000");
		jsnb.put("age","23");
		jsnb.put("id","25");
		
		
		httprequest.headers();
		
		//Response Response=(( (RestAssured) httprequest).request(Method.POST,"create"));
		
		Response response =RestAssured.request(Method.POST,"create");
		
		
		//Response Response = httprequest.request(Method.POST,"/create");
		//httprequest.h
		
		
		("Content-Type","application/json");
	httprequest.body().toString();
		
		
	}

}
//("Content type","Application/json");