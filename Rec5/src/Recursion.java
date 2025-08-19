public class Recursion {

    //maximum number in an array
    public static int maxNumInAnArray(int [] array,int i, int max){

        if (i == array.length){
            return max;
        }

        if (array[i] > max){
            max = array[i];
        }

        return maxNumInAnArray(array, i+1, max);
    }
}
