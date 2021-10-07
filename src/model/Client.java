package model;

public class Client {
    private String nameHouse;
    private int apartmentNumber;
    private String id;

    public Client() {
    }

    public Client(String nameHouse, int apartmentNumber, String id) {
        this.nameHouse = nameHouse;
        this.apartmentNumber = apartmentNumber;
        this.id = id;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "nameHouse= " + nameHouse + '\'' +
                ", apartmentNumber= " + apartmentNumber +
                ", id= " + id + ", " ;
    }
}
