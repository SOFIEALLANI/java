public class Zoo {
    Animal [] animals=new Animal[20];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    void displayZoo() {
        System.out.println("nom  : " + name);
        System.out.println("Ville : " + city);
        System.out.println("nbre de cages : " + nbrCages);
    }
}
