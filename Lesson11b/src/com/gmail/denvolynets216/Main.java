package com.gmail.denvolynets216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String address = "https://progqwdasc.kiev.ua";
        String text = getStringFromURL(address);

        System.out.println(text);
        Map<String,List<String>> result = getHeader(address);
        result.forEach((key, value) -> System.out.println(key + " - " + value));
    }
    public static String getStringFromURL(String address){
        StringBuilder sb = new StringBuilder();
        try{
            URL url = new URL(address);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
            String text = "";
            for(;(text = br.readLine())!=null;){
                sb.append(text).append(System.lineSeparator());
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static Map<String,List<String>> getHeader(String address){
        Map<String,List<String>> result = null;
        try{
            URL url = new URL(address);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            result = httpCon.getHeaderFields();
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
