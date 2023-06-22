package com.chroma.apiTesting;


import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIHardCode {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://mexil.it/chroma_api";

        RequestSpecification request = RestAssured.given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer chroma").log().all();

        System.out.println("-----------");

        Response response = request.when().get("/all_students.php");

        // response.prettyPrint();
        response.prettyPeek();

        response.then().assertThat().statusCode(200);

        response.then().assertThat().body("[0].id", Matchers.equalTo("32"));
        
    }

}
