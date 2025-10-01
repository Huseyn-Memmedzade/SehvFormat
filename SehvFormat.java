package yenipabka;

public class SehvFormat {

    public static void main(String[] args) {

        try {


            String metn = "Java";

            Integer.parseInt("Java");

        } catch (NumberFormatException e) {
            System.out.println("Bu yazını rəqəmə çevirmək mümkün deyil.");
        }

    }


}
