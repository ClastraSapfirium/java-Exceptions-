// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
import java.util.Scanner;;
public class hw_1_2 {
    public static void main(String[] args) {
        massive();
    }


    public static void massive(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числовую длинну 1-го массива: ");
        int size_1 = input.nextInt();
        int array_1[] = new int[size_1];
        System.out.println("Введите числовой элемент 1-го массива:");
        for (int i = 0; i < size_1; i++) {
        array_1[i] = input.nextInt();
        }
        System.out.print ("1-й введенный вами массив имеет вид:");
        for (int i = 0; i < size_1; i++) {
        System.out.print (" " + array_1[i]);
        }
        

        
        System.out.println("\nВведите числовую длинну 2-го массива: ");
        int size_2 = input.nextInt();
        int array_2[] = new int[size_2];
        System.out.println("Введите числовой элемент 2-го массива:");
        for (int i = 0; i < size_2; i++) {
        array_2[i] = input.nextInt();
        }
        System.out.print ("2-й введенный вами массив имеет вид:");
        for (int i = 0; i < size_2; i++) {
        System.out.print (" " + array_2[i]);
        }
        int array_3[] = new int[size_1];
        for(int i = 0; i<array_3.length; i++) {
            array_3[i] = array_1[i] - array_2[i];
        }
        System.out.println("\nНовый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке");
        for (int i = 0; i < array_3.length; i++) {
           System.out.print (" " + array_3[i]);
        }
        input.close();
    }
}
