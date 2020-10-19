package lab1;
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter choice\nRed\nYellow\nGreen");
        System.out.println();
        String s=sc.next();
        	switch(s)
        {
        case "red":System.out.println("stop");break;
        case "yellow":System.out.println("ready");break;
        case "green":System.out.println("go");break;
        default:System.exit(0);
        }
	}
}
