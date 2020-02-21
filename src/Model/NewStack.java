package Model;

import Model.Filingcabinets;

import java.util.Scanner;
import java.util.Stack;

public class NewStack {
    Stack<Filingcabinets> filingcabinetsStack = new Stack<>();
    static Scanner scanner = new Scanner(System.in);

    public static void  showPush(Stack stack,Filingcabinets filingcabinets ) {
        stack.push(filingcabinets);
    }
    public static void printStack(Stack<Filingcabinets> filingcabinetsStack, String resultSearchStack) {
        while (!filingcabinetsStack.empty()) {
            String nameElement = filingcabinetsStack.pop().toString();
            if (nameElement.equals(resultSearchStack)) {
                System.out.println(resultSearchStack+" exited.");
            }
        }
    }

}
