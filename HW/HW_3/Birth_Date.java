package HW_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Birth_Date {
    public static void main(String[] args) throws Exception{
        String act = "";
        String filePath = "/Users/Admin/Desktop/Исключения в программировании и их обработка/HW/hw_3Book.txt";
        Date date;

        
        while (!act.equals("exit")){
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите дату рождения (dd.mm.yyyy например 01.01.1980): ");
            try{
                date = sdf.parse(br.readLine());
                String output = sdf.format(date);
                FileWriter fw = new FileWriter( "hw_3Book.txt",true);
                appendUsingFileWriter(filePath, output);
                fw.close();
                System.out.println("\nВведённая вами дата рождения:\n" + date);
                act = "exit";
            }
            catch (Exception e){
                System.out.println("Введено неверное значение даты!!! или Возникла проблема с записью в файл. Попробуйте ещё раз.");
            }
        }
        
    }

    
    private static void appendUsingFileWriter(String filePath, String text) throws Exception {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write("<"+text+">");
           
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
