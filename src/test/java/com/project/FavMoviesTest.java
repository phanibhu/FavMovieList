package com.project;

import com.project.favmovies.FavMovies;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FavMoviesTest {
    ArrayList<String> movieList = new ArrayList<>(3);
    @Test
    public void addMoviesToList(){
        FavMovies favMovies = new FavMovies("3");
        Assert.assertEquals("3",favMovies.getMovieName());





    }
}
