import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {
    private static final String url = "https://postman-echo.com/";
    private static final String arg1 = "arg1";
    private static final String val1 = "val1";
    private static final String arg2 = "arg2";
    private static final String val2 = "val2";
    private String expectedData = "This is expected to be sent back as part of response body.";

    @BeforeEach
    void installSpecification(){
        Specification.installSpec(Specification.requestSpec(url), Specification.responseSpec(arg1, val1, arg2, val2));
    }

    @Test
    void methodGetReturnsStatus200AndRequestQueries(){
        given()
                .when()
                .get(url + "get?" + arg1 + "=" + val1 + "&" + arg2 + "=" + val2);

    }

    @Test
    void methodPostRawReturnsStatus200AndRequestQueriesAndExpectedData(){
        given()
                .body(expectedData)
                .when()
                .post(url + "post?" + arg1 + "=" + val1 + "&" + arg2 + "=" + val2)
                .then()
                .body("data", equalTo(expectedData));
    }

    // Почему-то метод PostFormData возвращает 500 ответ
//    @Test
//    void methodPostFormReturns500(){
//        given()
//                .contentType(ContentType.URLENC)
//                .when()
//                .post(url + "post")
//                .then()
//                .statusCode(500);
//    }

    @Test
    void methodPutReturnsStatus200AndRequestQueriesAndExpectedData(){
        given()
                .body(expectedData)
                .when()
                .put(url + "put?" + arg1 + "=" + val1 + "&" + arg2 + "=" + val2)
                .then()
                .body("data", equalTo(expectedData));
    }

    @Test
    void methodPatchReturnsStatus200AndRequestQueriesAndExpectedData(){
        given()
                .body(expectedData)
                .when()
                .patch(url + "patch?" + arg1 + "=" + val1 + "&" + arg2 + "=" + val2)
                .then()
                .body("data", equalTo(expectedData));
    }

    @Test
    void methodDeleteReturnsStatus200AndRequestQueriesAndExpectedData(){
        given()
                .body(expectedData)
                .when()
                .delete(url + "delete?" + arg1 + "=" + val1 + "&" + arg2 + "=" + val2)
                .then()
                .body("data", equalTo(expectedData));
    }
}
