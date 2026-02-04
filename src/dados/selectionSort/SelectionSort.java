package dados.selectionSort;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i=0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] numeros = {29,10,14,37,13};
        System.out.println(numeros.length);

        System.out.println("Antes: ");
        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println("");
        System.out.println("Depois");
        selectionSort(numeros);
        for (int num : numeros) {
            System.out.println(num);
        }

    }

}
