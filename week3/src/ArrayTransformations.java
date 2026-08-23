public class ArrayTransformations {
    static void reverseInPlace(int[] arr){
        int n = arr.length;
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }

    static int[] reversedCopy(int[] arr){

        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    static int removeValue(int[] arr, int target){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != target){
                arr[index] = arr[i];
                index++;
            }
            }
        return index;
        }



    static int[] runningSum(int[] arr){

        int[] result = new int[arr.length];
        result[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            result[i] = result[i-1] + arr[i];
        }
        return result;
    }
    }




