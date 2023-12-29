public class VaraibleArgumentFunction {
/*
    static int SumVariableValue(int...x){
        int sum=0;
        for(int y:x)
        sum+=y;

        return sum;
    }
    */
    static int SumVariableValue(int x, int...y){
        int sum=0;

        for(int z:y)
        sum+=z;
        System.out.println("This is the sum of all the values except the first argument passed in the function " + sum);
        System.out.println("After adding the value of the first argument ");

        return sum+x;
    }
    public static void main(String[] args) {
        System.out.println("We will be using varaible argument function ");

        System.out.println("Passing 2 arguments " + SumVariableValue(10,20));
        System.out.println("");
        System.out.println("Passing 5 arguments " + SumVariableValue(10,20,30,40,50));
        System.out.println("");

        System.out.println("Can also pass an array as the argument");
        int x=5;
        int A[]={1,2,3,4,5,6,7,8,9};
        System.out.println("The sum of the values of the array is "+ SumVariableValue(x,A));

    }
}
