import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    System.out.println("Enter amount");
    int amount = nextInt();

    int quarter = 0;
    int dime = 0;
    int nickel = 0;
    int penny = 0;
    while (amount > 0){
      if(amount > 25){
        quarter++;
        amount = amount - 25;
      }
      if (amount > 10){
        dime++;
        amount = amount - 10;
      }
      if(amount > 5){
        nickel++;
        amount = amount - 5;
      }
      if (amount > 1){
        penny++;
        amount = amount - 1;
      }
    }
      
  }
}