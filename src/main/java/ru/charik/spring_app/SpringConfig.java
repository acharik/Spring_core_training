package ru.charik.spring_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.charik.spring_app")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
        public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
        public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
        public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
        public MusicPlayer musicPlayer(){

        return new MusicPlayer(song());
    }
    @Bean
    public List<Music> song() {
        return Arrays.asList(classicalMusic(),rockMusic(),popMusic());
    }
}
