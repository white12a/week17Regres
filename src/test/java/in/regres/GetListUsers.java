package in.regres;

import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListUsers extends TestBase {
    @Test
    public void listOfUsers(){
        Response response=given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void verifyTotalPages(){

    }

}
