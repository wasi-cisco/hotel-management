## Project Overview
This is a Java-based Hotel Management System that allows management of hotels, rooms, guests, and reservations.  
The system supports:
- Creating hotels and adding rooms
- Creating guests
- Making reservations
- Checking room availability
- Unit and integration testing of core functionality  

The system is designed using **object-oriented principles**, with clear separation of domains (`Hotel`, `Room`, `Guest`, `Reservation`) and value objects (`Name`, `Address`, `Money`).

---

## Build and Run Instructions

### Prerequisites
- Java JDK 17 or higher
- Maven 3.8+ installed
- Optional: Visual Studio Code or any Java IDE

### Steps to Build
1. Open a terminal in the project root folder (where `pom.xml` is located)
2. Run:
   mvn clean compile
   Steps to Run

3. Run the main program:

mvn exec:java "-Dexec.mainClass=com.hotel.Main"

You should see console output confirming:

Reservations successfull

4. Steps to Execute Tests
Open terminal in project root
Run:
mvn test
