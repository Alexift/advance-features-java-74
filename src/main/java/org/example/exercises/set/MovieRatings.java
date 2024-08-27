package org.example.exercises.set;
/*
    Movie Ratings:
    Implement a movie rating system using both a HashSet and a TreeSet where movies are stored and sorted based on their ratings.

 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

class Movie {
    private String title;
    private Double rating;
    private LocalDate dateTime;

    public Movie(String title, Double rating, LocalDate dateTime) {
        this.title = title;
        this.rating = rating;
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDate(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", dateTime=" + dateTime +
                '}';
    }
}

public class MovieRatings {

    public static void displayList(List<Movie> list) {

        for (Movie it : list) {
            System.out.println(it.getTitle() + " " + it.getRating() + " " + it.getDateTime());

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Set<Movie> movieUnorderedSet = new HashSet<>();

        movieUnorderedSet.add(new Movie("Inceptio", 3.1, LocalDate.of(2024, 12, 3)));
        movieUnorderedSet.add(new Movie("Terminator", 6.9, LocalDate.of(2024, 1, 30)));
        movieUnorderedSet.add(new Movie("Home Alone ", 9.5, LocalDate.of(2022, 5, 6)));

        System.out.println("Lista de filme este: \n " + movieUnorderedSet);

        // ArrayList si sort
        List<Movie> movieSortedList = new ArrayList<>(movieUnorderedSet);
        System.out.println("Lista nesortata este :");
        displayList(movieSortedList);
        movieSortedList.sort(Comparator
                .comparing(Movie::getRating)
                .thenComparing(Movie::getDateTime)
                .reversed());

        System.out.println("Lista sortata este :");
        displayList(movieSortedList);

        //Colections si sort
        List<Movie> movieSrtedList2 = new ArrayList<>(movieUnorderedSet);

        Collections.sort(
                movieSrtedList2,
                Comparator.comparing(Movie::getRating)
                        .reversed()

        );
        System.out.println("Lista 2 sortata este :");
        displayList(movieSrtedList2);

        /**
         * Comparator.comparing(Movie::getRating)
         * - se uita intern in csaa Movie
         * -si compara 2 elemente random din lista noasta pe baza metodei de referinta
         * - metoda de refenta este de regula un hetter * diind datele noaste
         */

    }
}
