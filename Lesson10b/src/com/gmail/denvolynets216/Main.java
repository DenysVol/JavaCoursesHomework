package com.gmail.denvolynets216;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, Long> repeatMap = getStatistic(readFromFile(new File("text.txt")));
//        System.out.println(readFromFile(new File("text.txt")));
//        System.out.println(getStatistic(readFromFile(new File("text.txt"))));
        List<Map.Entry<Character, Long>> sStat = new ArrayList<>(repeatMap.entrySet());
        sStat.sort((a,b)->(int)(b.getValue() - a.getValue()));
        for (Map.Entry<Character, Long> entry : sStat){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }
    }

    public static String readFromFile(File in){
        StringBuilder finalStr = new StringBuilder();
        String str = "";
        try(BufferedReader br = new BufferedReader(new FileReader(in))){
            for(; (str = br.readLine()) != null;){
                finalStr.append(str).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalStr.toString();
    }

        public static Map<Character, Long> getStatistic(String str) {
            Map<Character, Long> result = new HashMap<>();
            for (Character letter : str.toCharArray()) {
                if(letter >= 'A' && letter <= 'z'){
                    Long count = result.get(letter);
                    if(count == null) {
                        result.put(letter, 1L);
                    }else{
                        result.put(letter, count + 1L);
                    }
                }
            }
            return result;
        }

}
