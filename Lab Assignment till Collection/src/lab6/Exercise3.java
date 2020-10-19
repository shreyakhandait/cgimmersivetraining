package lab6;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Exercise3 {
	public Map<Integer,Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, i*i);
		}
		return map;
	}
	public static void main(String[] args) {
		int arr[]= {5,7,2,1,9,12};
		Exercise3 obj=new Exercise3();
		Map<Integer,Integer> map=obj.getSquares(arr);
		System.out.println(map.toString());
	}
}
