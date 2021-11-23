package com.company.Classes_interfaces.Task2;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int yearOfRealease;
    private String distributor;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfRealease=" + yearOfRealease +
                ", distributor='" + distributor + '\'' +
                '}';
    }

    public Movie(String title, String director, String genre, int yearOfRealease, String distributor) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.yearOfRealease = yearOfRealease;
        this.distributor = distributor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfRealease() {
        return yearOfRealease;
    }

    public void setYearOfRealease(int yearOfRealease) {
        this.yearOfRealease = yearOfRealease;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
