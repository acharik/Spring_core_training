package ru.charik.spring_app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
       // ClassicalMusic classicalMusic = context.getBean("musicBeanClassicalMusic", ClassicalMusic.class);
        //System.out.println(classicalMusic.getSong());


      //Music music =  context.getBean("musicBean",Music.class);
      //MusicPlayer musicPlayer = new MusicPlayer(music);
      /* MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer2.setVolume(20);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        //MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic(Song.CLASSICAL);
        //musicPlayer2.setVolume(20);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
       // System.out.println(musicPlayer2.getVolume());
        context.close();
    }
}
