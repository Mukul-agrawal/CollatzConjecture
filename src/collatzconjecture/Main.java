package collatzconjecture;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Collatz obj = new Collatz();
        ArrayList<Integer> list = obj.getCollatzString(num);
        System.out.println("It takes " + list.size() + " steps to reach '1' using the Collatz conjecture on the number " + num + ".");
        System.out.println(list);
    }
}

