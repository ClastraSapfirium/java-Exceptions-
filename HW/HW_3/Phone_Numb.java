package HW_3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.*;
public class Phone_Numb {
    public static void main(String[] args) throws Exception {
        String act = "";
        Scanner phone = new Scanner(System.in);
        System.out.println("Введите номер мобильного телефона (+xxxxxxxxxxx): ");
        String PhoneNumber = phone.next();
        while (!act.equals("exit")){
            Pattern pattern = Pattern.compile("(\\+*)\\d{12}");
            Matcher matcher = pattern.matcher(PhoneNumber);

            if (matcher.matches()) {
                System.out.println("Мобильный номер принят!");
                act = "exit";
            }
            else{
                System.out.println("\nНомер мобильного телефона введён неверно!\n" +
                "Формат телефона (+xxxxxxxxxxx)");
                PhoneNumber = phone.next();
            }
        }
        try{
            FileWriter fw = new FileWriter( "hw_3Book.txt",true);
            fw.write("<"+PhoneNumber+">");
            fw.close();
        }catch (Exception e){
            System.out.println("Возникла проблема с записью в файл.");
        }
    }
}