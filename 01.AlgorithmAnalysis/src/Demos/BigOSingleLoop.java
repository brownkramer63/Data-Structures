package Demos;

public class BigOSingleLoop {
    public static void main(String[] args) {
        int numberOfOperations=0;
        int n=100;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);
        // Task 1 Single Loop................... O(n)
        startTime=System.currentTimeMillis();


        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;

        }
        endTime=System.currentTimeMillis();
        System.out.println("number of operation: "+ numberOfOperations+ " in "+(endTime-startTime)+" milliseconds");
        // Task 2 Nested Loops...................
        System.out.println("example 2--------------");
      numberOfOperations=0;
        startTime=System.currentTimeMillis();

        for (int j = 0; j < n; j++){
        for (int i = 0; i < n; i++) {
            numberOfOperations+=1;

        }}
        endTime=System.currentTimeMillis();
        System.out.println("number of operation: "+ numberOfOperations+ " in "+(endTime-startTime)+" milliseconds");
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................
        System.out.println("example 3--------------");



        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops...................
        // Task 4 End...................

        // Task 5 Logarithmic Complexity...................
        System.out.println("log example");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();


//        for (int i = 0; i < n; i*=2) {
//            numberOfOperations+=1;
//
//        }
        endTime=System.currentTimeMillis();
        System.out.println("number of operations with logarithmic: "+ numberOfOperations+ " in "+(endTime-startTime)+" milliseconds");
        // Task 5 End...................*/
    }
}
