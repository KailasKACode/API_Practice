package Shoppin;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
public class TestDmart {
	public static void main(String[] args) {
		Kitchen kitchen=new Kitchen();//for kitchenchen
		kitchen.setOil("Gemini 8ltr");
		kitchen.setRice("Basmati 5k");
		kitchen.setRice("Indrayani 4kg");
		kitchen.setOil("Fortune 2ltr");
		

		Soap soap1 = new Soap();
		soap1.setName("Dove");
		soap1.setPrice("50");
		
		Soap soap2 = new Soap();
		soap2.setName("Lifeboy");
		soap2.setPrice("35");
		
		Soap soap3 = new Soap();
		soap3.setName("Santoor");
		soap3.setPrice("60");
		
		Soap soap4 = new Soap();
		soap4.setName("Dettol");
		soap4.setPrice("20");
		
		List<Soap> soapList = new ArrayList<Soap>();		
		soapList.add(soap1);
		soapList.add(soap2);
		soapList.add(soap3);
		soapList.add(soap4);
		
		DmartList dlist=new DmartList();
		dlist.setBudget("3000");
		dlist.setMonth("june");
		dlist.setSoap(soapList);
		dlist.setKitchen(kitchen);
		given().log().all().contentType(ContentType.JSON).body(dlist)
		.post("http://dummy.restapiexample.com/api/v1/create").then().log().all();
		
		
		
		
	}

}
