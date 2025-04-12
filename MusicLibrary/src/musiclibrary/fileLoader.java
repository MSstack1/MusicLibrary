package musiclibrary;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class fileLoader {

	public static List<Song> loadSongsFromFile(String filename) {
		List<Song> songs = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get("songs.txt"));
			
			for (String line : lines) {
				String[] parts = line.split(",");
				String title = parts[0];
				String artist = parts[1];
				String album = parts[2];
				String genre = parts[3];
				int lengthInSeconds = Integer.parseInt(parts[4]);
				
				songs.add(new Song(title, artist, album, genre, lengthInSeconds));
			}
			System.out.println("File read successful!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return songs;
	}

}
