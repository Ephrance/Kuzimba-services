package com.javaguides.okhttp.tutorial.crud;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpPut {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).put(body).build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OkHttpPut example = new OkHttpPut();
        String json = "{\r\n" +
            " \"amount\" : \"23000000\",\r\n" +
            "}";
        String response = example.post("http://localhost:8080/api/v1/employees/1", json);
        System.out.println(response);
    }
}