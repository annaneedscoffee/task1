package adress;

public class Adress {

    private String street;
    private int housenum;

    public Adress(String street, int housenum){
        this.street = street;
        this.housenum = housenum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public int getHousenum() {
        return housenum;
    }

    public void setHousenum(int housenum)
    {
        this.housenum = housenum;
    }

    @Override
    public String toString(){
        return this.street+", "+this.housenum;
    }

}
