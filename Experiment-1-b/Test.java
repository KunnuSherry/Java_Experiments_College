// ??Addition of 3 numbers using command line arguments

public class Test{
    public static void main(String args[]){
        System.out.println("Kunal_11_CSEA");
        System.out.print("Sum is: ");
        int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);
        System.out.println(sum);
    }
}


//In the terminal write
// >>javac Test.java
// >>java Test 10 20 30
