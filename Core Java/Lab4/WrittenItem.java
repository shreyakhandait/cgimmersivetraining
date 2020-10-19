package inheritance;

abstract class WrittenItem extends Item{
private String author;
public WrittenItem(int idNum, String str, int n, String author2, int y) {

}
public WrittenItem() {
}
public WrittenItem(int id, String str, int n) {
}
void setAuthor(String str){
author = str;
}
String getAuthor(){
return author;
}
public int getidNum(){
return super.getidNum();
}
public String getTitle(){
return super.getTitle();
}
public int getNumCopies(){
return super.getCopies();
}
public boolean equals(Object obj){
if(obj == null)
return false;
WrittenItem otherWrittenItem = (WrittenItem) obj;
return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
}
public int getIdNum() {
	// TODO Auto-generated method stub
	return 0;
}
}
