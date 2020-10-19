package lab4;

public class ItemMain {

	public static void main(String[] args) {
		int i=0;
		Item var[]=new Item[20];
		var[i++]=new Book(01, "Malgudi Tales", 4,"Someone");
		var[i++]=new JournalPaper(02, "Paper on CSS", 4, "Dell", 2020);
		var[i++]=new CD(03, "CD on Temples", 5,5,"Artist 1","Genre: Devotional");
		var[i++]=new Video(04, "Video 1", 2,5,"Me","Anything",2020);
		System.out.println("Via toString() method:");
		for(int temp=0;temp<i;temp++) {
			System.out.println(var[temp]);
		}
		System.out.println("Via print() method:");
		for(int temp=0;temp<i;temp++) {
			var[temp].print();
		}

	}

}
