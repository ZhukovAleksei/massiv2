import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 3;
        int[][] mas = new int[SIZE][SIZE];
        int[][] masTwo = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                mas[i][j] = random.nextInt(255);
            }
        }
        printMatrix.printMatrix(mas);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите возможный поворот матрицы: '90','180','270'");
        String input = scanner.nextLine();
        switch (input) {
            case "90":
                    for (int i = 0; i < SIZE; i++) {           //поворот на 90 по часовой
                        for (int j = 0; j < SIZE; j++) {
                            masTwo[j][SIZE - i - 1] = mas[i][j];
                        }
                    }
                printMatrix.printMatrix(masTwo);
                break;
            case "180":
                for (int i = 0; i < SIZE; i++) {           //поворот на 180 по часовой
                    for (int j = 0; j < SIZE; j++) {
                        masTwo[i][j] = mas[SIZE - i - 1][SIZE - j - 1];
                    }
                }
               printMatrix.printMatrix(masTwo);
                break;
            case "270":
                for (int i = 0; i < SIZE; i++) {           //поворот на 270 по часовой
                    for (int j = 0; j < SIZE; j++) {
                        masTwo[i][j] = mas[j][SIZE - i - 1];
                    }
                }
                printMatrix.printMatrix(masTwo);
                break;
                default:
                    System.out.println("Вы выбрали некорректную команду!");
                    break;
        }
    }
}