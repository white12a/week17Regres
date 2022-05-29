package in.regres;

import in.regres.model.StudentPojo;
import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Login extends TestBase {
    @Test
    public void loginSuccessful(){
        StudentPojo studentPojo=new StudentPojo();
        studentPojo.setEmail("bat.pat@gmail.com");
        studentPojo.setPassword("rim123");

        Response response=given()
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }

}
