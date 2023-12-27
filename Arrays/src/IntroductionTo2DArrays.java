public class IntroductionTo2DArrays {
    public static void main(String[] args) {
        //creating two dimensional array
        int A[][]=new int[3][4];
        int B[][]={{1,2,3,},{1,2,3,},{1,2,3}};

       //can be initialized in two steps also
       int C[][];
       int []F[];//this also works with the array
       C=new int[3][2];//all three initalization works perfectly
       
       int [] E,G[];//this means that E is the single dimensional array whereas G is the two dimensional array as first operator of the array is with the data type hence it will be the part of the F in initalization also


       //accessing the element of the B using for loop
       for(int i=0;i<B.length;i++){
        for(int j=0;j<B[0].length;j++)
            System.out.print(B[i][j]+" ");
       }
System.out.println("");//changing the line

       //accessing the element of the array using for each loop iteration
       for(int x[]:B){
           for(int y:x){
            System.out.print(y+" ");
        }
       }

       //creating the jagged arrauy
       int D[][];
       D=new int[2][];
       D[0]=new int[2];
       D[1]=new int[4];


        
    }
}
