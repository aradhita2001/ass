/*
You want to build a CRUD application for Movie using JDBC & MYSQL. In the Movie system implement a function that retrieves a movie’s record based on their movieId. 
 If a movie does not exist for the given movietId, a custom exception named RecordNotFoundException should be thrown.
The Movie entity has the following fields: 

•	movieID
•	movieName
•	movieFeedback

    CREATE TABLE movies (
    movieID INT AUTO_INCREMENT PRIMARY KEY,
    movieName VARCHAR(255) NOT NULL,
    movieFeedback TEXT
    );
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        MovieDAO movieDao = new MovieDAO();

        // Create a new Movie record
        Movie Movie1 = new Movie();
        Movie1.setMovieName("PK");
        Movie1.setMovieFeedback("Excellent");
        movieDao.createMovie(Movie1);

        // Retrieve a Movie's record by MovieID
        try {
            Movie retrievedMovie = movieDao.getMovieByID(Movie1.getMovieID());
            System.out.println("Retrieved Movie: " + retrievedMovie.getMovieName());
            System.out.println("Movie Feedback: " + retrievedMovie.getMovieFeedback());
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Clean up and close the database connection
        movieDao.close();
    }
}



class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/healthcare_wecp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hellowecp";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}

class Movie {
    private int movieID;
    private String movieName;
    private String movieFeedback;

    public Movie() {
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieFeedback () {
        return movieFeedback;
    }

    public void setMovieFeedback (String movieFeedback) {
        this.movieFeedback = movieFeedback;
    }
}

class MovieDAO {

    private Connection connection;

    public MovieDAO() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a Movie record
    public void createMovie(Movie movie) {
        String sql = "INSERT INTO Movies(movieName, movieFeedback) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, movie.getMovieName());
            statement.setString(2, movie.getMovieFeedback ());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                movie.setMovieID(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Movie getMovieByID(int movieID) throws RecordNotFoundException {
        String sql = "SELECT * FROM Movies WHERE movieID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, movieID);
            ResultSet resultSet= statement.executeQuery();

            if (resultSet.next()) {
                Movie movie = new Movie();
                movie.setMovieID(resultSet.getInt("movieID"));
                movie.setMovieName(resultSet.getString("movieName"));
                movie.setMovieFeedback(resultSet.getString("movieFeedback"));
                return movie;
            } else {
                throw new RecordNotFoundException("Movie with ID " + movieID + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class RecordNotFoundException extends Exception {

    public RecordNotFoundException() {
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
    
}