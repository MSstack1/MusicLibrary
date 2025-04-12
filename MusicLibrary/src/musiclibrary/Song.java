package musiclibrary;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String genre;
	private int lengthInSeconds;
	
	public Song(String title, String artist, String album, String genre, int lengthInSeconds ) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.lengthInSeconds = lengthInSeconds;
		
	}
	
	public String getTitle() { return title; }
	public String getArtist() { return artist; }
	public String getGenre() { return genre; }
	
	public String toString() {
		return this.title + " by " + artist + " (" + genre + ")";
	}
}
