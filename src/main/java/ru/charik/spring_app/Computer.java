/*package ru.charik.spring_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Song song;
    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer,Song song) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
        this.song = song;
    }

    @Override
    public String  toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic(song) +
                '}';
    }
}
*/