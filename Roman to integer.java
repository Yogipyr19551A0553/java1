import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
    public static void main(String args[]) {
        Main obj=new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman Number in capital letters: ");
        String str= sc.nextLine();
        System.out.println("The Integer value for given Roman number is:" +obj.romanToInt(str));
   }
   int NumValue(char ex){
        if (ex == 'I')
             return 1;
        if (ex == 'V')
            return 5;
        if (ex == 'X')
            return 10;
        if (ex == 'L')
            return 50;
        if (ex == 'C')
            return 100;
        if (ex == 'D')
            return 500;
        if (ex == 'M')
            return 1000;
        return -1;
   } 
   int romanToInt(String str) {
        int sum = 0;
        for (int i=0;i<str.length();i++) {
            int a1=NumValue(str.charAt(i));
            if (i+1<str.length()) {
                int a2=NumValue(str.charAt(i+1));
                if (a1>=a2) {
                    sum=sum+a1;
                }
                else {
                    sum=sum-a1;
                } 
            }
            else {
                sum=sum+a1;
            } 
        }
        return sum;
   }
}