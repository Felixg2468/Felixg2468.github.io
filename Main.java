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
    while (amount > 0){
      if(amount >= 25){
        quarter += 1;
        amount = amount - 25;
      }
      else if (amount >= 10){
        dime += 1;
        amount = amount - 10;
      }
      else if(amount >= 5){
        nickel += 1;
        amount = amount - 5;
      }
      else {
        penny += 1;
        amount = amount - 1;
      }
    }
    System.out.println(quarter);
    System.out.println(dime);
    System.out.println(nickel);
    System.out.println(penny);
      
  }
}