package com.project;

import com.project.favmovies.FavMovies;
import com.project.favmovies.MoviesList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MoviesListTest {

    @Test
    public void getFavMovieList(){
        MoviesList moviesList = new MoviesList();
        FavMovies favMovies1 = new FavMovies("pushpa");
        FavMovies favMovies2 = new FavMovies("ASVR");
        FavMovies favMovies3 = new FavMovies("Jalsa");
        FavMovies favMovies4 = new FavMovies("OG");
        moviesList.addMovie(favMovies1);
        moviesList.addMovie(favMovies2);
        moviesList.addMovie(favMovies3);
        Assert.assertEquals(3, moviesList.getMoviesList().size());
        Assert.assertEquals(favMovies1, moviesList.getMoviesList().get(0));
        Assert.assertEquals(favMovies2, moviesList.getMoviesList().get(1));
        Assert.assertEquals(favMovies3, moviesList.getMoviesList().get(2));
    }
    @Test
    public void removeFirstMovieFromList(){
        MoviesList moviesList = new MoviesList();
        FavMovies favMovies1 = new FavMovies("pushpa");
        FavMovies favMovies2 = new FavMovies("ASVR");
        FavMovies favMovies3 = new FavMovies("Jalsa");
        FavMovies favMovies4 = new FavMovies("OG");
        moviesList.addMovie(favMovies1);
        moviesList.addMovie(favMovies2);
        moviesList.addMovie(favMovies3);
        moviesList.addMovie(favMovies4);
        moviesList.removeFirstMovie(favMovies1);
        Assert.assertEquals(4, moviesList.getMoviesList().size());
        Assert.assertEquals(favMovies2, moviesList.getMoviesList().get(0));
        Assert.assertEquals(favMovies3, moviesList.getMoviesList().get(1));
        Assert.assertEquals(favMovies4, moviesList.getMoviesList().get(2));
    }
    @Test
    public void getFavMovieList2(){
        MoviesList moviesList = new MoviesList();
        FavMovies favMovies1 = new FavMovies("pushpa");
        FavMovies favMovies2 = new FavMovies("ASVR");
        FavMovies favMovies3 = new FavMovies("Jalsa");
        moviesList.addMovie(favMovies1);
        moviesList.addMovie(favMovies2);
        moviesList.addMovie(favMovies3);
        Assert.assertEquals(3, moviesList.getMoviesList().size());
        Assert.assertEquals(favMovies1, moviesList.getMoviesList().get(0));
        Assert.assertEquals(favMovies2, moviesList.getMoviesList().get(1));
        Assert.assertEquals(favMovies3, moviesList.getMoviesList().get(2));
    }
    @Test
    public void getFavMovieList3(){
        MoviesList moviesList = new MoviesList();
        FavMovies favMovies1 = new FavMovies("pushpa");
        FavMovies favMovies2 = new FavMovies("Jalsa");
        moviesList.addMovie(favMovies1);

        moviesList.addMovie(favMovies2);
        Assert.assertEquals(2, moviesList.getMoviesList().size());
        Assert.assertEquals(favMovies1, moviesList.getMoviesList().get(0));

        Assert.assertEquals(favMovies2 , moviesList.getMoviesList().get(1));
    }

}
