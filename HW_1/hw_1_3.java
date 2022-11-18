// 3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
import java.util.Scanner;;
public class hw_1_3 {
    public static void main(String[] args) {
        massive_2();
    }

public static void massive_2(){
    Scanner input = new Scanner(System.in);
    System.out.println("Введите целочисленную числовую длинну 1-го массива: ");
    if (isNumeric(input.next()) == true){
        System.out.println("Введите числовую длинну 1-го массива (ПОВТОРНО): ");
    }
    else {
        System.err.println("Введенное значение неверно!");
    }
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
    

    
    System.out.println("\nВведите целочисленную числовую длинну 2-го массива: ");
    if (isNumeric(input.next()) == true){
        System.out.println("Введите числовую длинну 2-го массива (ПОВТОРНО): ");
    }
    else {
        System.err.println("Введенное значение неверно!");
    }
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
    if (array_1.length != array_2.length){
        System.err.println("\nВведённые массивы не совпадают по длинне.\nНе возможно выполнить операцию!");
    }
    else{
        System.out.println("\nСозданные вами массивы совпадают по длинне!");
        int array_3[] =  new int[size_1];
        for(int i = 0; i<array_3.length; i++) {
            array_3[i] = array_1[i] / array_2[i];
        }
        System.out.println("\nНовый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке");
        for (int i = 0; i < array_3.length; i++) {
            System.out.print (" " + array_3[i]);
        }
    }
}


// Проверка на integer
public static boolean isNumeric(String str) {
    try {  
      Double.parseDouble(str);  
      return true;
    } catch(NumberFormatException e){  
      return false;  
    }
  }
}
