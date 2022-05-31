package oop;

public class Main {

    public static void main(String[] args) {

       Family family1=new People();

        family1.setHorse("Kvartyra");
        System.out.println(family1.getHorse());
        family1.setAddressHouse("8-mkr 12 dom 2kv");
        family1.getAddressHouse();
        family1.setAgee(2000);
        System.out.println("kom.usluga "+family1.pay());
        family1.setName("Family: Aidarovy  ");
        family1.setAmount(3);
        System.out.print(family1.getName());
        System.out.println(family1.getAmount());
        ((People) family1).setNamePeople("Aibek");
        ((People) family1).setSurnamePeople("Aidarov");
        ((People) family1).setAgePeople(25);
        ((People)family1).setGenderPeople("M");
        System.out.println(((People) family1).toString());
        ((People)family1).setNamePeople("Aigul");
        ((People) family1).setSurnamePeople("Aidarova");
        ((People) family1).setAgePeople(23);
        ((People) family1).setGenderPeople("W");
        System.out.println(((People) family1).toString());
        ((People)family1).setNamePeople("Seire");
        ((People) family1).setSurnamePeople("Aidarova");
        ((People) family1).setAgePeople(2);
        ((People) family1).setGenderPeople("W");
        System.out.println(((People) family1).toString());
        System.out.println("---------------------------------------------------------------");
        
        Family family2=new People();
        family2.setHorse("Obshaga");
        System.out.println(family2.getHorse());
        family2.setAddressHouse("Aitmatov 64");
        System.out.println(family2.getAddressHouse());
        family2.setAgee(4000);
        System.out.println("v got"+family2.pay());
        family2.setName("family: Nurlanov ");
        family2.setAmount(1);
        System.out.print(family2.getName());
        System.out.println(family2.getAmount());
        ((People) family2).setNamePeople("Ali");
        ((People) family2).setSurnamePeople("Nurlanov");
        ((People) family2).setAgePeople(21);
        ((People)family2).setGenderPeople("M");
        System.out.println( family2);
        System.out.println("-----------------------------------------------------------");

        Family family3=new People();
        family3.setHorse("Hotel");
        family3.setAddressHouse("Abaiy 21");
        family3.setAgee(1000);
        family3.setName("Family: Bolotov ");
        family3.setAmount(2);
        System.out.println(family3.getHorse());
        System.out.println(family3.getAddressHouse());
        System.out.println("v den "+family3.pay());
        System.out.print(family3.getName());
        System.out.println(family3.getAmount());

        ((People) family3).setNamePeople("Anvar");
        ((People) family3).setSurnamePeople("Bolot uulu");
        ((People) family3).setAgePeople(23);
        ((People)family3).setGenderPeople("M");

        ((People)family3).setNamePeople("Anara");
        ((People) family3).setSurnamePeople("Alibekova");
        ((People) family3).setAgePeople(23);
        ((People) family3).setGenderPeople("W");
        System.out.println(family3);

    }
}
