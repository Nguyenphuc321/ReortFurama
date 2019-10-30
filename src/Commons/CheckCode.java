package Commons;

import Data.FuncWriteFileCSV;
import Model.*;

import java.util.ArrayList;
import java.util.UUID;

public class CheckCode {
//    private static Services addnewServices(Services service){
//        service.setId(UUID.randomUUID().toString().replace("-","-"));
//        System.out.println("nhập vào tên dịch vụ");
//        service.setNameServices(sc.nextLine());
//        System.out.println("nhập vào diện tích sử dụng");
//        service.setAreaused(sc.nextFloat());
//        System.out.println("nhập vào chi phí thuê");
//        service.setRentalcosts(sc.nextFloat());
//        System.out.println("nhập vào số người thuê");
//        service.setAmountofpeople(sc.nextInt());
//        System.out.println("nhập vào kiểu thuê");
//        service.setTypeofrent(sc.nextLine());
//        return service;
//    }
//    private static void addnewVilla(){
//        String content = "";
//        String errMes = "";
//        Services villa = new Villa();
//        sc.nextLine();
//        addnewServices(villa);
//        System.out.println("nhập vào tiêu chuẩn phòng");
//        ((Villa)villa).setRoomstandard(sc.nextLine());
//
//        System.out.println("nhập mô tả tiện nghi");
//        ((Villa)villa).setComfortdescription(sc.nextLine());
//        System.out.println("nhập sô tầng");
//        ((Villa)villa).setNumberoffloors(sc.nextInt());
//        System.out.println("nhập diện tích hồ bơi");
//        ((Villa)villa).setPoolarea(sc.nextFloat());
//        System.out.println(villa.showInfor());
//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
//        listVilla.add((Villa)villa);
//        FuncWriteFileCSV.writeVillaToFileCSV(listVilla);
//        System.out.println("\n Add villa: "+villa.getNameServices()+"Successfully!!!");
//        sc.nextLine();
//        backMainMenu();
//    }
//    private static void addnewHouse(){
//        Services house = new House();
//        sc.nextLine();
//        addnewServices(house);
//        System.out.println("nhập vào tiêu chuẩn phòng");
//        ((House)house).setRoomstandard(sc.nextLine());
//        System.out.println("nhập mô tả tiện nghi");
//        ((House)house).setComfortdescription(sc.nextLine());
//        System.out.println("nhập sô tầng");
//        ((House)house).setNumberoffloors(sc.nextInt());
//        System.out.println(house.showInfor());
//        ArrayList<House> listHouse = new ArrayList<House>();
//        listHouse.add((House)house);
//        FuncWriteFileCSV.writeHoseToFileCSV(listHouse);
//        System.out.println("\n Add House: "+house.getNameServices()+"Successfully!!!");
//        sc.nextLine();
//        backMainMenu();
//    }
//    private static void addnewRoom(){
//        Services room = new Room();
//        sc.nextLine();
//        addnewServices(room);
//        System.out.println("nhập dich vụ miễn phí đi kèm");
//        ((Room)room).setFreeserviceincluded(sc.nextLine());
//        System.out.println(room.showInfor());
//        ArrayList<Room> listRoom = new ArrayList<Room>();
//        listRoom.add((Room)room);
//        FuncWriteFileCSV.writeRoomToFileCSV(listRoom);
//        System.out.println("\n Add villa: "+room.getNameServices()+"Successfully!!!");
//        sc.nextLine();
//        backMainMenu();
//    }
//Services customer = new Customer();
////        System.out.println("nhập vào id");
//        customer.setId(UUID.randomUUID().toString().replace("--","---"));
////        sc.nextLine();
//        System.out.println("nhập vào tên");
//        ((Customer)customer).setNameCustomer(sc.nextLine());
//        sc.nextLine();
//        System.out.println("nhập vào ngày sinh ");
//        ((Customer)customer).setDateofbirth(sc.nextInt());
//        sc.nextLine();
//        System.out.println("nhập vào giới tính");
//        ((Customer)customer).setGender(sc.nextLine());
//        System.out.println("nhập vào số CMNN");
//        ((Customer)customer).setCMND(sc.nextLine());
//        System.out.println("nhập vào số điện thoại");
//        ((Customer)customer).setTelephonenumber(sc.nextLine());
//        System.out.println("nhập vào đia chỉ email");
//        ((Customer)customer).setEmail(sc.nextLine());
//        System.out.println("nhập vào loại khách");
//        ((Customer)customer).setGuesttype(sc.nextLine());
//        System.out.println(customer.showInfor());
//    ArrayList<Customer> listCustomer = new ArrayList<Customer>();
//        listCustomer.add((Customer)customer);
//        FuncWriteFileCSV.writeCustomerToFileCSV(listCustomer);
//        System.out.println("\n Add Customer: "+((Customer) customer).getNameCustomer()+"Successfully!!!");
//        sc.nextLine();
//    backMainMenu();
}
