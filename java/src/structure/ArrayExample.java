package structure;

public class ArrayExample {

    public static void main(String[] args) {
        // 1. Initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // 2. Access elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // 3. Modify elements
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // 4. Iterate through the array
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 5. Find the length of the array
        System.out.println("Length of the array: " + numbers.length);

        // 6. Declare an array
        int[] array = new int[10];
        for (int index : array){
            System.out.print(array[index] + " ");
        }
    }
}
