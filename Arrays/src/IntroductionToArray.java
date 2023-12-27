// import java.util.Scanner;

public class IntroductionToArray {
    public static void main(String[] args) {
        //creation and intilization of the array
        int A[]=new int[5];//initialized with 0 itself
        int B[]={1,2,3,4,5};

       System.out.println("the length of the array A is " + A.length);
       System.out.println("The length of the array B is " + B.length);

       //using for each loop for accessing the elements of the array B
       for(int x:B)
       System.out.println("the value of element is " + x);

       //the array operator can be used before the variable name of the array
       int []C={1,2,3,4,5,6,7,8,9};//different from java
       System.out.println("The length of the array C is " + C.length);

    }
}
