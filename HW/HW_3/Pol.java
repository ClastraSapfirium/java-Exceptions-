package HW_3;
import java.util.Scanner;
import java.io.*;
public class Pol {
    public static void main(String[] args) {
        String act = "";
        Scanner scanPol = new Scanner(System.in);
        System.out.println("Введите свой пол (m/f): ");
        String Check_Pol = scanPol.next();
        while (!act.equals("exit")){
            if (Check_Pol.matches("m")){
                System.out.println("Выбран мужской пол.");
                act = "exit";
            }
            else{
                if(Check_Pol.matches("f")){
                    System.out.println("Выбран женский пол.");
                    act = "exit";
                }
                else{
                    System.out.println("Введено неверное значение пола!\n" + "Введите пол (m/f):");
                    Check_Pol = scanPol.next();
                }
            }
        }
        try{
            FileWriter fw = new FileWriter( "hw_3Book.txt",true);
            fw.write("<"+Check_Pol+">\n");
            fw.close();
        }catch (Exception e){
            System.out.println("Возникла проблема с записью в файл.");
        }
    }
}
