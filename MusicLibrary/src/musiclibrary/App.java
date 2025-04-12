package musiclibrary;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		MusicLibrary library = new MusicLibrary();
		
		List<Song> loadedSongs = fileLoader.loadSongsFromFile("songs.txt");
		for (Song song : loadedSongs) {
			library.addSong(song);
		}
		
		boolean running = true;
		while (running) {
			System.out.println("---MUSIC LIBRARY MENU---");
			System.out.println("(1). View all songs");
			System.out.println("(2). Search by artist");
			System.out.println("(3). Search by title");
			System.out.println("(4). Search by genre");
			System.out.println("(5). Exit");
			System.out.println(">>>: ");
			
			String choice = scanner.nextLine();
			
			switch(choice) {
			case "1" -> {
				List<Song> allSongs = library.getAllSongs();
				if (allSongs.isEmpty()) {
					System.out.println("No songs found in the library.");
				} else {
					allSongs.forEach(System.out::println);
				}
			}
			case "2" -> {
				System.out.println("Enter artist name: ");
				String artist = scanner.nextLine();
				List<Song> results = library.searchByArtist(artist);
				printResults(results);
			}
            case "3" -> {
                System.out.print("Enter song title: ");
                String title = scanner.nextLine();
                List<Song> results = library.searchByTitle(title);
                printResults(results);
            }
            case "4" -> {
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();
                List<Song> results = library.searchByGenre(genre);
                printResults(results);
            }
            case "5" -> {
                running = false;
                System.out.println("Goodbye!");
			}
            default -> System.out.println("Invalid option. Try again.");
		}
	}
		
	scanner.close();

}
    private static void printResults(List<Song> results) {
        if (results.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            results.forEach(System.out::println);
        }
    }
}
