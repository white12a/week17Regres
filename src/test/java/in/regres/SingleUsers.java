package in.regres;

import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SingleUsers extends TestBase {
    @Test
    public void getSingleUser(){
        Response response=given()
                .when()
                .get("/3");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
