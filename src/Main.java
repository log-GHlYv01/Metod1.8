import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // 1 Задание.
        int year = 2022;
        printLeapYear(year);

        // 2 задание.
        int clientOs = 1;
        int clientDeviceYear = 2010;
        suggestVersion(clientOs, clientDeviceYear);

        // 3 задание.
        int deliDist = 95;
        int countDelivDis = countDelivDey(deliDist);

        System.out.print("  На доставку требуется дней " + countDelivDis );
    }
    private static int countDelivDey(int deliDist){
        int delivDey = 4;
        if (deliDist<=20){
            deliDist = 1;
        }
        if (deliDist>20 && deliDist<=60) {
            delivDey = 2;
        }
        if (deliDist>60 && deliDist<=100) {
            delivDey = 3;
        }
        return deliDist ;
    }

    private static void suggestVersion(int clientOS, int clientDeviceYear){
        int currentYrar = LocalDate.now().getYear();
        int clientOs = 1;
        if (clientDeviceYear < currentYrar ) {
            System.out.print("Установите lait.demo версию ");
        } else {
            System.out.print("установите обычную версию ");
        }
        if (clientOs == 1) {
            System.out.print("Android");
        } else {
            System.out.print("IOS");
        }
    }
    private static void printLeapYear(int year){
        Boolean isLeapYear = isLeapYear (year);
        if(isLeapYear) {
            System.out.println("Этот год  " + year + " является високосным");
        } else {
            System.out.println("Этот год  " + year + " НЕ является високосным");
        }
    }
    private static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
