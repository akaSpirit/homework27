public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Movie movie = FileService.readFile();
        String fmt = String.format("%s", movie.movies).replace("[","").replace("]","").replace(",","");
        System.out.println(fmt);
    }
}
