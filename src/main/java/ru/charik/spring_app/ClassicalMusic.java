package ru.charik.spring_app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicBeanClassicalMusic")
public class ClassicalMusic implements Music{
   private List<String> songs = new ArrayList<>();{
        songs.add("Classical song1");
        songs.add("Classical song2");
        songs.add("Classical song3");
   }
    ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("initialization");
    }
    public void doMyDestroy(){
        System.out.println("destroying");
    }
    @Override
    public  List<String> getSong() {
        return songs;
    }
}
