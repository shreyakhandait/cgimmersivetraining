package lab4;
public abstract class WrittenItem extends Item {
	private String author;

	void setAuthor(String str) {
		author = str;
	}

	String getAuthor() {
		return author;
	}

	public WrittenItem(int idNum, String title, int numCopies, String author) {
		super(idNum, title, numCopies);
		this.author = author;
	}

	@Override
	public String toString() {

		return (super.toString() + "Author: " + this.author);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author: " + author);
	}

}
