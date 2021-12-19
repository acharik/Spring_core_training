package ru.charik.spring_app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBeanPopMusic")
public class PopMusic implements Music{
    @Override
    public  List<String> getSong() {
        List<String> songs = new ArrayList<>();
        songs.add("pop song1");
        songs.add("pop song2");
        songs.add("pop song3");
        return songs;
    }
}
