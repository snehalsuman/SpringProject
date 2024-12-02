package car.example.bean;

public class Snehal {
    private String name;


    public void setName(String name) {
        this.name = name;
    }



    public void showName() {
        System.out.printf(name);
    }
    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
