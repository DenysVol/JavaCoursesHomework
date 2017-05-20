package com.gmail.denvolynets216;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try{
            InetAddress ia = InetAddress.getByName("www.google.com");
            System.out.println(ia);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
