package capg.com;

public class Enum {

	public static void main(String[] args) {
		shoes shoes = new shoes();
		shoes.Category=category.sports;
		shoes.size=Size.xl;
		
	}

}
enum Size{
	xs;
}
enum category {
	casual, sports, officeuse;
}
class shoes{
	private category category; //casual, sports, office
	private Size size;
}