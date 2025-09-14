import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Count the occurrences of each number in an array of 10 integers
public class CountNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int arr[] = new int[10];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number :");
                arr[i] = input.nextInt();
            }
            countNumber(arr);
        }
    }

    public static void countNumber(int[] numArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : numArray) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> iterator : map.entrySet()){
            System.out.println("Number: " + iterator.getKey() + " Count: " 
            + iterator.getValue());
        }
    }
}