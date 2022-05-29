package in.regres;

import in.regres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    @Test
    public void deleteTest(){
        Response response=given()
                .when()
                .delete("2");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
