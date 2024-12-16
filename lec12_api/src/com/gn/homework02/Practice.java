package com.gn.homework02;

public class Practice {

    public String takeState(String address) {
        String result = null;


        String[] adressSplit = address.split(" ");
        
        for (String borough : adressSplit) {
            if (borough.charAt(borough.length()-1) == '구') {
                result = borough;
                break;
            }
        }
        
        return result;
    }
}
