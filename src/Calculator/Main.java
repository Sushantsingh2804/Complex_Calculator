package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int choice=0;
        while (choice!=11){
            System.out.println("xxxxxxxxxx MENU xxxxxxxxxx");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Simple Interest");
            System.out.println("6. Compound Interest");
            System.out.println("7. Square of a number");
            System.out.println("8. Cube of a number");
            System.out.println("9. Factors of a number");
            System.out.println("10. Divisibility of two numbers");
            System.out.println("11. Exit");
            System.out.println("Enter your Choice-");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    Addition addObj=new Addition();
                    System.out.println("xxxxxx Addition operation xxxxxx");
                    System.out.println("Enter the two numbers = ");
                    System.out.println("result= "+addObj.AddResult(scan.nextInt(),scan.nextInt()));
                    System.out.println("================================================================================");
                    break;
                case 2:
                    System.out.println("xxxxxx Subtraction operation xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 3:
                    System.out.println("xxxxxx Multiplication xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 4:
                    System.out.println("xxxxxx Division xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 5:
                    System.out.println("xxxxxx Simple Interest xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 6:
                    System.out.println("xxxxxx Compound Interest xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 7:
                    System.out.println("xxxxxx Square of a number xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 8:
                    System.out.println("xxxxxx Cube of a number xxxxx");
                    System.out.println("================================================================================");
                    break;
                case 9:
                    System.out.println("xxxxxx Factors of a number xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 10:
                    System.out.println("xxxxxx Divisibility of two numbers xxxxxx");
                    System.out.println("================================================================================");
                    break;
                case 11:
                    System.out.println("xxxxxxx SUCCESSFULLY EXITED THE APPLICATION xxxxxx");
                    break;
                default:
                    System.out.println("!!!!!!!!!! INVALID CHOICE !!!!!!!!!!");
                    System.out.println("================================================================================");
            }
        }
    }
}
