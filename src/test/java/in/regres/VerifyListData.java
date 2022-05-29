package in.regres;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class VerifyListData {
    static ValidatableResponse response;
    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="/api/users";
        response=given()
                .when()
                .get()
                .then().statusCode(200);
    }
    //1.page = 2
    @Test
    public void test01(){
        int total=response.extract().path("total_pages");
        System.out.println("Total number of pages : "+total);
        Assert.assertEquals(2,total);
    }
    //2.per_page = 6
    @Test
    public void test02(){
        int num=response.extract().path("per_page");
        System.out.println("Per page is :"+num);
        Assert.assertEquals(6,num);
    }
    //3.data[1].id = 2
    @Test
    public void test03(){
        int num=response.extract().path("data[1].id");
        System.out.println("data[1].id  :"+num);

    }
    //4.data[3].first_name = Eve
    @Test
    public void test04(){
        String name=response.extract().path("data[3].first_name");
        System.out.println("data[3].first_name  :"+name);

    }
    //5.list of data = 6
    @Test
    public void test05(){
        List<String> name=response.extract().path("data");
        int size1=name.size();
        System.out.println("list of data  :"+size1);

    }
    //6.data[5].avatar="https://reqres.in/img/faces/11-im
    //age.jpg"
    @Test
    public void test06(){
        String web=response.extract().path("data[5].avatar");
        System.out.println("data[5].avatar :"+web);

    }
    //7.support.url ="https://reqres.in/#support-heading"
    @Test
    public void test07(){
        String url=response.extract().path("support.url");
        System.out.println("support.url :"+url);

    }
    //8. support.txt = "To keep ReqRes free, contributions
    //towards server costs are appreciated!"
    @Test
    public void test08(){
        String txt=response.extract().path("support.text");
        System.out.println("support.text :"+txt);

    }



}
