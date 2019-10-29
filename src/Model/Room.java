package Model;

public class Room extends Services{
    private String  Freeserviceincluded;

    public Room() {
    }

    public Room(String freeserviceincluded) {
        Freeserviceincluded = freeserviceincluded;
    }

    public Room(String nameServices, float areaused, float rentalcosts, int amountofpeople, String typeofrent, String id, String freeserviceincluded) {
        super(nameServices, areaused, rentalcosts, amountofpeople, typeofrent, id);
        Freeserviceincluded = freeserviceincluded;
    }

    public String getFreeserviceincluded() {
        return Freeserviceincluded;
    }

    public void setFreeserviceincluded(String freeserviceincluded) {
        Freeserviceincluded = freeserviceincluded;
    }

    @Override
    public String showInfor() {
        return  "\nNameServices"+super.getNameServices()+
                " \nAreaused" +super.getAreaused()+
                " \nrentalcosts"+super.getRentalcosts()+
                "\namountofpeople"+super.getAmountofpeople()+
                "\ntypeofrent"+super.getTypeofrent()+
                "\nid"+super.getId()+
                "\nFreeserviceincluded"+this.getFreeserviceincluded();
    }
}
