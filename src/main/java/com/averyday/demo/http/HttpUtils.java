package com.averyday.demo.http;

import com.alibaba.fastjson.JSON;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Description
 * Author ayt  on
 */
public class HttpUtils {
	public static void main(String[] args) {
		String url = "http://shield-gw-qa1-gw.dwbops.com/api/filter/add";
		String params = "{\"targetType\":1,\"riderId\":\"4\",\"cityId\":1,\"forbidTypes\":[1],\"validPt\":\"2038-01-01T15:59:59.000Z\"}";
		Map map = (Map) JSON.parse(params);
		Response response = given().contentType("application/json").body(params).when().post(url);
	}
}
