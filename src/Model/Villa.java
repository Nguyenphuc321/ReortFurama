package Model;

public class Villa extends House {
    private float Poolarea;
    public Villa() {
    }

    public Villa(float poolarea) {
        Poolarea = poolarea;
    }

    public Villa(String nameServices, float areaused, float rentalcosts, int amountofpeople, String typeofrent, String id, String roomstandard, String comfortdescription, int numberoffloors, float poolarea) {
        super(nameServices, areaused, rentalcosts, amountofpeople, typeofrent, id, roomstandard, comfortdescription, numberoffloors);
        Poolarea = poolarea;
    }

    public float getPoolarea() {
        return Poolarea;
    }

    public void setPoolarea(float poolarea) {
        Poolarea = poolarea;
    }

    @Override
    public String showInfor() {
        return "\nNameServices: "+super.getNameServices()+
                " \n Areaused: " +super.getAreaused()+
                " \n rentalcosts: "+super.getRentalcosts()+
                " \namountofpeople: "+super.getAmountofpeople()+
                " \ntypeofrent: "+super.getTypeofrent()+
                " \nid: "+super.getId()+
                " \nRoomstandard: "+this.getRoomstandard()+
                " \nComfortdescription: "+this.getComfortdescription()+
                " \n Numberoffloors: "+this.getNumberoffloors()+
                " \nPoolarea: "+this.getPoolarea();
    }
}
