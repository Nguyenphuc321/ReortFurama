package Controller;

import Commons.FuncValidation;
import Data.FuncWriteFileCSV;
import Model.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu(){
        sc = new Scanner(System.in);
        System.out.println("\n1.Add NewServices" +
                "\n2. Show Services" +
                "\n3  AddNewCustomer" +
                "\n4  ShowInformationCustomer"+
                "\n5  AddNewBookingResort" +
                "\n6  Show Information Employee"+
                "\n7.Exit" +
                "\n Please select one function below: ");
        switch (sc.nextInt()){
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                AddNewCustomer();
                break;
            case 4:
                ShowInformationCustomer();
                backMainMenu();
                break;
            case 5:
                AddNewBookingResort();
               break;
            case 6:
                ShowInformationEmployee();
                break;
            case 7:
               System.exit(0);
            default:
                System.out.println("Erro.back to menu");
                sc.nextLine();
                backMainMenu();
        }
    }

    private static void ShowInformationEmployee(){
         HashMap<Integer,Employees>employeesMap = new HashMap<>();
         employeesMap.put(1,new Employees("nguyễn văn A",22,"hà nội"));
         employeesMap.put(2,new Employees("nguyễn văn B",23,"thanh hóa"));
         employeesMap.put(3,new Employees("nguyễn văn C",24,"hải phòng"));
         employeesMap.put(4,new Employees("nguyễn văn D",26,"hải dương"));
         employeesMap.put(5,new Employees("nguyễn văn K",28,"thăng long"));
         employeesMap.put(6,new Employees("nguyễn văn S",24,"an giang"));
         employeesMap.put(7,new Employees("nguyễn văn G",20,"lộc xuân"));
         employeesMap.put(8,new Employees("nguyễn văn K",33,"thăng long"));
         employeesMap.put(9,new Employees("nguyễn văn H",55,"xuân lộc"));
         employeesMap.put(10,new Employees("nguyễn văn J",34,"tuần châu"));
       System.out.println("những nhân viên có trong Furama là:");
       for (Integer id:employeesMap.keySet()){
           Employees employees = employeesMap.get(id);
           System.out.println(employees);
       }
    }
    private static void AddNewBookingResort(){
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        listCustomer.sort(new SortName());
        int i = 1;
        for (Customer customer:listCustomer){
            System.out.println("\n_________");
            System.out.println("No"+i);
            System.out.println(customer.showInfor());
            System.out.println("\n____________");
        }
        System.out.println("choose customer Booking");
        Customer customer = listCustomer.get(sc.nextInt()-1);
        System.out.println("Choose Servicces Booking");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                i = 1;
                ArrayList<Villa> lisVilla = FuncWriteFileCSV.getVillaFromCSV();
                for (Villa villa:lisVilla){
                    System.out.println("\n_________________");
                    System.out.println("No:"+i);
                    System.out.println(villa.showInfor());
                    System.out.println("\n_______________");
                    i++;
                }
                System.out.println("Choose villa Booking");
                Villa villa = lisVilla.get(sc.nextInt()-1);
                customer.setServices(villa);
                break;
            default:
                backMainMenu();
                break;
        }
        ArrayList<Customer> listBooking = FuncWriteFileCSV.getBookingFromCSV();
        listBooking.add(customer);
        FuncWriteFileCSV.writeBookingToFileCSV(listBooking);
        System.out.println("\n Add Booking for:"+customer.getNameCustomer()+"Successfuly!!!");
        sc.nextLine();
        backMainMenu();
    }
    private static void AddNewCustomer(){
        String context = " ";
        String errMes = " ";
        Services customer = new Customer();
        sc.nextLine();
        customer.setId(UUID.randomUUID().toString().replace("--","---"));
        System.out.println("nhập vào tên khách hàng");
        ((Customer)customer).setNameCustomer(sc.nextLine());
        while (!FuncValidation.checkNameCustomer(((Customer) customer).getNameCustomer())){
           System.out.println("bạn nhập sai vui lòng nhập lại đúng yêu cầu!");
            System.out.println("nhập tên khách hàng");
            ((Customer) customer).setNameCustomer(sc.nextLine());
        }
        System.out.println("nhập vào ngày sinh của bạn");
        ((Customer)customer).setDateofbirth(sc.nextLine());
        while (!FuncValidation.checkbirthday(((Customer) customer).getDateofbirth())){
            System.out.println(" bạn đã nhập sai vui lòng nhập lại cho đúng !");
            System.out.println("nhập vào ngày sinh của bạn");
            ((Customer) customer).setDateofbirth(sc.nextLine());
        }

        System.out.println("nhập vào giới tính");
        ((Customer)customer).setGender(sc.nextLine());
        while (!FuncValidation.checkGender(((Customer) customer).getGender())){
            System.out.println("bạn đã nhập sai vui lòng nhập lại theo đúng yêu cầu");
            System.out.println("nhập vào giới tính");
            ((Customer) customer).setGender(sc.nextLine());
        }
        System.out.println("nhập vào số CMNN");
        ((Customer)customer).setCMND(sc.nextLine());
        while (!FuncValidation.checkIdCard(((Customer) customer).getId())){
            System.out.println("bạn đã nhập sai vui lòng nhập lại đúng yêu cầu!");
            System.out.println("nhập vào số CMNN ");
            ((Customer) customer).setId(sc.nextLine());
        }
        System.out.println("nhập vào đia chỉ email");
        ((Customer)customer).setEmail(sc.nextLine());
        while (!FuncValidation.checkEmailCustomer(((Customer) customer).getEmail())){
            System.out.println(" Email đã nhập sai vui lòng nhập lại!");
            System.out.println("nhập vào định dạng email của người dùng");
            ((Customer) customer).setEmail(sc.nextLine());
        }
        System.out.println(customer.showInfor());
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        listCustomer.add((Customer)customer);
        FuncWriteFileCSV.writeCustomerToFileCSV(listCustomer);
        System.out.println("\n Add Customer: "+((Customer) customer).getNameCustomer()+"Successfully!!!");
        sc.nextLine();
        backMainMenu();
    }
    private static void ShowInformationCustomer(){
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        for (Customer customer:listCustomer){
            System.out.println("________________________");
            System.out.println(customer.showInfor());
            System.out.println("________________________");
        }
    }
    private static void backMainMenu(){
        System.out.println("\n enter to continue");
        System.out.println("\n------------------");
        displayMainMenu();
    }
    private static void addNewServices(){
        System.out.println("\n1.Add NewVilla" +
                "\n2. Add new House" +
                "\n3. Add new Room" +
                "\n4: Back to menu" +
                "\n5: Exit" +
                "\n  Please select one function below: ");

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
                "\n4 show All Name Villa Not Duplicate" +
                "\n5 show All Name House Not Duplicate " +
                "\n6 show All Name Room Not Duplicate" +
                "\n7 back to menu." +
                "\n8 Exit." +
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
                 ShowAllNameVillaNotDuplicate();
                break;
            case 5:
                 ShowAllNameHouseNotDuplicate();
                break;
            case 6:
                ShowAllNameRoomNotDuplicate();

            case 8:
                displayMainMenu();
                break;
            case 9:
                System.exit(0);
            default:
                System.out.println("\n Error. Back to menu");
                backMainMenu();
        }
    }
    private static void ShowAllNameRoomNotDuplicate(){
        String pathRoom = "src/Room/Villa.csv";
        Path path = Paths.get(pathRoom);
        if (!Files.exists( path)){
            System.out.println("File Room does not exits");
        }else{
            TreeSet<String> listRoomTreeSet = FuncWriteFileCSV.getAllNameServiceFromCSV(pathRoom);
            System.out.println("\n List Name Services Villa not Duplicate");
            for (String str:listRoomTreeSet){
                System.out.println("\n______________________");
                System.out.println(str);
                System.out.println("\n______________________");
            }
            sc.nextLine();
            backMainMenu();
        }
    }

    private static void ShowAllNameVillaNotDuplicate(){
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if (!Files.exists( path)){
            System.out.println("File Villa does not exits");
        }else{
            TreeSet<String> listHouseTreeSet = FuncWriteFileCSV.getAllNameServiceFromCSV(pathVilla);
            System.out.println("\n List Name Services Villa not Duplicate");
            for (String str:listHouseTreeSet){
                System.out.println("\n______________________");
                System.out.println(str);
                System.out.println("\n______________________");
            }
            sc.nextLine();
            backMainMenu();
        }
    }
    private static void  ShowAllNameHouseNotDuplicate(){
        String pathHouse = "src/Data/House.csv";
        Path path = Paths.get(pathHouse);
        if (!Files.exists( path)){
            System.out.println("File House does not exits");
        }else{
            TreeSet<String> listHouseTreeSet = FuncWriteFileCSV.getAllNameServiceFromCSV(pathHouse);
            System.out.println("\n List Name Services Villa not Duplicate");
            for (String str:listHouseTreeSet){
                System.out.println("\n______________________");
                System.out.println(str);
                System.out.println("\n______________________");
            }
            sc.nextLine();
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
            System.out.println("___________________");
            System.out.println(room.showInfor());
            System.out.println("_________________");
        }
    }
    private static Services addnewServices(Services service){
        String content = "";
        String errMes = "";
        service.setId(UUID.randomUUID().toString().replace("-","-"));
        System.out.println("nhập vào tên dịch vụ");
        service.setNameServices(sc.nextLine());
        while (!FuncValidation.checkNameServices(service.getNameServices())){
            System.out.println("bạn đã nhập sai vui lòng nhập lại!");
            System.out.println("nhập tên dich vụ");
            service.setNameServices(sc.nextLine());
        }
        content="nhập vào diện tích sử dụng";
        errMes="diện tích bạn cần nhập phải > 30,bạn cần nhập đúng diện tích";
        service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        while (service.getAreaused()<=30){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        }
        content="nhập vào chi phí thuê";
        errMes="chi phí thuê của bạn phải >0,bạn cần nhập đúng ";
        service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        while (service.getAreaused()<=0){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberFloat(content,errMes));
        }
        content="nhập vào số người thuê tối đa";
        errMes="chi phí thuê của bạn phải >0||<20,chi phí thuê là kiểu integer";
        service.setRentalcosts(FuncValidation.checkValiNumberInteger(content,errMes));
        while (service.getRentalcosts()<=0 && service.getRentalcosts()>20){
            System.out.println(errMes);
            service.setAreaused(FuncValidation.checkValiNumberInteger(content,errMes));
        }

        System.out.println("nhập vào kiểu thuê");
        service.setNameServices(sc.nextLine());
        while (!FuncValidation.checkNameServices(service.getNameServices())){
            System.out.println("bạn đã nhập sai! vui lòng nhập lại");
            System.out.println("nhập vào kiểu thuê của bạn");
            service.setNameServices(sc.nextLine());
        }
        return service;
    }
    private static void addnewVilla(){
        String content = "";
        String errMes = "";
       Services villa = new Villa();
        sc.nextLine();
        addnewServices(villa);
        System.out.println("nhập tiêu chuẩn phòng");
        villa.setNameServices(sc.nextLine());
        while (!FuncValidation.checkNameServices(villa.getNameServices())){
            System.out.println("bạn đã nhập sai! vui lòng nhập lại");
            System.out.println("nhập vào tiêu chuẩn phòng");
            villa.setNameServices(sc.nextLine());
        }
        backMainMenu();
    }
    private static void addnewHouse(){
        Services house = new House();
        sc.nextLine();
        addnewServices(house);
        sc.nextLine();
        System.out.println("nhập tiêu chuẩn phòng");
        house.setNameServices(sc.nextLine());
        while (!FuncValidation.checkNameServices(house.getNameServices())){
            System.out.println("bạn đã nhập sai! vui lòng nhập lại");
            System.out.println("nhập vào tiêu chuẩn phòng");
            house.setNameServices(sc.nextLine());
        }
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
        System.out.println("\n Add room: "+room.getNameServices()+"Successfully!!!");
        sc.nextLine();
        backMainMenu();
    }
}
