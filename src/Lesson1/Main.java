package Lesson1;

public class Main {

    public static void main(String[] args) {

        byte bt = 1;
        short sht = 2;
        int i = 3;
        long lng = 10000000L;
        float flt = 24.04f;
        double dbl = 22.12;
        char chr = 'П';
        boolean bln = true;

        System.out.println(calculate(2.5f, 2f , 2f ,2f));
        System.out.println(task10and20(5, 5));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-2));
        helloName("Тимофей");
    }

    public static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean task10and20(int a, int b){
        return a + b >=10 && a + b <= 20;
    }

    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрецательное");
        }
    }

    public static boolean isNegative(int number){
        if (number < 0){
            return true;
        }
        return false;
    }

    public static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }


}
