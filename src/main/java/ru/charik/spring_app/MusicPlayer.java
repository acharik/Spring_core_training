package ru.charik.spring_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @PostConstruct
    public void doMyInit(){
        System.out.println("initialisation");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroying");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
//  @Autowired
  //  public void setMusic(List<Music> music) {
  //      this.music = music;
   // }

    public MusicPlayer(){};

    public String playMusic(Song song){
        String s = "";

        for (int i = 0; i < music.size(); i++) {
            s = s + music.get(i).getSong();
            System.out.println("Playing " + music.get(i).getSong());
        }
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (song == Song.CLASSICAL ){
            System.out.println(music.get(0).getSong().get(randomNumber));
        }
        if (song == Song.ROCK ){
            System.out.println(music.get(2).getSong().get(randomNumber));
        }else if (song == Song.POP){
            System.out.println(music.get(1).getSong().get(randomNumber));
        }
        return s;
    }
}
