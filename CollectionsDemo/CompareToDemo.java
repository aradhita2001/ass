package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Movie
 */
class MovieComparable implements Comparable<MovieComparable> {
    private double rating;
    private String name;
    private int year;

    public int compareTo(MovieComparable m) {
        // return this.year - m.year;
        // return -this.name.compareTo(m.name);

        if(this.rating > m.rating) return 1;
        if(this.rating < m.rating) return -1;
        return 0;
    }

    public MovieComparable (String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return name + "    " + rating + "    " + year; 
    }
    
}
public class CompareToDemo {

    public static void main(String[] args) {
        ArrayList<MovieComparable> movies = new ArrayList<MovieComparable>();
        movies.add(new MovieComparable("a1", 3.34, 1988));
        movies.add(new MovieComparable("b2", 1.00, 1934));
        movies.add(new MovieComparable("c3", 5.00, 2015));
        movies.add(new MovieComparable("d4", 2.34, 2023));
        movies.add(new MovieComparable("e5", 3.23, 2202));
        movies.add(new MovieComparable("f6", 4.34, 2202));


        Collections.sort(movies);

        for(MovieComparable movie : movies){
            System.out.println(movie);
        }

    }
    
}
