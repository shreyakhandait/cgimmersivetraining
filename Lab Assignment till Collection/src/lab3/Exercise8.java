package lab3;
public class Exercise8 {
	public static boolean positiveString(String str){
	      for(int i=0;i<(str.length()-1);i++){
	        if(!(str.charAt(i)<str.charAt(i+1)))
	          return false;
	      }
	      return true;
	    }
	  
	  
	  
	    public static void main(String[] args) {
	        String str="ANT";
	        if(positiveString(str))
	          System.out.println("Positive String");
	        else
	          System.out.println("Not positive String");
	    }
}
