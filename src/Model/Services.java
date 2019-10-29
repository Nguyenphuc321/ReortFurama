package Model;

public abstract class Services {
    private String NameServices;
    private float Areaused;
    private float  rentalcosts;
    private int amountofpeople;
    private String typeofrent;
    private String id;

    public Services() {
    }

    public Services(String nameServices, float areaused, float rentalcosts, int amountofpeople, String typeofrent, String id) {
        NameServices = nameServices;
        Areaused = areaused;
        this.rentalcosts = rentalcosts;
        this.amountofpeople = amountofpeople;
        this.typeofrent = typeofrent;
        this.id = id;
    }

    public String getNameServices() {
        return NameServices;
    }

    public void setNameServices(String nameServices) {
        NameServices = nameServices;
    }

    public float getAreaused() {
        return Areaused;
    }

    public void setAreaused(float areaused) {
        Areaused = areaused;
    }

    public float getRentalcosts() {
        return rentalcosts;
    }

    public void setRentalcosts(float rentalcosts) {
        this.rentalcosts = rentalcosts;
    }

    public int getAmountofpeople() {
        return amountofpeople;
    }

    public void setAmountofpeople(int amountofpeople) {
        this.amountofpeople = amountofpeople;
    }

    public String getTypeofrent() {
        return typeofrent;
    }

    public void setTypeofrent(String typeofrent) {
        this.typeofrent = typeofrent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public abstract String showInfor();
}
