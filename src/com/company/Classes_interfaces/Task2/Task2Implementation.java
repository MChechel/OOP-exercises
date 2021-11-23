package com.company.Classes_interfaces.Task2;

public class Task2Implementation {

    public static void main(String[] args) {
        MovieCreator myRandomMovie = new MovieCreator();
        myRandomMovie.setTheMovie(new Movie());
        myRandomMovie.createNewMovie();
        System.out.println(myRandomMovie.getTheMovie());
        Movie myfirstMovie = myRandomMovie.createNewMovie();
        Movie mySecondMovie = myRandomMovie.createNewMovie();
        Movie myThirdMovie = myRandomMovie.createNewMovie();
        System.out.println(myfirstMovie);
        System.out.println(mySecondMovie);
        System.out.println(myThirdMovie);
    }
}
