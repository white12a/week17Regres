package in.regres.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by bhavesh patel
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="https://reqres.in";
       // RestAssured.port=8080;
        RestAssured.basePath="/api/users";
    }
}
