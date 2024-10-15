public class PizzaShop {
    public static void main(String[] args) {

        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " -> $" + margherita.getCost());


        Pizza margheritaWithCheeseAndMushrooms = new MushroomTopping(new CheeseTopping(margherita));
        System.out.println(margheritaWithCheeseAndMushrooms.getDescription() + " -> $" + margheritaWithCheeseAndMushrooms.getCost());


        Pizza vegetarianWithPepperoniAndCheese = new CheeseTopping(new PepperoniTopping(new VegetarianPizza()));
        System.out.println(vegetarianWithPepperoniAndCheese.getDescription() + " -> $" + vegetarianWithPepperoniAndCheese.getCost());
    }
}
