import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {
    List<Movie> movies = new ArrayList<>();
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] cast;

    public Movie() {
    }

    public static class Director {
        private String fullName;

        @Override
        public String toString() {
            return fullName;
        }
    }

    public static class Cast {
        private String fullName;
        private String role;

        @Override
        public String toString() {
            return String.format("%s as '%s'", fullName, role);
        }
    }

    @Override
    public String toString() {
        return String.format("%nName: %s " +
                        "%nYear: %s " +
                        "%nDescription: %s " +
                        "%nDirector: %s " +
                        "%nCast: %s %n",
                        name,
                        year,
                        description,
                        director,
                        Arrays.toString(cast).replace("[", "").replace("]", ""));
    }
}
