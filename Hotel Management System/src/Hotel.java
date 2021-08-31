import java.util.ArrayList;
import java.util.Scanner;

public class Hotel implements Reservation, BuyFood, BookCar {
    public String admin, password;
    public ArrayList<User> UserList = new ArrayList();
    public ArrayList<Room> RoomList = new ArrayList();
    public ArrayList<Food> FoodMenu = new ArrayList();
    public ArrayList<Car> CarBooking = new ArrayList();
    public ArrayList<Room> ReservedRoomList = new ArrayList();
    public ArrayList<Food> OrderedFoodList = new ArrayList();
    public ArrayList<Car> BookedCarList = new ArrayList();
    public ArrayList<Employee> EmployeeList = new ArrayList();
    public ArrayList<Inventory> InventoryList = new ArrayList();

    public void ReserveRoom() {
    }

    public void BuyFood() {
    }

    public void BookCar() {
    }

    public Hotel() {
    }

    public Hotel(String admin, String password) {
        this.admin = admin;
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addUser(User U) {
        UserList.add(U);
    }

    public void removeUser(User U) {
        UserList.remove(U);
    }

    public void addRoom(Room R) {
        RoomList.add(R);
    }

    public void removeRoom(Room R) {
        RoomList.remove(R);
    }

    public void addFood(Food F) {
        FoodMenu.add(F);
    }

    public void removeFood(Food F) {
        FoodMenu.add(F);
    }

    public void addCar(Car C) {
        CarBooking.add(C);
    }

    public void removeCar(Car C) {
        CarBooking.remove(C);
    }

    public void ReserveRoom(Room R) {
        ReservedRoomList.add(R);
    }

    public void deleteReservation(Room R) {
        ReservedRoomList.remove(R);
    }

    public void BuyFood(Food F) {
        OrderedFoodList.add(F);
    }

    public void removeOrderedFood(Food F) {
        OrderedFoodList.remove(F);
    }

    public void BookCar(Car C) {
        BookedCarList.add(C);
    }

    public void removeBookedCar(Car C) {
        BookedCarList.remove(C);
    }

    public void addEmployee(Employee E) {
        EmployeeList.add(E);
    }

    public void removeEmployee(Employee E) {
        EmployeeList.remove(E);
    }

    public void addItem(Inventory I) {
        InventoryList.add(I);
    }

    public void removeItem(Inventory I) {
        InventoryList.remove(I);
    }

    public void displayUserList() {
        for (User U : UserList) {
            U.displayUser();
        }
    }

    public void displayRoomList() {
        for (Room R : RoomList) {
            R.displayRoom();
        }
    }

    public void displayFoodList() {
        for (Food F : FoodMenu) {
            F.displayFoodMenu();
        }
    }

    public void displayCarList() {
        for (Car C : CarBooking) {
            C.displayAvailableCar();
        }
    }

    public void displayReservedRoom() {
        for (Room R : ReservedRoomList) {
            R.displayRoom();
        }
    }

    public void displayOrderedFood() {
        for (Food F : OrderedFoodList) {
            F.displayFoodMenu();
        }
    }

    public void displayBookedCar() {
        for (Car C : BookedCarList) {
            C.displayAvailableCar();
        }
    }

    public void displayEmployeeList() {
        for (Employee E : EmployeeList) {
            E.displayEmployee();
        }
    }

    public void displayInventoryList() {
        for (Inventory I : InventoryList) {
            I.displayItem();
        }
    }

    public void viewServices() {
        System.out.println("\n\tServices Available : ");
        System.out.println("\t1. Food Service");
        System.out.println("\t2. Car Rental");
        System.out.println("\t3. Back To Main Menu");
    }


    public static void main(String[] args) {
        double RoomPayment=0.0;
        double FoodPayment=0.0;
        double CarPayment=0.0;

        Scanner userInput = new Scanner(System.in);

        Hotel H1 = new Hotel("Fahim", "1234");
        User U1 = new User("Fahim", "1234");

        Room R1 = new Room("STANDARD", "Non AC", 5000.00);
        Room R2 = new Room("PREMIUM", "AC", 10000.00);
        Room R3 = new Room("LUXARY", "AC,Bath Tub", 15000.00);
        Room R4 = new Room("VIP", "AC,Bath Tub,Swimming Pool", 20000.00);

        Food F1 = new Food("Burger", 200.00, 2);
        Food F2 = new Food("Pizza", 500.00, 2);
        Food F3 = new Food("Pasta", 250.00, 2);
        Food F4 = new Food("Fried Rice", 300.00, 2);

        Car C1 = new Car("Toyota", "SUV", 10000.00);
        Car C2 = new Car("Mercedes", "Sedan", 8000.00);
        Car C3 = new Car("BMW", "Jeep", 20000.00);

        Employee E1 = new Employee("Tanvir", "201");
        Employee E2 = new Employee("Prottoy", "202");
        Employee E3 = new Employee("Panick","203");
        Employee E4 = new Employee("Hasan","204");

        Inventory I1 = new Inventory("Pillow", 10);
        Inventory I2 = new Inventory("BedSheet", 10);
        Inventory I3 = new Inventory("Blanket", 10);

        H1.addUser(U1);
        H1.addRoom(R1);
        H1.addRoom(R2);
        H1.addRoom(R3);
        H1.addRoom(R4);
        H1.addFood(F1);
        H1.addFood(F2);
        H1.addFood(F3);
        H1.addFood(F4);
        H1.addCar(C1);
        H1.addCar(C2);
        H1.addCar(C3);
        H1.addEmployee(E1);
        H1.addEmployee(E2);
        H1.addEmployee(E3);
        H1.addEmployee(E4);
        H1.addItem(I1);
        H1.addItem(I2);
        H1.addItem(I3);



        for (int i = 0; ; i++) {
            System.out.println("\n\n\t\t\t\t[[=========================]]");
            System.out.println("\t\t\t\t   Hotel Management System");
            System.out.println("\t\t\t\t[[=========================]]");
            System.out.println("\n\t\t-----------------------------------------------");
            System.out.println("\t--------------------------------------------------------");
            System.out.println("\t\t   || Please Choose Your Required Option : ||");
            System.out.println("\t\t| =>Press 1 : View Available Rooms            |");
            System.out.println("\t\t| =>Press 2 : Reserve a Room                  |");
            System.out.println("\t\t| =>Press 3 : Update Reservation              |");
            System.out.println("\t\t| =>Press 4 : Cancel Reservation              |");
            System.out.println("\t\t| =>Press 5 : View Services                   |");
            System.out.println("\t\t| =>Press 6 : View Reservation Details        |");
            System.out.println("\t\t| =>Press 7 : View Hotel Status               |");
            System.out.println("\t\t| =>Press 8 : View Available Employee Details |");
            System.out.println("\t\t| =>Press 9 : View Inventory                  |");
            System.out.println("\t\t| =>Press 10 : To View Invoice                |");
            System.out.println("\t\t| =>Press 11 : To Exit Application            |");
            System.out.println("\t--------------------------------------------------------");
            System.out.println("\t\t-----------------------------------------------");

            int option = userInput.nextInt();
            if (option == 1) {
                System.out.println("\t Displaying Available Rooms : ");
                System.out.println("\t------------------------------");
                H1.displayRoomList();
            } else if (option == 2) {
                for (i = 0; ; i++) {
                    System.out.println("\n\t Select Your Rooms From The List : ");
                    System.out.println("\t-----------------------------------");
                    H1.displayRoomList();
                    System.out.println("\nPress 1 : Standard\tPress 2 : Premium\tPress 3 : Luxary\tPress 4 : VIP\tPress 5 : Go Back");
                    int roomchoice = userInput.nextInt();
                    if (roomchoice == 1) {
                        H1.ReserveRoom(R1);
                        RoomPayment+= R1.getRoomPrice();
                    } else if (roomchoice == 2) {
                        H1.ReserveRoom(R2);
                        RoomPayment+= R2.getRoomPrice();
                    } else if (roomchoice == 3) {
                        H1.ReserveRoom(R3);
                        RoomPayment+= R3.getRoomPrice();
                    } else if (roomchoice == 4) {
                        H1.ReserveRoom(R4);
                        RoomPayment+= R4.getRoomPrice();
                    } else if (roomchoice == 5) {
                        System.out.println("\nYour Reserved Rooms Are : ");
                        H1.displayReservedRoom();
                        System.out.println("\nTotal Bill : "+RoomPayment);
                        break;
                    }
                }
            } else if (option == 3) {
                for (i = 0; ; i++) {
                    System.out.println("\nWhich Information Do You Want To Update?");
                    System.out.println("\tPress 1 : To Update User Name\tPress 2 : To Update Password\tPress 3 : Exit");
                    int updateChoice = userInput.nextInt();
                    if (updateChoice == 1) {
                        System.out.println("Enter New Name : ");
                        String newName;
                        H1.setAdmin(newName = userInput.next());
                        System.out.println("New Name : " + H1.getAdmin());
                    } else if (updateChoice == 2) {
                        System.out.println("Enter New Password : ");
                        String newPass;
                        H1.setPassword(newPass = userInput.next());
                        System.out.println("New Name : " + H1.getPassword());
                    } else if (updateChoice == 3) {
                        System.out.println("\n\t Updated Informations Are : ");
                        System.out.println("\t----------------------------");
                        System.out.println("New Name : " + H1.getAdmin());
                        System.out.println("New Password : " + H1.getPassword());
                        break;
                    }
                }
            } else if (option == 4) {
                if(H1.ReservedRoomList.size()!=0){
                    for (i = 0; ; i++) {
                        System.out.println("\nWhich Room Do You Want To Cancel ? ");
                        System.out.println("\nPress 1: Standard\t Press 2: Premium\t Press 3: Luxary\tPress 4: VIP\tPress 5: Exit");
                        int deleteChoice = userInput.nextInt();
                        if (deleteChoice == 1) {
                            H1.deleteReservation(R1);
                            RoomPayment-=R1.getRoomPrice();
                        } else if (deleteChoice == 2) {
                            H1.deleteReservation(R2);
                            RoomPayment-=R2.getRoomPrice();
                        } else if (deleteChoice == 3) {
                            H1.deleteReservation(R3);
                            RoomPayment-=R3.getRoomPrice();
                        } else if (deleteChoice == 4) {
                            H1.deleteReservation(R4);
                            RoomPayment-=R4.getRoomPrice();
                        } else if (deleteChoice == 5) {
                            System.out.println("\n\tYour Reservation For Your Chosen Type Has Been Cancelled Successfully!");
                            break;
                        }
                    }
                }
                else if(H1.ReservedRoomList.size()==0){
                    System.out.println("\n\tThere Is No Reserved Room ! Please Try After Reserving A Room !");
                }

            } else if (option == 5) {
                for (i = 0; ; i++) {
                    H1.viewServices();
                    int serviceChoice = userInput.nextInt();
                    if (serviceChoice == 1) {
                        System.out.println("\n\t Available Foods : ");
                        System.out.println("\t-------------------");
                        H1.displayFoodList();
                        System.out.println("\nDo You Want to Order Food? : \nPress 1 : Yes\tPress 2 : NO ");
                        int foodorder = userInput.nextInt();
                        if (foodorder == 1) {
                            System.out.println("Select Food To Order : ");
                            H1.displayFoodList();
                            System.out.println("\nPress 1 : Burger\t Press 2 : Pizza\tPress 3 : Pasta\tPress 4 : Fried Rice\tPress 5 : Go Back :");
                            int foodchoice = userInput.nextInt();
                            if (foodchoice == 1) {
                                H1.BuyFood(F1);
                                FoodPayment+= F1.getFoodPrice();
                            } else if (foodchoice == 2) {
                                H1.BuyFood(F2);
                                FoodPayment+= F2.getFoodPrice();
                            } else if (foodchoice == 3) {
                                H1.BuyFood(F3);
                                FoodPayment+= F3.getFoodPrice();
                            } else if (foodchoice == 4) {
                                H1.BuyFood(F4);
                                FoodPayment+= F4.getFoodPrice();
                            } else if (foodchoice == 5) {
                                System.out.println("\n\tYour Total Bill Is : "+FoodPayment);
                                break;
                            }
                        }
                    } else if (serviceChoice == 2) {
                        System.out.println("\n\t Available Cars : ");
                        System.out.println("\t-------------------");
                        H1.displayCarList();
                        for (i = 0; ; i++) {
                            System.out.println("\n\tDo You Want To Book A Car? ");
                            System.out.println("\tPress 1: Yes\tPress 2: No");
                            int carBookChoice = userInput.nextInt();
                            if (carBookChoice == 1) {
                                System.out.println("\nWhich Car Do You Want ? ");
                                System.out.println("\n\tPress 1: Toyota\tPress 2: Mercedes\tPress 3: BMW\tPress 4: Exit");
                                int carChoice = userInput.nextInt();
                                if (carChoice == 1) {
                                    H1.BookCar(C1);
                                    CarPayment+=C1.getCarPrice();
                                } else if (carChoice == 2) {
                                    H1.BookCar(C2);
                                    CarPayment+=C2.getCarPrice();
                                } else if (carChoice == 3) {
                                    H1.BookCar(C3);
                                    CarPayment+=C3.getCarPrice();
                                } else if (option == 4) {
                                    System.out.println("\n\tYour Toal Bill Is : "+CarPayment);
                                    break;
                                }
                            } else if (carBookChoice == 2) {
                                System.out.println("\n\tDisplaying Booked Cars : ");
                                H1.displayBookedCar();
                                break;
                            }
                        }
                    } else if (serviceChoice == 3) {
                        System.out.println("\t Your Ordered Foods Are : ");
                        System.out.println("\t--------------------------");
                        if (H1.OrderedFoodList.size() != 0) {
                            H1.displayOrderedFood();
                        } else if (H1.OrderedFoodList.size() == 0) {
                            System.out.println("You Have Not Ordered Yet!! Please Place Your Order To Enjoy Delicious Foods !");
                        }
                        break;
                    }
                }
            } else if (option == 6) {
                System.out.println("\n\t Displaying User Details : ");
                System.out.println("\t---------------------------");
                H1.displayUserList();
                System.out.println("\n\t Displaying Reservation Details : ");
                System.out.println("\t----------------------------------");
                System.out.println("\n\tReserved Rooms : ");
                H1.displayReservedRoom();
                System.out.println("\n\tYour Total Bill For Room Is : "+RoomPayment);
                System.out.println("\n\tOrdered Food List : ");
                H1.displayOrderedFood();
                System.out.println("\n\tYour Total Bill For Room Is : "+FoodPayment);
                System.out.println("\n\tBooked Car List : ");
                H1.displayBookedCar();
                System.out.println("\n\tYour Total Bill For Room Is : "+CarPayment);
            } else if (option == 7) {
                System.out.println("\n\t\t\t Our Hotel Is Running Perfectly!");
                System.out.println("\t\t\t No Issues Has Been Reported Lately!");
                System.out.println("\t\t\t System Is Online!");
                System.out.println("\t\t\t**************************************");
            } else if (option == 8) {
                System.out.println("\n\t Displaying Current Employees inside Hotel :");
                System.out.println("\t---------------------------------------------");
                H1.displayEmployeeList();
            } else if (option == 9) {
                System.out.println("\n\t Displaying Inventory Status :");
                System.out.println("\t-------------------------------");
                H1.displayInventoryList();
            }
            else if(option==10){
                System.out.println("\n\tYour Bill For Room Is : "+RoomPayment);
                System.out.println("\n\tYour Bill For Room Is : "+FoodPayment);
                System.out.println("\n\tYour Bill For Room Is : "+CarPayment);
                System.out.println("\t-------------------------------");
                System.out.println("\n\tYour Total Bill Is : "+(RoomPayment+FoodPayment+CarPayment));
            }
            else if (option == 11) {
                System.out.println("\n\tWishing The Very Best For You :D See You !");
                break;
            }
        }
    }
}

