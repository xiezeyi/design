package com.xzy.design.structural.adaptor.clazz;

import com.xzy.design.structural.adaptor.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {

        MoviePlayer moviePlayer = new MoviePlayer();
        JPMoviePlayerAdapter jpMoviePlayerAdapter = new JPMoviePlayerAdapter(moviePlayer);
        System.out.println(moviePlayer.play());
        System.out.println(jpMoviePlayerAdapter.play());

    }
}
