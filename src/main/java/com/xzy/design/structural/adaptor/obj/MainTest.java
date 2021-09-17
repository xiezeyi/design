package com.xzy.design.structural.adaptor.obj;

import com.xzy.design.structural.adaptor.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(new MoviePlayer());
        adapter.play();

    }
}
