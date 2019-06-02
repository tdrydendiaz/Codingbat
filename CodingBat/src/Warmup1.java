
public class Warmup1 {
		
		
		
	public static void main(String[] args) {
		System.out.println(diff21(3));
		System.out.println(nearHundred(50));
		System.out.println(missingChar("Hello", 4));
		System.out.println(backAround("lemon"));
		System.out.println(startHi("hitan"));
		System.out.println(hasTeen(3, 2, 1));
		System.out.println(mixStart("mixbag"));
		System.out.println(close10(5, 8));	
		System.out.println(stringE("watermelon"));
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
			  if (!weekday || vacation){
			  return true;
			  }
			 return false;
			}
	public static int diff21(int n) {
		  if (n <= 21) {
		    return 21 - n;
		  } else {
		    return (n - 21) * 2;
		  }
		}
	public static boolean nearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		    (Math.abs(200 - n) <= 10));
		}
	
//	Given a non-empty string and an int n, return a new string where the char at index n 
//   has been removed. The value of n will be a valid index of a char in the original string 
//   (i.e. n will be in the range 0..str.length()-1 inclusive).
	public static String missingChar(String str, int n) {
		  String front = str.substring(0, n);
		  String back = str.substring(n+1, str.length());
		  
		  return front + back;
		}
	
//	Given a string, take the last char and return a new string with the last char added 
//	at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
	public static String backAround(String str) {
		  String last = str.substring(str.length() - 1);
		  return last + str + last;
		}
//	Given a string, return true if the string starts with "hi" and false otherwise.
	public static boolean startHi(String str) {
		  if (str.length() < 2) return false;
		  String firstTwo = str.substring(0, 2);
		  if (firstTwo.equals("hi")) {
		    return true;
		  } else {
		    return false;
		  }
		}
	
//	We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//	Given 3 int values, return true if 1 or more of them are teen.

	public static boolean hasTeen(int a, int b, int c) {
		  return (a>=13 && a<=19) ||
		         (b>=13 && b<=19) ||
		         (c>=13 && c<=19);
		}
	
//
//Return true if the given string begins with "mix", except the 'm' 
//can be anything, so "pix", "9ix" .. all count.
	public static boolean mixStart(String str) {
		  
		  if (str.length() < 3) return false;
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		}
	

//Given 2 int values, return whichever value is nearest to the value 10, 
//or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
	public static int close10(int a, int b) {
		  if (Math.abs(10-a)>Math.abs(10-b))return b;
		  if (Math.abs(10-b)>Math.abs(10-a)) return a;
		  {
		    
		  return 0;
		  }
		}
	

//Return true if the given string contains between 1 and 3 'e' chars.
	public static boolean stringE(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		  }

		  return (count >= 1 && count <= 3);
		}

//Given a non-empty string and an int N, return the string made starting with char 0,
//		and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. 
//		N is 1 or more.
	public String everyNth(String str, int n) {
		  String result = "";
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		}
	}


