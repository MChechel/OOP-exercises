package com.company.Classes_interfaces.Task2;

public class MovieCreator {
    private String[] title=new String[]{"Damn","Future","Land","Field","World","Brave"};
    private String[] director=new String[]{"Mike","Don","Leo","Ralph"};
    private String[] genre=new String[]{"Thriller","Comedy","Drama","Horror"};
    private int[] yearOfRealease = new int[]{1980,1990,1995,1994,1996,2001,2020,2021,2022};
    private String[] distributor = new String[]{"Paramount Pictures","Warner Brothers0","Lucas Film"};
    private Movie theMovie;

    public Movie getTheMovie() {
        return theMovie;
    }

    public MovieCreator() {
    }

    public void setTheMovie(Movie theMovie) {
        this.theMovie = theMovie;
    }

    public void setTitle() {
        theMovie.setTitle(title[(int)(Math.random()*this.title.length)]+" "+title[(int)(Math.random()*this.title.length)]);
    }

    public void setDistributor() {
        theMovie.setDistributor(distributor[(int)(Math.random()*this.distributor.length)]);
    }
    public void setDirector() {
        theMovie.setDirector(director[(int)(Math.random()*this.director.length)]);
    }

    public void setGenre() {
        theMovie.setGenre(genre[(int)(Math.random()*genre.length)]);
    }

    public void setYearOfRealease() {
        theMovie.setYearOfRealease(yearOfRealease[(int)(Math.random()*this.yearOfRealease.length)]);
    }


    public Movie createNewMovie(){
        this.setTheMovie(new Movie());
        setYearOfRealease();
        setGenre();
        setDirector();
        setTitle();
        setDistributor();
        return this.theMovie;
    }

}
