package Model;

public class House extends Services  {
    private String Roomstandard;
    private String Comfortdescription;
    private int Numberoffloors;

    public House() {
    }

    public House(String roomstandard, String comfortdescription, int numberoffloors) {
        Roomstandard = roomstandard;
        Comfortdescription = comfortdescription;
        Numberoffloors = numberoffloors;
    }

    public House(String nameServices, float areaused, float rentalcosts, int amountofpeople, String typeofrent, String id, String roomstandard, String comfortdescription, int numberoffloors) {
        super(nameServices, areaused, rentalcosts, amountofpeople, typeofrent, id);
        Roomstandard = roomstandard;
        Comfortdescription = comfortdescription;
        Numberoffloors = numberoffloors;
    }

    public String getRoomstandard() {
        return Roomstandard;
    }

    public void setRoomstandard(String roomstandard) {
        Roomstandard = roomstandard;
    }

    public String getComfortdescription() {
        return Comfortdescription;
    }

    public void setComfortdescription(String comfortdescription) {
        Comfortdescription = comfortdescription;
    }

    public int getNumberoffloors() {
        return Numberoffloors;
    }

    public void setNumberoffloors(int numberoffloors) {
        Numberoffloors = numberoffloors;
    }

    @Override
    public String showInfor() {
        return "\nNameServices"+super.getNameServices()+
                "\nAreaused" +super.getAreaused()+
                "\nrentalcosts"+super.getRentalcosts()+
                "\namountofpeople"+super.getAmountofpeople()+
                "\ntypeofrent"+super.getTypeofrent()+
                "\nid"+super.getId()+
                "\nRoomstandard"+this.getRoomstandard()+
                "\nComfortdescription"+this.getComfortdescription()+
                "\nNumberoffloors"+this.getNumberoffloors();

    }
}
