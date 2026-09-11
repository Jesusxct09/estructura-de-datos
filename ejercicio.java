import java.util.Scanner;

public class ejercicio {

    public static int findEle(int[] arr, int l, int h, int targetValue) {

        // Se busca directamente porque el arreglo original no está ordenado.
        for (int i = l; i <= h; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] InputArr = {12, 34, 10, 6, 40, 89, 98, 57, 19, 69};

        System.out.print("Ingrese el elemento a buscar: ");
        int targetElement = scanner.nextInt();

        int s = InputArr.length;

        int idx = findEle(InputArr, 0, s - 1, targetElement);

        if (idx != -1) {
            System.out.println("El elemento se encuentra en la posicion: " + (idx + 1));
        } else {
            System.out.println("El elemento no se encuentra en el arreglo");
        }

        scanner.close();
    }
}

