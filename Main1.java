import java.util.Scanner;
public class Main1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float a,b,result;
            int choice;
            System.out.println("Enter First number:");
            a=sc.nextFloat();
            System.out.println("Enter Second Number");
            b=sc.nextFloat();
            System.out.println("Arithmatic Operations");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.DIVISION");
            System.out.println("4.MULTIPLICATION");
            System.out.println("5.MOD");
            System.out.println("Enter choice:");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    result=a+b;
                    System.out.println("Result:" +result);
                    break;
                case 2:
                    result=a-b;
                    System.out.println("Result:" +result);
                    break;
                case 3:
                    result=a/b;
                    System.out.println("Result:" +result);
                    break;
                case 4:
                    result=a*b;
                    System.out.println("Result:" +result);
                    break;
                case 5:
                    result=a%b;
                    System.out.println("Result:" +result);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            sc.close();
        }
    }
