package com.java._4_oop._2_inheritance.polimorphism;

public class Cinema {

    public static void main(String... args) {
//        Movie m = new Movie();

        Movie[] movies = new Movie[3];
        movies[0] = new FastAndFurious();
        movies[1] = new Inception();
        movies[2] = new Jaws();

        for (Movie movie : movies) {
            movie.plot(); //un API comun
        }
    }
}
