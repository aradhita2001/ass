package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MovieComparator {
    private double rating;
    private String name;
    private int year;

    // public int compareTo(MovieComparator m) {
    //     // return this.year - m.year;
    //     // return -this.name.compareTo(m.name);

    //     if(this.rating > m.rating) return 1;
    //     if(this.rating < m.rating) return -1;
    //     return 0;
    // }

    public MovieComparator (String name, double rating, int year){
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

class RatingCompare implements Comparator<MovieComparator> {
    public int compare (MovieComparator m1, MovieComparator m2){
        if(m1.getRating() < m2.getRating()) return -1;
        if(m1.getRating() > m2.getRating()) return 1;
        return 0;
    }
}

/**
 * NameCompare
 */
class NameCompare implements Comparator<MovieComparator> {

    public int compare(MovieComparator m1, MovieComparator m2) {
        return m1.getName().compareTo(m2.getName());
    }    
}

/**
 * ComparatorDemo
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<MovieComparator> list = new ArrayList<MovieComparator>();
        list.add(new MovieComparator("abc", 2.45, 1988));
        list.add(new MovieComparator("1942", 5, 1994));
        list.add(new MovieComparator("sdf", 4.45, 2009));
        list.add(new MovieComparator("ert", 3.89, 1999));
        list.add(new MovieComparator("cvb", 4.56, 2024));
        list.add(new MovieComparator("sdj", 1.00, 2023));

        RatingCompare ratingComp = new RatingCompare();

        Collections.sort(list, ratingComp);

        for (MovieComparator movie : list) {
            System.out.println(movie);
        }

        System.out.println();
        System.out.println();

        NameCompare nameComp = new NameCompare();
        

        Collections.sort(list, nameComp);

        // Collections.sort(list, nameComp);

        for (MovieComparator movie : list) {
            System.out.println(movie);
        }
    }
}