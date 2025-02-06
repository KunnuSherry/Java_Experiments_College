import java.util.Arrays;
import java.util.Scanner;

class Stacks{
    private int top;
    private int tsize;
    private int usize;
    private int[] arr;

    Stacks(int size){
        this.tsize = size;
        this.usize = 0;
        this.top=-1;
        this.arr = new int[size];
    }

    boolean isFull(){
        if(tsize==usize){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(usize==0){
            return true;
        }
        return false;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow !");
            return;
        }
        this.arr[++top]=val;
        usize++;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow !");
            return -1;
        }
        int val = -1;
        val = this.arr[top];
        this.arr[top]=0;
        top--;
        usize--; 
        return val;   
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    void print(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Code By Kunal_Sharma_011_CSE-A\nPlease Enter the size of Stack you want: ");
        int size = sc.nextInt();
        Stacks s = new Stacks(size);
        System.out.println("After Pushing:");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.print();
        System.out.println();
        System.out.println("After Popping");
        s.pop();
        s.print();
        System.out.println();
        System.out.println("The top element is: "+ s.peek());
    }
}