package Views;

import Model.Filingcabinets;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      System.out.println("nhap thong tin can tim kiem danh sach tu ho so,(vi du:nguyen van A)");
      Stack<Filingcabinets> filingcabinetsStack = new Stack<>();
       Filingcabinets filingcabinets1 = new Filingcabinets("nguyen van A",22,"thang binh");
        Filingcabinets filingcabinets2 = new Filingcabinets("nguyen van B",23,"thang binh");
       Filingcabinets filingcabinets3 = new Filingcabinets("nguyen van C",25,"da nang");
        showPush(filingcabinetsStack,filingcabinets1);
        showPush(filingcabinetsStack,filingcabinets2);
        showPush(filingcabinetsStack,filingcabinets3);
        String resultSearchStack = scanner.nextLine();
        printStack(filingcabinetsStack, resultSearchStack);
    }
    public static void printStack(Stack<Filingcabinets> filingcabinetsStack, String resultSearchStack) {
        while (!filingcabinetsStack.empty()) {
            String nameElement = filingcabinetsStack.pop().toString();
            if (nameElement.equals(resultSearchStack)) {
                System.out.println(resultSearchStack+" exited.");

            }
        }
    }

    public static void  showPush(Stack stack,Filingcabinets filingcabinets ) {
        stack.push(filingcabinets);
    }
}
