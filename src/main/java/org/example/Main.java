package org.example;

public class Main {
    public static void main(String[] args) {
       //System.out.println(isPalindrome( -1221));
      //System.out.println(isPalindrome( 707));
        //System.out.println(isPalindrome( 11212));
        System.out.println(isPerfectNumber( 28));

    }
//Polidrom sayıyı bulma
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";// 1=>12 =>121
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(number));
    }
//Mükemmel Sayıları Bulma
   public static boolean isPerfectNumber(int number){
        if(number<0)
            return false;

        int total=0;
        for(int i=1;i<number/2;i++){
            if(number%i==0){
                total +=i;
            }
        }
        return number==total;
   }

}