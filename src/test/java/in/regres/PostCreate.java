package in.regres;

import in.regres.model.StudentPojo;
import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreate extends TestBase {

@Test
public void createUser(){
    StudentPojo studentPojo=new StudentPojo();
    studentPojo.setFirstName("bhav");
    studentPojo.setLastName("pat");
    studentPojo.setEmail("mmk@gmail.com");
    studentPojo.setJob("leader");

    Response response=given()
            .header("Content-Type","application/json")
            .body(studentPojo)
            .when()
            .post();
    response.then().statusCode(201);
    response.prettyPrint();


}

}