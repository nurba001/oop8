package oop;

public abstract class  Family extends House implements Payadle {

    private  int amount;
    private  String name;
    public Family() {
        this.amount = amount;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int pay() {

        return getAgee();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int age1) {
        this.amount = age1;
    }


}
