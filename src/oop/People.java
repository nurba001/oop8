package oop;

public class People extends Family{
   private String namePeople;
   private  String surnamePeople;
   private int agePeople;
   private String genderPeople;

   public People(){};

    public People(String namePeople, String surnamePeople, int agePeople, String genderPeople) {
        this.namePeople = namePeople;
        this.surnamePeople = surnamePeople;
        this.agePeople = agePeople;
        this.genderPeople = genderPeople;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public String getSurnamePeople() {
        return surnamePeople;
    }

    public void setSurnamePeople(String surnamePeople) {
        this.surnamePeople = surnamePeople;
    }

    public int getAgePeople() {
        return agePeople;
    }

    public void setAgePeople(int agePeople) {
        this.agePeople = agePeople;
    }

    public String getGenderPeople() {
        return genderPeople;
    }

    public void setGenderPeople(String genderPeople) {
        this.genderPeople = genderPeople;
    }

    @Override
    public String toString() {
        return
                "namePeople='" + namePeople + '\'' +
                ", surnamePeople='" + surnamePeople + '\'' +
                ", agePeople=" + agePeople +
                ", genderPeople='" + genderPeople + '\'' +
                "} " ;
    }
}
