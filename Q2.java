/* Java program to add two integer number(user input) */

import java.util.Scanner;

class Sum{
    private int num1,num2;
    
    void setInput(int x, int y){
        num1 = x;
        num2 = y;
    }

    int sum(){

        int sum = num1+num2;
        return sum;
    }
}
class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter second number :");
        int y = sc.nextInt();
        
        Sum obj1 = new Sum();
        obj1.setInput(x, y);
        
        System.out.println("Sum :" + obj1.sum());
    }
}
