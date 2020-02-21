package Model;

public class Employees {
    private String NameEmployee;
    private int age;
    private String address;

    public Employees() {
    }

    public Employees(String nameEmployee, int age, String address) {
        NameEmployee = nameEmployee;
        this.age = age;
        this.address = address;
    }

    public String getNameEmployee() {
        return NameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        NameEmployee = nameEmployee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "NameEmployee='" + NameEmployee + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
