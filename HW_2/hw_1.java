// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;;
public class hw_1 {
    public static void main(String[] args) {
        flote();
    }
    public static void flote(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String x = input.next();
        if (isNumeric(x) == true){
            System.out.println("Введенное вами число относится к типу данных float и имеет значение:");
            System.out.println(x);
        }
        else {
            while (isNumeric(x) == false){
                System.out.println("Введенное значение неверно! Введите дробное число: ");
                x = input.next();
            }
            System.out.println("Введенное вами число относится к типу данных float и имеет значение:");
            System.out.println(x);
        }
        input.close();
    }
    



    // Проверка на float
    public static boolean isNumeric(String x) {
        try {  
          Float.parseFloat(x);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }
    }
}