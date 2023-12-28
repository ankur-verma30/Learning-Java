public class IntroductionToMethods {

    static int maximumValue(int x,int y){  //passes the copy of the parameters and original values will not be modified it some modifications are done inside the method
        //i have to make the methods static as we are calling inside the static method 

        x++;
        System.out.println("the value of x is " + x );
        return x > y ? x : y;
    }

    static void update(int A[]){//string objects are immutables but other objects are passed by reference like in c++ code+9
        A[0]=35;
    }
    public static void main(String[] args) {
        int x=5;
        int y=7;
        int result;
        result=maximumValue(x,y);
        System.out.println("the result of the maximum value between " + x + " and " + y + " is " + result);

        //can also be called by making the object of the class this can be done without making the method static but it consumes more memory
        IntroductionToMethods mp=new IntroductionToMethods();
        System.out.println("the value of the maximum value between " + x + " and " + y +" is "+ mp.maximumValue(x, y));

        int A[]={12,2,3,4,56};
        update(A);
        System.out.println("the value of A[0] is "+A[0]);//it is updated hence the object are passed by reference
    }


}
