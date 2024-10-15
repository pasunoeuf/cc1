public class RestaurantApp {
    public static void main(String[] args) {
        // Create individual menu items
        MenuComponent pasta = new MenuItem("Pasta", "Creamy Alfredo Pasta", 12.99);
        MenuComponent salad = new MenuItem("Caesar Salad", "Classic Caesar Salad", 7.99);
        MenuComponent burger = new MenuItem("Burger", "Beef Burger with Fries", 9.99);

        // Create a lunch menu and add items
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch Specials");
        lunchMenu.add(pasta);
        lunchMenu.add(salad);

        // Create a dinner menu and add items
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening Delights");
        dinnerMenu.add(burger);
        dinnerMenu.add(pasta);

        // Create the main menu and add sub-menus
        MenuComponent mainMenu = new Menu("Main Menu", "All Day Menu");
        mainMenu.add(lunchMenu);
        mainMenu.add(dinnerMenu);

        // Print the entire menu system
        System.out.println("Restaurant Menu:");
        mainMenu.print();
    }
}
