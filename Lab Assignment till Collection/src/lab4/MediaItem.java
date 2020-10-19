package lab4;

public abstract class MediaItem extends Item {
	private int runtime;

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public MediaItem(int idNum, String title, int numCopies, int runtime) {
		super(idNum, title, numCopies);
		this.runtime = runtime;
	}
	
	@Override
	public String toString() {
		
		return (super.toString() + "Runtime: "+this.runtime);
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Runtime: " + runtime);
	}
}
