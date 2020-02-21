package Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex = " ";
    private static Scanner sc;
    public static boolean checkNameServices(String str){
      regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$";
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
         regex ="^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$";
        return str.matches(regex);
    }
    public static boolean checkEmailCustomer(String str){
        regex="^(.+)@(.+)$";
        return str.matches(regex);
    }
    public static boolean checkIdCard(String str){
        regex = "^[0-9]{9}$";
        return str.matches(regex);
    }
    public static boolean checkbirthday(String str){
        regex = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b";
        return str.matches(regex);
    }

    public static boolean checkGender(String str){
        regex = "^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})((\\s)([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})){0,3}$";
        return str.matches(regex);
    }
}
