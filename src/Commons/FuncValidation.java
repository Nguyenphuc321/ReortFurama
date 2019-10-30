package Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = " ";
    private static Scanner sc;
    public static boolean checkNameServices(String str){
      regex = "/^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$/";
      return str.matches(regex);

    }
    public static float checkValiNumberFloat(String content,String errMes){
       while (true){
           try {
               sc = new Scanner(System.in);
               System.out.println(content);
               return sc.nextFloat();
           }catch (Exception ex){
               System.out.println(errMes);
           }
       }
    }
    public static Integer checkValiNumberInteger(String content,String errMes){
        while (true){
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            }catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }
    public static boolean checkNameCustomer(String str){
        regex ="/^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$/g";
        return str.matches(regex);
    }
    public static boolean checkEmailCustomer(String str){
        regex="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        return str.matches(regex);
    }
    public static boolean checkIdCard(String str){
        regex = "^[0-9]{9}$";
        return str.matches(regex);
    }
    public static Integer checkBirthday(String conext,String errMes ){
        while (true){
            try {
                sc = new Scanner(System.in);
                System.out.println(conext);
                return sc.nextInt();
            }catch (Exception ex){
                System.out.println(errMes);
            }
        }
    }
    public static boolean checkGender(String str){
        regex = "/^male$|^female$/g";
        return str.matches(regex);
    }
}
