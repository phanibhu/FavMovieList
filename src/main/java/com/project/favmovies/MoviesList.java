package com.project.favmovies;

import java.util.ArrayList;
import java.util.Queue;

public class MoviesList {
    ArrayList<FavMovies> movie;

    public MoviesList(){
        movie = new ArrayList<>();
    }


    public void addMovie(FavMovies favMovies) {
        movie.add(favMovies);
    }
    public void removeFirstMovie(FavMovies favMovies){


        int value = 3;
            if(movie.size()>=value){
                movie.remove(0);
                movie.add(favMovies);
            }


    }
    // we can go with this method also with out initializing initial capacity
//    public void addMovie(FavMovies favMovies){
//        int value = 3;
//        if (movie.size()<value){
//            movie.add(favMovies);
//        }
//        else{
//            System.out.println("we can't enter fourth movie");
//        }
//
////
//
//    }
    public ArrayList<FavMovies> getMoviesList(){
        return movie;
    }
}
