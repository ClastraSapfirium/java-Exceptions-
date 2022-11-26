package HW_3;
import java.util.Scanner;
import java.io.*;

public class Get_Name {
    
    public static void main(String[] args) throws Exception{
        name(null);
    }


    public static void name (String[] args) throws Exception{
        Scanner name = new Scanner(System.in);
        
        System.out.println("Ввод Ф.И.О.");
        System.out.println("Введите фамилию: ");
        String firs_name = name.next();
        isNumeric(firs_name);
        while (isNumeric(firs_name) == true){
            System.out.println("Введено неверное значение фамилии, попробуйте ещё раз: ");
            firs_name = name.next();
            isNumeric(firs_name);
        }
        System.out.println("Введите имя: ");
        String sec_name = name.next();
        isNumeric(sec_name);
        while (isNumeric(sec_name) == true){
            System.out.println("Введено неверное значение имени, попробуйте ещё раз: ");
            sec_name = name.next();
            isNumeric(sec_name);
        }
        System.out.println("Введите отчество: ");
        String third_name = name.next();
        isNumeric(third_name);
        while (isNumeric(third_name) == true){
            System.out.println("Введено неверное значение отчества, попробуйте ещё раз: ");
            third_name = name.next();
            isNumeric(third_name);
        }
        System.out.println("\nВведенное вами имя: \n" + firs_name + "\nВведённая вами фамилия: \n" +
        sec_name + "\nВведённое вами отчество: \n" + third_name);
        try{
            FileWriter fw = new FileWriter( "hw_3Book.txt",true);
            fw.write("<"+firs_name+">"+"<"+sec_name+">"+"<"+third_name+">");
            fw.close();
        }catch (Exception e){
            System.out.println("Возникла проблема с записью в файл.");
        }
    }


    
    // Проверка на String
    public static boolean isNumeric(String str) {
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }
    }
}
