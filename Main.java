import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter amount: ");
    int amount = input.nextInt();

    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int penny = 0;
    int total = quarter + dime + nickel + penny;
    while (amount > 0){
      if(amount >= 25){
        quarter += 1;
        total++;
        amount = amount - 25;
      }
      else if (amount >= 10){
        dime += 1;
        total++;
        amount = amount - 10;
      }
      /*else if(amount >= 5){
        nickel += 1;
        total++;
        amount = amount - 5;
      }*/
      else {
        penny += 1;
        total++;
        amount = amount - 1;
      }
    }
    System.out.println("Quarters: " + quarter);
    System.out.println("Dimes: " + dime);
    System.out.println("Nickels: " + nickel);
    System.out.println("Pennies: " + penny);
    System.out.println("Total amount of coins: " + total);
      
  }
}