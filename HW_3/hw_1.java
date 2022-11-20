//    Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
//    Фамилия Имя Отчество датарождения номертелефона пол
//    Форматы данных:
//    фамилия, имя, отчество - строки
//
//    дата_рождения - строка формата dd.mm.yyyy
//
//    номер_телефона - целое беззнаковое число без форматирования
//
//    пол - символ латиницей f или m.
//
//    Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код
//    ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//
//    Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных
//    не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои.
//    Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
//
//    Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку
//    должны записаться полученные данные, вида
//
//            <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
//
//(*) Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//
//    Не забудьте закрыть соединение с файлом.
//
//            (*) При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
import java.io.*;


public class hw_1 {
    private static String[] datephone = new String[4];
    public static void main(String[] args) throws IOException {
        //переменная описывает вызываемое действие
        String act;

        //загрузка БД
        loaddatephone();
        //вывод записей на екран
        Printbook();

        //вывод на екран описания возможных действий с указанием команд
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные," +
                            " (save)сохранить, (show)показать данные, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //добавление записи
            if(act.equals("add")){
                System.out.println("Введите фамилию, имя, отчество (фамилия, имя, отчество):");
                String name = bf.readLine();
                System.out.println("Введите дату рождения (dd.mm.yyyy):");
                String birthdate = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                System.out.println("Введите пол (м/ж):");
                String pol = bf.readLine();
                adddatephone(name, birthdate, phone, pol);
            }else{
                //удаление записи
                if(act.equals("del")){
                    for (int i = 0; i < datephone.length; i++) {
                        datephone[i]="";
                    }
                }else{
                    //поиск номеров по фамилии
                    if(act.equals("save")){
                        savedatephone();
                    }
                    else{
                        if(act.equals("show")){
                            Printbook();
                        }
                    }
                }
            }
        //запрос на следующее действие
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (save)сохранить, (show)показать данные, (exit)выход");
        act=bf.readLine();
        }
    }

    //loaddatephone - загружает БД из текстового файла phone.txt
    //производит проверку на наличие файла
    public static void loaddatephone() throws IOException {
        File file = new File("phone.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String dat = " ";
                datephone[0]=dat;
                datephone[1]=dat;
                datephone[2]=dat;
                datephone[3]=dat;
            }
            reader.close();
        }
    }
    
    //Print - выводит на екран все записи БД
    public static void Printbook(){
        System.out.println("Cправочник всех введённых данных: ");
        for (int i = 0; i < datephone.length; i++) {
           System.out.println(datephone[i]);;
        }
    }

    //adddatephone - добавляет запись по заданным номеру телефона и фамилии
    private static void adddatephone(String name, String birthdate, String phone, String pol) {
        datephone[0]=name;
        datephone[1]=birthdate;
        datephone[2]=phone;
        datephone[3]=pol;
    }


    //savedatephone - сохраняет БД в текстовом файле phone.txt
    private static void savedatephone() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(String value : datephone){
            writer.write(value);
        }
        writer.close();
    }
}