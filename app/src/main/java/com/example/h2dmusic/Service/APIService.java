package com.example.h2dmusic.Service;

public class APIService {
    private static String base_url = "https://trinhhai1328.000webhostapp.com/Server/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
