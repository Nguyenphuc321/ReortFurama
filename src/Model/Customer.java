package Model;


public class Customer extends Services{
    private String NameCustomer;
    private String Dateofbirth;
    private String gender;
    private String CMND;
    private String telephonenumber;
    private String address;
    private String Email;
    private String guesttype;
    private Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String dateofbirth, String gender, String CMND, String telephonenumber, String address, String email, String guesttype, Services services) {
        NameCustomer = nameCustomer;
        Dateofbirth = dateofbirth;
        this.gender = gender;
        this.CMND = CMND;
        this.telephonenumber = telephonenumber;
        this.address = address;
        Email = email;
        this.guesttype = guesttype;
        this.services = services;
    }

    public Customer(String nameServices, float areaused, float rentalcosts, int amountofpeople, String typeofrent, String id, String nameCustomer, String dateofbirth, String gender, String CMND, String telephonenumber, String address, String email, String guesttype, Services services) {
        super(nameServices, areaused, rentalcosts, amountofpeople, typeofrent, id);
        NameCustomer = nameCustomer;
        Dateofbirth = dateofbirth;
        this.gender = gender;
        this.CMND = CMND;
        this.telephonenumber = telephonenumber;
        this.address = address;
        Email = email;
        this.guesttype = guesttype;
        this.services = services;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        NameCustomer = nameCustomer;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        Dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGuesttype() {
        return guesttype;
    }

    public void setGuesttype(String guesttype) {
        this.guesttype = guesttype;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String showInfor() {
        return "\nNameServices: "+super.getNameServices()+
                " \n Areaused: " +super.getAreaused()+
                " \n rentalcosts: "+super.getRentalcosts()+
                " \namountofpeople: "+super.getAmountofpeople()+
                " \ntypeofrent: "+super.getTypeofrent()+
                " \nid: "+super.getId()+
                "\n NameCustomer"+this.getNameCustomer()+
                "\n Dateofbirth"+this.getDateofbirth()+
                "\n gender"+this.getGender()+
                "\n CMND" +this.getCMND()+
                "\n telephonenumber"+this.getTelephonenumber()+
                "\n addreess"+this.getAddress()+
                "\n Email"+this.getEmail()+
                "\n guesttype "+this.getGuesttype();
    }
}
