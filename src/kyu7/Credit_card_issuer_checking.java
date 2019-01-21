package kyu7;

public class Kata {
	  public static String getIssuer(String cardNumber) {
	   String a=cardNumber.substring(0,2);
	   if(a.equals("51") ||a.equals("52")||a.equals("53")||a.equals("54")||a.equals("55")){
	   if(cardNumber.length()==16)System.out.println("Mastercard");
	   else System.out.println("Unknown");
	  }
	  else if(a.equals("34") || a.equals("37")){
	   if(cardNumber.length()==15)System.out.println("AMEX");
	   else System.out.println("Unknown");
	   }
	   else if(a.substring(0,1).equals("4")){
	   if(cardNumber.length()==13 || cardNumber.length()==16) System.out.println("AMEX");
	   else System.out.println("Unknown");
	   }
	   else if(cardNumber.substring(0,5).equals("6011") && cardNumber.length()==16)
	   System.out.println("Discover");
	   else System.out.println("Unknown");
	}
}