// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
// Вспоминаем SOLID
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class hw_4
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            System.out.println("Для продолжения работы программы пыстые строчки вводить нельзя: (-_-) ");
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> Case = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if(s.length() % 2 == 0)
            {
                Case.add(s + " " + s);
            }
            else Case.add(s + " " + s + " " + s);
        }

        for (int i = 0; i < Case.size(); i++)
        {
            System.out.println(Case.get(i));
        }
    }
}
