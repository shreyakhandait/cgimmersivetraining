package lab4;

public abstract class Item {
	private int idNum;
	private String title;
	private int numCopies;

	public Item() {
		idNum = 0;
		title = " ";
		numCopies = 0;
	}

	public Item(int idNum, String title, int numCopies) {
		this.idNum = idNum;
		this.title = title;
		this.numCopies = numCopies;
	}

	public void addItem(int idNum, String str, int n) {
		setidNum(idNum);
		setTitle(str);
		setNumCopies(n);
	}

	@Override
	public String toString() {
		String temp = "ID: " + idNum + " Title: " + title + " Number of Copies: " + numCopies;
		return temp;
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + idNum);
		System.out.println("Number of copies: " + numCopies);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		Boolean b = (this.getidNum() == ((Item) obj).getidNum()) && (this.getTitle() == ((Item) obj).getTitle())
				&& (this.getCopies() == ((Item) obj).getCopies());
		return b;
	}

	public void checkIn() {
		numCopies = numCopies + 1;
	}

	public void checkOut() {
		numCopies = numCopies - 1;
	}

	// getters and setters:
	public int setidNum(int id) {
		idNum = id;
		return id;
	}

	public String setTitle(String str) {
		title = str;
		return str;
	}

	public int setNumCopies(int n) {
		numCopies = n;
		return n;
	}

	public int getidNum() {
		return idNum;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return numCopies;
	}

}
