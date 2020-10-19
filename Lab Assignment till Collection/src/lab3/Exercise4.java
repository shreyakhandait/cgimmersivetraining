package lab3;
public class Exercise4 {
	public static int modifyNumber(int num){
	    
	    String str = Integer.toString(num);
	    char[]  s=str.toCharArray();
	    int len=s.length;
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<len-2;i++){
	      int a,b;
	      a=Character.getNumericValue(s[i]);
	      b=Character.getNumericValue(s[i+1]);
	     
	      char c= (char)((a-b)+'0');
	     
	      if(a>b)
	        sb.append(c);
	        
	      else
	        sb.append( (char)((b-a)+'0'));
	      
	    }
	    
	    sb.append(s[len-1]);
	    String fin=sb.toString();
	    System.out.println(fin);
	    int k=Integer.parseInt(fin);
	    return k; 
	    
	  }
	  
	  public static void main (String[] args) {
	    int x=43321;
	    System.out.println(modifyNumber(x));
	  }
}
