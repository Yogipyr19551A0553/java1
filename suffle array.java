import java.util.Random;

public class Main {
    public static void suffle(int[] arr) 
    {
        Random k = new Random();
        for (int i = arr.length - 1; i > 0; i--) 
        {
            int index = k.nextInt(i + 1);
            // Swap array[i] and array[index]
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        suffle(array);
        
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}

