package com.reqres.studentinfo;


import com.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {
    @Test
    public void deletUser() {
        Response response = given()
                .pathParam("users",2)
                .when()
                .delete("/{users}");
        response.then().statusCode(204);
        response.prettyPrint();

    }


}
