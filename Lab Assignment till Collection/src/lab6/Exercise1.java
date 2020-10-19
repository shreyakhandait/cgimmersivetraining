package lab6;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Exercise1 {
	public static void main(String args[])
	{
		Exercise1 obj=new Exercise1();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(12,24);
		map.put(45,11);
		map.put(96,74);
		map.put(71,30);
		map.put(32,31);
		List<Integer> list=obj.getValues(map);
		System.out.println(list.toString());
	}
	public List<Integer> getValues(HashMap<Integer,Integer> map){
		Collection<Integer> value=map.values();
		List<Integer> list=new ArrayList<>(value);
		Collections.sort(list);
		return list;
	}
}
