Greedy Algorithm for Coin Change
This Java program demonstrates a simple implementation of the greedy algorithm for making change. The program prompts the user to enter an amount in cents and then calculates the minimum number of quarters, dimes, nickels, and pennies needed to make that amount.

How to Use
Compile the Program:

Open a terminal or command prompt.
Navigate to the directory containing the Java file (Main.java).
Compile the program using the following command:
bash
Copy code
javac Main.java
Run the Program:

Run the compiled program with the following command:
bash
Copy code
java Main
The program will prompt you to enter the amount in cents.
Enter Amount:

Type the amount in cents and press Enter.
View Results:

The program will then calculate the minimum number of quarters, dimes, nickels, and pennies needed to make the entered amount.
The output will display the count of each coin denomination and the total number of coins.
Example
bash
Copy code
Enter amount:
67
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 2
Total amount of coins: 6
Explanation
The program uses a greedy approach by selecting the largest coin denomination (quarters) first and then proceeding to smaller denominations. It repeats this process until the remaining amount becomes zero.

Note: The commented-out section for nickels is included for reference, and you can uncomment it if you want to include nickels in the coin change calculation.

Feel free to modify and explore the code to understand how the greedy algorithm efficiently handles coin change problems.





