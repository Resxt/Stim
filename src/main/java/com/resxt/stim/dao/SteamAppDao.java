package com.resxt.stim.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resxt.stim.models.SteamApp;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class SteamAppDao {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private static final String API_STEAM_APPS_URL = API_BASE_URL + "steam/apps/";

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public SteamApp[] getSteamApps(){
        try {
            URL url = new URL(API_STEAM_APPS_URL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                JSONParser parse = new JSONParser();

                JSONArray jsonArray = (JSONArray) parse.parse(String.valueOf(informationString));

                return objectMapper.readValue(jsonArray.toString(), SteamApp[].class);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new SteamApp[0];
    }

    public SteamApp getSteamApp(int appId){
        try {
            URL url = new URL(API_STEAM_APPS_URL + appId);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                JSONParser parse = new JSONParser();

                JSONObject jsonObject = (JSONObject) parse.parse(String.valueOf(informationString));

                return objectMapper.readValue(jsonObject.toString(), SteamApp.class);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}