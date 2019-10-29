package Views;

import Controller.MainController;
import Model.Services;
import Model.Villa;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Services villa = new Villa();
//        System.out.println("nhập vào id");
//        villa.setId(UUID.randomUUID().toString().replace("--","---"));
//        scanner.nextLine();
//        System.out.println("nhập tên dich vụ");
//        villa.setNameServices(scanner.nextLine());
//        System.out.println("diện tích sử dụng");
//        villa.setAreaused(scanner.nextDouble());
//        System.out.println("nhập chi phí thuê");
//        villa.setRentalcosts(scanner.nextDouble());
//        System.out.println("nhập số người thuê");
//        villa.setAmountofpeople(scanner.nextInt());
//        villa.setId(scanner.nextLine());
//        System.out.println("nhập vào tiêu chuẩn phòng");
//        ((Villa)villa).setRoomstandard(scanner.nextLine());
//        System.out.println("nhập mô tả tiện nghi");
//        ((Villa)villa).setComfortdescription(scanner.nextLine());
//        System.out.println("nhập sô tầng");
//        ((Villa)villa).setNumberoffloors(scanner.nextInt());
//        System.out.println("nhập diện tích hồ bơi");
//        ((Villa)villa).setPoolarea(scanner.nextFloat());
//        System.out.println(villa.showInfor());
        MainController.displayMainMenu();
    }
}
