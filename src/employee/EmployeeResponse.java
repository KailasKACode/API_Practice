package employee;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;


public class EmployeeResponse {
	public static void main(String[] args) {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		String createURL = "/create";
		EmployeeDetails emp=new EmployeeDetails();
		emp.setAge("35");
		emp.setSalary("7000");
		emp.setName("can");
		
		EmpRespo empObject=new EmpRespo();
        
           empObject=given().log().all().header("Content-Type", "application/json")
                .body(emp)
                .when()
                .post(createURL)
                .then().log().all().extract().as(EmpRespo.class);
           
           System.out.println("Status code: "+empObject.getStatus());
           System.out.println("Name:  "+empObject.getData().getName());
           System.out.println("Id:  "+empObject.getData().getId());
           System.out.println("Age	:  "+empObject.getData().getAge());

     
		
		

		
		
	}

}
