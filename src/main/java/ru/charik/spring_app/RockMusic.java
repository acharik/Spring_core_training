package ru.charik.spring_app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBeanRockMusic")
public class RockMusic implements Music{
    @Override
    public  List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("Rock song1");
        songs.add("Rock song2");
        songs.add("Rock song3");
        return songs;
    }
}
