package lab4;
public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(int idNum, String title, int numCopies, int runtime, String artist, String genre) {
		super(idNum, title, numCopies, runtime);

		this.artist = artist;
		this.genre = genre;

	}

	@Override
	public String toString() {
		return (super.toString() + "Artist: " + this.artist+"Genre: "+this.genre);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Artist: " + artist);
		System.out.println("Genre: "+ genre);
	}

	// getters and setters
	public String getGenre() {
		return genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
