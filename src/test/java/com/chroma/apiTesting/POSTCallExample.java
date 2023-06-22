package com.chroma.apiTesting;

import com.chroma.apiUtils.APICommonMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCallExample {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://mexil.it/chroma_api";

        RequestSpecification request = RestAssured.given().header("Content-Type", "application/json")
                .header("Authorization", "Bearer chroma")
                .body(APICommonMethods.readJson(APIConstants.ADD_STUDENT_PAYLOAD)).log().all();

        Response response = request.when().post("/add_student.php");

        response.prettyPeek();

    }

}
