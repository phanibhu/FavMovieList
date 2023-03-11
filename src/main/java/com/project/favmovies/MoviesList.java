package com.project.favmovies;

import java.util.ArrayList;

public class MoviesList {
    ArrayList<FavMovies> movie;

    public MoviesList(){
        movie = new ArrayList<>(3);
    }


    public void addMovie(FavMovies favMovies){
        movie.add(favMovies);

    }
    public ArrayList<FavMovies> getMoviesList(){
        return movie;
    }
}
