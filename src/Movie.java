import java.util.*;

public class Movie implements Comparable<Movie> {
    List<Movie> movies = new ArrayList<>();
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] cast;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    public String getDirectorFullName() {
        return director.getFullName();
    }

    public Cast[] getCast() {
        return cast;
    }

    @Override
    public int compareTo(Movie o) {
        if (this.getName().equals(o.getName())) {
            return this.getDescription().compareTo(o.getDescription());
        }
        return this.getName().compareTo(o.getName());
    }
}
