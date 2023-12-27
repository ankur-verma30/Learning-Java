import java.util.Scanner;
public class ReguarlExpressionWithMetaCharacters{
    
    public static void main(String[] args) {
        
        //taking any string in any number of times
        String str0="agafh039w0ru gg a0=";
        System.out.println(str0.matches(".*"));//dot means any character but single and *represent the single character canbe present


        //the string should be of fixed length
        String str1="agggar";
        System.out.println(str1.matches("[a-z]{6}"));

        //taking input from the user for and to check they have valid email id
        Scanner myobj=new Scanner(System.in);
        String emailId;

        System.out.println("Enter the user email address and press enter to continue");
        emailId=myobj.nextLine();

        System.out.println(emailId.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+"));
        myobj.close();

    }
}
