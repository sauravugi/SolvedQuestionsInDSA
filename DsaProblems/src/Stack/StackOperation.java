package DsaProblems.src.Stack;

import java.util.Arrays;

public class StackOperation {
    private static int size = 0;
    public static void main(String[] args) {
        int[] stack = new int[6];
        StackOperation so = new StackOperation();
        so.printStack(stack);
        so.pushInStack(5,stack);     //[5,0,0,0,0,0]
        so.printStack(stack);
        so.pushInStack(10,stack);    //[5,10,0,0,0,0]
        so.printStack(stack);
        so.pushInStack(12,stack);    //[5,10,12,0,0,0]
        so.printStack(stack);
        so.pushInStack(19,stack);    //[5,10,12,19,0,0]
        so.printStack(stack);
        so.pushInStack(20,stack);    //[5,10,12,19,20,0]
        so.printStack(stack);
        so.pushInStack(25,stack);    //[5,10,12,19,20,25]
        so.printStack(stack);

        so.pushInStack(4,stack);     // Stack is full
        so.popInStack(stack);
        so.printStack(stack);
    }
    private void pushInStack(int n , int[] stack){
        if(this.size == stack.length) System.out.println("Stack is full");
        else stack[this.size++] = n;
    }
    private void popInStack(int[] stack){
        if(this.size == 0) System.out.println("Stack is empty");
        else stack[stack.length-1] = 0;
        --this.size;
    }
    private void peakInStack(int[] stack){
        System.out.println(stack[this.size]);
    }
    private void printStack(int[] stack){
        System.out.println(Arrays.toString(stack));
    }
}
