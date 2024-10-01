Cinema Management System
Overview
This project is a simulation of a cinema management system that demonstrates the use of five creational design patterns in Java. The system handles operations like movie management, ticket booking, scheduling, and generating the user interface. The main design patterns used are Singleton, Factory Method, Abstract Factory, Builder, and Prototype.

1. Singleton Pattern: System Configuration
The Singleton pattern is used to manage global settings like the cinema's name, number of screens, and operating hours. It ensures that there is only one instance of the configuration class throughout the entire system to avoid conflicts.

Example: We create a CinemaConfig object using the getInstance() method, which allows us to set and retrieve global settings like the cinema name.

CinemaConfig config = CinemaConfig.getInstance();
config.setCinemaName("Starlight Cinemas");

2. Factory Method: Movie Creation
The Factory Method pattern is used to create different types of movies, such as regular, 3D, or IMAX movies. This allows the system to dynamically create movie objects based on user input or system requirements.

Example: We use the MovieFactory to create movies. For example, the RegularMovieFactory creates a regular movie, while the IMAXMovieFactory creates an IMAX movie.


MovieFactory regularFactory = new RegularMovieFactory();
Movie movie = regularFactory.createMovie("Inception");

3. Abstract Factory: User Interface Generation
The Abstract Factory pattern is used to generate different styles (themes) for the user interface, such as a dark or light theme. Each theme has its own set of buttons, text fields, and other UI elements.

Example: Depending on the chosen theme (like DarkThemeFactory for dark mode), the system generates matching UI components.

UIFactory uiFactory = new DarkThemeFactory();
Button button = uiFactory.createButton();
button.render();

4. Builder Pattern: Ticket Booking
The Builder Pattern allows for step-by-step creation of ticket bookings. This is useful when you need to configure several options, like movie title, seat selection, and snack combos.

Example: Using the TicketBookingBuilder, you can easily create a ticket booking by chaining methods to set each option.

TicketBooking booking = new TicketBookingBuilder()
    .setMovieTitle("Inception")
    .setSeatNumber("A1")
    .setSnackCombo("Popcorn and Soda")
    .build();
    
5. Prototype Pattern: Movie Schedule
The Prototype Pattern allows for easy cloning and modification of movie schedules. This is helpful when you need to create multiple versions of a schedule without changing the original template.

Example: We create a schedule template and then clone it to make new schedules for different times or dates.

StandardSchedule template = new StandardSchedule();
template.setTime("18:00");
MovieSchedule eveningSchedule = template.clone();
eveningSchedule.setMovie(movie);

How does it all work together?
The Singleton pattern manages the cinema's global settings, making sure there's only one set of configurations.
Movies are created dynamically using the Factory Method based on the type of movie needed (Regular, IMAX, etc.).
The Abstract Factory creates a consistent user interface based on the chosen theme (dark or light).
The Builder Pattern allows users to customize their ticket bookings with options like seats and snacks.
The Prototype Pattern makes it easy to duplicate and modify movie schedules without affecting the original template.
This architecture helps make the cinema management system flexible, scalable, and easy to maintain.

