package lab6;

	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
 
public class Exercise2 {
	public Map<Character,Integer> countCharacter(char[] arr){
		Map<Character,Integer> map=new HashMap<>();
	for(char c:arr) {
		if(map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}
		else
			map.put(c, 1);
		}
	return map;
	}
	public static void main(String args[])
	{
		Exercise2 obj=new Exercise2();
		char ch[]= {'a','b','b','a','e','a'};
		Map<Character,Integer> map=obj.countCharacter(ch);
		System.out.println(map.toString());
	}
}