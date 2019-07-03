package teret;

import java.util.HashMap;
import java.util.Scanner;

public class Substring {
	public static void najduziSubstring(String s) {
		char[] rec= s.toCharArray();
		String najduzi="";
		int duzinaSubstringa=0;
		HashMap<Character, Integer> mapa= new HashMap<Character, Integer>();
		
		for(int i=0;i<rec.length;i++) {
			char c=rec[i];
			if(!mapa.containsKey(c)) {
				mapa.put(c,i);
			}else {
				i=mapa.get(c);
				mapa.clear();
			}
			if(mapa.size()>duzinaSubstringa) {
				duzinaSubstringa=mapa.size();
				najduzi=mapa.keySet().toString();
			}
		}
		System.out.println("Najduzi substring je: " + najduzi );
		System.out.println("Njegova duzina je: " +duzinaSubstringa);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		najduziSubstring(s);
		

	}

}
