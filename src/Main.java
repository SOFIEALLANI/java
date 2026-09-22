//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Animal lion = new Animal("Felidae", "Simba", 5, true);

        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);

        Animal eagle = new Animal("Accipitridae", "Eagle", 3, false);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 20);

        myZoo.displayZoo();
        System.out.println(myZoo.toString());


            }

}