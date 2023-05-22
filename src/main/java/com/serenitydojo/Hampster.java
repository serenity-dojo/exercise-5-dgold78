package com.serenitydojo;

public class Hampster extends Pet{

    private String favoriteGame;

    public Hampster(String name, int age, String favoriteGame){
        super(name,age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame(){
        return favoriteGame;
    }


    @Override
    public String play() {
        return "runs in wheel";
    }
}
