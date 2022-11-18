// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class hw_1_1 {
    public static void main(String[] args) {
        get_mistake_1(null);
        get_mistake_2(null);
        get_mistake_3(null);
    }




    public static void get_mistake_1(String[] args){
        System.out.println(mistake(1,0));
    }
    public static int mistake(int a1, int a2){
        return a1/a2;
    }
 



    public static void get_mistake_2(String[] args){
        int[] mass = new int [100];
        System.out.println(mass[10000]);
    }




    public static void get_mistake_3(String[] args){
        System.out.println(mistake_3(1,2));
    }
    private static int mistake_3(int a1, int a2){
        int a3=0;
        return a1*a3;
    }
}