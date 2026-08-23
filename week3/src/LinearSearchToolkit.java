public class LinearSearchToolkit{

    static boolean contains(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }

    static int firstIndexOf(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOf(int[] arr, int target){
        for(int i = arr.length; i >= 0; i--){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int countOccurrences(int[] arr, int target){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                c++;
            }
        }
        return c;

    }



}