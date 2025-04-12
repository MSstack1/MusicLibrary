package musiclibrary;
import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
	private List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public List<Song> getAllSongs() {
		return songs;
	}
	
	public List<Song> searchByArtist(String artist) {
		return songs.stream()
				.filter(song -> song.getArtist().equalsIgnoreCase(artist))
				.toList();
	}
	
	public List<Song> searchByTitle(String title) {
		return songs.stream()
				.filter(song -> song.getTitle().equalsIgnoreCase(title))
				.toList();
	}
	
	public List<Song> searchByGenre(String genre){
		return songs.stream()
				.filter(song -> song.getGenre().equalsIgnoreCase(genre))
				.toList();
	}

}
