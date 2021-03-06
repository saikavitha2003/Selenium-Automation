package com.AliusHealth;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;

import io.cucumber.messages.internal.com.google.gson.Gson;
import io.cucumber.messages.internal.com.google.gson.JsonObject;
import io.cucumber.messages.internal.com.google.gson.internal.LinkedTreeMap;
import io.cucumber.messages.internal.com.google.gson.stream.JsonReader;

public class DataManager {
	
	public static JSONObject createclaimtestData(String Scenario,String CreateClaimTestData) throws FileNotFoundException {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new FileReader("src/test/resources/data/"+CreateClaimTestData+".json"));
	
		LinkedTreeMap<String, Object> jsonobject=(LinkedTreeMap<String, Object>)gson.fromJson(reader, LinkedTreeMap.class);
		JSONObject jsonObject=new JSONObject(new Gson().toJson(jsonobject.get(Scenario)));
		return jsonObject;
		
	}

}
