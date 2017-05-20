package com.gmail.denvolynets216;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> address = new ArrayList<>();
        address.add("https://dou.ua/");
        address.add("https://www.ukr.net/");
        address.add("https://www.ukr.net/");
        address.add("https://habrahabr.ru/");
        address.add("https://habrahabr.ru/");
        address.add("https://habrahabrun.ru/");
        Set<String> addressSet = new HashSet<>(address);
        for (String s : addressSet) {
            System.out.println(getStatus(s));
        }
    }

    public static String getStatus(String address){

//            try {
//                InetAddress ia = InetAddress.getByName(el);
//            } catch (IOException e) {
//                status = "Not Registered";
//            }
            try {
                URL url = new URL(address);
                HttpURLConnection http = (HttpURLConnection) url.openConnection();
                int n = http.getResponseCode();
                if (n >= 200 && n < 300) {
                    return address + "  status:  " + "OK";
                } else {
                    return address + "  status:  error " + n + " " + http.getResponseMessage();
                }
            } catch (IOException e) {
                return  address + "  status:  " + "Not available";
            }
        }
    }


