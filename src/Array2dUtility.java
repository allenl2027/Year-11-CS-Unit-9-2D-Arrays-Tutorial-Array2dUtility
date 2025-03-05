
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] intArr){
        for(int[] row:intArr){
            for(int col:row){
                System.out.print(col+" ");
            }
        }
        System.out.println();
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] intArr){
        int tot=0;
        for(int[] row:intArr){
            for(int col:row){
                tot+=col;
            }
        }
        return tot;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] intArr) {
        if (intArr==null||intArr.length==0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int tot=sum(intArr);
        int elem=0;
        for(int[] row:intArr) {
            elem+=row.length;
        }
        if(elem==0) {
            throw new IllegalArgumentException("Array has no elements");
        }
        return (double) tot/elem;
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] intArr){
        int mini=Integer.MAX_VALUE; // Fix: Initialize to MAX_VALUE
        for(int[] row:intArr) {
            for(int col:row) {
                if(col<mini) mini=col;
            }
        }
        return mini;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] intArr){
        int maxi=Integer.MIN_VALUE;
        for(int[] row:intArr){
            for(int col:row){
                if(col>maxi) maxi=col;
            }
        }
        return maxi;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] intArr){
        int cou=0;
        for(int i=0;i<intArr.length;i++){
            for(int j=0;j<intArr[i].length;j++){
                if(intArr[i][j]%2==0) cou+=1;
            }
        }
        return cou;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] intArr){
        int cou=0;
        for(int[] row:intArr){
            for(int col:row){
                if(col%2==0) cou+=1;
            }
        }
        return cou;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] intArr){
        for(int[] row:intArr){
            for(int col:row){
                if(col<0) return false;
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] intArr){
        int[] rowS=new int[intArr.length];
        for(int i=0;i<intArr.length;i++){
            int rsum=0;
            for(int j=0;j<intArr[i].length;j++){
                rsum+=intArr[i][j];
            }
            rowS[i]=rsum;
        }
        return rowS;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] intArr){
        int[] colS =new int[intArr[0].length];
        for(int j=0;j<intArr[0].length;j++){
            int csum=0;
            for(int i=0;i<intArr.length;i++){
                csum+=intArr[i][j];
            }
            colS[j]=csum;
        }
        return colS;
    }
}
