package lab4;
public class JournalPaper extends WrittenItem {
	private int pubYear;

	public JournalPaper(int idNum, String title, int numCopies, String author, int pubYear) {
		super(idNum, title, numCopies, author);
		this.pubYear = pubYear;
	}
	
	@Override
	public String toString() {
		
		return (super.toString() + "Publish Year: "+this.pubYear);
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Publish Year: " + pubYear);
	}
}
