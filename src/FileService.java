import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("./movies.json");

    public static Movie readFile(){
        String json = "";
        try{
            json = Files.readString(PATH);
        } catch(IOException e){
            System.out.println("\nFile not found " + e.getMessage());
        }
        return GSON.fromJson(json, Movie.class);
    }

    public static void writeFile(Movie movie){
        String json = GSON.toJson(movie);
        try{
            byte[] arr = json.getBytes();
            Files.write(PATH, arr);
        }catch (IOException e){
            System.out.println("\nFile not found " + e.getMessage());
        }
    }


}

