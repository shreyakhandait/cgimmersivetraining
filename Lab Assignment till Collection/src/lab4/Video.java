package lab4;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	
	public Video(int idNum, String title, int numCopies, int runtime, String director, String genre, int year){
		super(idNum, title, numCopies, runtime);
		
		this.director=director;
		this.genre=genre;
		this.year=year;
		}
	
	@Override
	public String toString() {
		
		return (super.toString() + "Director: "+this.director +"Genre: "+this.genre+"Year: "+this.year);
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Director:"+director);
		System.out.println("Genre: "+ genre);
		System.out.println("Year: "+year);
	}
	
	
	
	//getter and setter
	public String getDirector() {
		return director;
	}
	public String getGenre() {
		return genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}
