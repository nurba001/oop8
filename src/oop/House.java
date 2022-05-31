package oop;

public class House  {
    private String horse;
    private String addressHouse;
   private int agee;

    public House(String horse, int agee,String address) {
        this.horse = horse;
        this.agee = agee;
        this.addressHouse =address;
    }

    public House() {
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }

    public int getAgee() {
        return agee;
    }

    public void setAgee(int agee) {
        this.agee = agee;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }
}
