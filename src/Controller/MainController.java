package Controller;

import Commons.FuncValidation;
import Data.FuncWriteFileCSV;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        sc = new Scanner(System.in);
        System.out.println("\n1.Add NewServices" +
                "\n2. Show Services" +
                "\n3.Exit" +
                "\n Please select one function below: ");
        switch (sc.nextInt()){
            case 1:
                addNewServices();
            case 2:
                showServices();
            case 3:
                AddNewCustomer();
            case 4:
                ShowInformationCustomer();
            case 5:
               System.exit(0);
            default:
                System.out.println("Erro.back to menu");
                sc.nextLine();
                backMainMenu();
        }
    }
    private static void AddNewCustomer(){
        Services customer = new Customer();
        System.out.println("nhập vào id");
        customer.setId(UUID.randomUUID().toString().replace("--","---"));
        System.out.println("nhập vào tên");
        ((Customer)customer).setNameCustomer(sc.nextLine());
        System.out.println("nhập vào ngày sinh ");
        ((Customer)customer).setDateofbirth(sc.nextInt());
        System.out.println("nhập vào giới tính");
        ((Customer)customer).setGender(sc.nextLine());
        System.out.println("nhập vào số CMNN");
        ((Customer)customer).setCMND(sc.nextLine());
        System.out.println("nhập vào số điện thoại");
        ((Customer)customer).setTelephonenumber(sc.nextLine());
        System.out.println("nhập vào đia chỉ email");
        ((Customer)customer).setEmail(sc.nextLine());
        System.out.println("nhập vào loại khách");
        ((Customer)customer).setGuesttype(sc.nextLine());
        customer.showInfor();




    }
    private static void ShowInformationCustomer(){}
    private static void backMainMenu(){
        System.out.println("\n enter to continue");
        System.out.println("\n------------------");
        displayMainMenu();
    }
    private static void addNewServices(){
        System.out.println("\n1.Add NewVilla" +
                "\n2. Add new House" +
                "\n3.Add new Room" +
                "\n4:Back to menu" +
                "\n5:Exit" +
                "\n Please select one function below: ");

        switch (sc.nextInt()){
            case 1:
                addnewVilla();
                break;
            case 2:
                addnewHouse();
                break;
            case 3:
                addnewRoom();
                break;
            case 4:
                displayMainMenu();
                System.out.println("=================");
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Erro.back to menu");
                backMainMenu();

        }
    }
    private static void showServices(){
        System.out.println("-----------------"+
                "\n1 show All Villa." +
                "\n2 show All House." +
               "\n3 show All Room." +
                "\4 back to menu." +
                "\5 Exit." +
                "\n please select one function below:");
        switch (sc.nextInt()){
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\n Error. Back to menu");
                backMainMenu();
        }
    }
    private static void showAllVilla(){
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        for (Villa villa:listVilla){
            System.out.println("________________________");
            System.out.println(villa.showInfor());
            System.out.println("________________________");
        }
    }
    private static void showAllHouse(){
        ArrayList<House> listHouse = FuncWriteFileCSV.getHouseFromCSV();
        for (House house:listHouse){
            System.out.println("__________________________");
            System.out.println(house.showInfor());
            System.out.println("_____________________");
        }
    }
    private static void showAllRoom(){
        ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomFromCSV();
        for (Room room:listRoom){
            System.out.println("_______________");
            System.out.println(room.showInfor());
            System.out.println("_________________");
        }
    }
    private static Services addnewServices(Services service){
        String content = "";
        String errMes = "";
        System.out.println("nhập vào id");service.setId(UUID.randomUUID().toString().replace("--","---"));
        sc.nextLine();
        System.out.println("nhập tên dich vụ");
        service.setNameServices(sc.nextLine());
        while (FuncValidation.checkNameServices(service.getNameServices()));
        System.out.println("Name Servies is invalidate.please try again!!! ");
        System.out.println("Enter Name Services:");
        service.setNameServices(sc.nextLine());

        content = " Enter Area Used";
        errMes = "Area Used is Invali(Area >30,Area must be a float),please try again";
        service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        while (service.getAreaused()<=30){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        }
        System.out.println("diện tích sử dụng");
        service.setAreaused(sc.nextFloat());
        sc.nextLine();
        content = " Enter Area Used";
        errMes = "Area Used is Invali(Area >30,Area must be a float),please try again";
        service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        while (service.getAreaused()>=0){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        }
        System.out.println("nhập chi phí thuê");
        service.setRentalcosts(sc.nextFloat());
        sc.nextLine();
        content = " Enter Area Used";
        errMes = "Area Used is Invali(Area >30,Area must be a float),please try again";
        service.setAreaused(FuncValidation.checkValiNumberInteger(content,errMes));
        while (service.getAreaused()>0||service.getAreaused()<20){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));

        System.out.println("nhập tên dich vụ");
        service.setNameServices(sc.nextLine());
        while (FuncValidation.checkNameServices(service.getNameServices()));
        System.out.println("Name Servies is invalidate.please try again!!! ");
        System.out.println("Enter Name Services:");
        service.setNameServices(sc.nextLine());


        }
//        System.out.println("nhập số người thuê");
//        service.setAmountofpeople(sc.nextInt());

        System.out.println("nhập vào kiểu thuê");
        service.setTypeofrent(sc.nextLine());
        while (FuncValidation.checkNameServices(service.getNameServices()));
        System.out.println("Name Servies is invalidate.please try again!!! ");
        System.out.println("Enter Name Services:");
        service.setNameServices(sc.nextLine());
        sc.nextLine();
        return service;
    }
    private static void addnewVilla(){
        String content = "";
        String errMes = "";
       Services villa = new Villa();
        sc.nextLine();
        addnewServices(villa);
        System.out.println("nhập vào tiêu chuẩn phòng");
        ((Villa)villa).setRoomstandard(sc.nextLine());

        System.out.println("nhập mô tả tiện nghi");
        ((Villa)villa).setComfortdescription(sc.nextLine());
        System.out.println("nhập sô tầng");
        ((Villa)villa).setNumberoffloors(sc.nextInt());
        System.out.println("nhập diện tích hồ bơi");
        ((Villa)villa).setPoolarea(sc.nextFloat());
        System.out.println(villa.showInfor());
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa)villa);
        FuncWriteFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\n Add villa: "+villa.getNameServices()+"Successfully!!!");
        sc.nextLine();
        backMainMenu();



    }
    private static void addnewHouse(){
        Services house = new House();
        sc.nextLine();
        addnewServices(house);
        System.out.println("nhập vào tiêu chuẩn phòng");
        ((House)house).setRoomstandard(sc.nextLine());
        System.out.println("nhập mô tả tiện nghi");
        ((House)house).setComfortdescription(sc.nextLine());
        System.out.println("nhập sô tầng");
        ((House)house).setNumberoffloors(sc.nextInt());
        System.out.println(house.showInfor());
        ArrayList<House> listHouse = new ArrayList<House>();
        listHouse.add((House)house);
        FuncWriteFileCSV.writeHoseToFileCSV(listHouse);
        System.out.println("\n Add House: "+house.getNameServices()+"Successfully!!!");
        sc.nextLine();
        backMainMenu();
    }
    private static void addnewRoom(){
       Services room = new Room();
        sc.nextLine();
        addnewServices(room);
        System.out.println("nhập dich vụ miễn phí đi kèm");
        ((Room)room).setFreeserviceincluded(sc.nextLine());
        System.out.println(room.showInfor());
        ArrayList<Room> listRoom = new ArrayList<Room>();
        listRoom.add((Room)room);
        FuncWriteFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\n Add villa: "+room.getNameServices()+"Successfully!!!");
        sc.nextLine();
        backMainMenu();
    }
}
