public class MakeChange {
    public static void main(String[] args) { 
   int dollars = 5;
   int cents = 48;
   int money = (dollars * 100) + cents;
   
   System.out.println("quarters = " + (money / 25));
   int  quarters = (money / 25);
   for(int i = 0; i<quarters; i++){
      System.out.print("*");
   }
   money = money % 25;

   System.out.println("\ndimes = " + (money / 10));
   int  dimes = (money / 10);
   for(int i = 0; i<dimes; i++){
      System.out.print("*");
   }
   money = money % 10;
  
   System.out.println("\nnickels = " + (money / 5));
     int  nickels = (money / 5);
     for(int i = 0; i<nickels; i++){
     System.out.print("*");
   }
   money = money % 5;
  
   
   System.out.println("\npennies = " + money); 
         int  pennies = money;
         for(int i = 0; i<pennies; i++){
         System.out.print("*");
         }
    }
}



