package Model;

public class Filingcabinets {
    private String NameEmployees;
    private int ageEmployees;
    private String addressEmployees;

    public Filingcabinets() {
    }

    public Filingcabinets(String nameEmployees, int ageEmployees, String addressEmployees) {
        NameEmployees = nameEmployees;
        this.ageEmployees = ageEmployees;
        this.addressEmployees = addressEmployees;
    }

    public String getNameEmployees() {
        return NameEmployees;
    }

    public void setNameEmployees(String nameEmployees) {
        NameEmployees = nameEmployees;
    }

    public int getAgeEmployees() {
        return ageEmployees;
    }

    public void setAgeEmployees(int ageEmployees) {
        this.ageEmployees = ageEmployees;
    }

    public String getAddressEmployees() {
        return addressEmployees;
    }

    public void setAddressEmployees(String addressEmployees) {
        this.addressEmployees = addressEmployees;
    }

    @Override
    public String toString() {
        return NameEmployees;
    }
}
