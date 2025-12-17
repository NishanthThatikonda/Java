package IPA;

import java.util.Arrays;

public class IPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cat";
		String t="act";
		if(s.length()!=t.length()) {
			System.out.println("false");
			}
	

			char[]sArray= s.toCharArray();
			char[]tArray=t.toCharArray();
			Arrays.sort(sArray);
			Arrays.sort(tArray);
			{System.out.println( Arrays.equals(sArray, tArray));}
		}
	}


