public class ArrayStatistics {

    static int Sum(int arr[]){

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static double average(int arr[]){
        double average = 0;
        for(int i = 0; i < arr.length; i++){
            average += arr[i];
        }
        return average/2;
    }

    static int min(int arr[]){
        int min = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int even(int arr[]){
        int even = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }
    static int odd(int arr[]){
        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                odd++;
            }
        }
        return odd;
    }

    static void printSignCounts(int arr[]){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive++;
            }
            else if(arr[i] < 0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);

    }

}
