package caseStudyV1_1;
import java.util.*;

public class FunctioningOfParkingLot {

    public static void PreliminaryInstructions()
    {
        System.out.println(" 1 To park Vehicle ");
        System.out.println(" 2 to remove Vehicle ");
        System.out.println(" -1 to end");
    }
    public static void ChooseVehicle()
    {
        System.out.println(" 1 To bike ");
        System.out.println(" 2 To car ");
        System.out.println(" 3 To truck ");
        System.out.println(" 4 To ElectricCar ");
    }


    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Number Of Floors");
        int NoOfFloors = S.nextInt();
        Floor F[] = new Floor[NoOfFloors];
        for(int i=0;i<NoOfFloors;i++)
        {
            System.out.println("enter No of Entries,Exits,SlotsX,SlotY,Cost,NoOfCars,Trucks,Bikes,costPerUnitCharge Respectively");
            int Entries =S.nextInt(),Exits=S.nextInt(),SlotsX=S.nextInt(),SlotsY = S.nextInt(),cost =S.nextInt(),NoOfCars=S.nextInt(),NoOfTrucks=S.nextInt(),NoOfBikes=S.nextInt(),costPerCharge=S.nextInt();
            F[i]= new Floor(SlotsX,SlotsY,Entries,Exits,cost,NoOfCars,NoOfBikes,NoOfTrucks,costPerCharge);
        }
        LinkedList<Bike> ListBikes = new LinkedList<>();
        LinkedList<Car> ListCars = new LinkedList<>();
        LinkedList<Truck> ListTrucks = new LinkedList<>();
        LinkedList<ElectricCar> ListElectricCars = new LinkedList<>();
        PreliminaryInstructions();
        int x = S.nextInt();
        while(x!=-1)
        {
            ChooseVehicle();
            if(x==1)
            {
                int x1 = S.nextInt();
                if(x1==1)
                {
                    System.out.println(" Choose floor from "+F.length+ " Floors to park ");
                    for(int i=0;i<F.length;i++)
                    {
                        F[i].DisplaySlots();
                    }
                    int x2 = S.nextInt()-1;
                    if(F[x2].CheckFloorEmpty())
                    {
                        System.out.println("Enter your Full Name ");
                        String Name = S.next();
                        Bike B = new Bike(Name);
                        F[x2].DisplayEntries();
                        int x3 = S.nextInt()-1;
                        F[x2].en[x3].IsEmpty= false;
                        F[x2].en[x3].prePaymentOptions();
                        int x4 = S.nextInt();
                        if(x4!= -1)
                        {
                            System.out.println(" Enter Advance You wish To pay ");
                            int Advance = S.nextInt();
                            F[x2].en[x3].PrePayment(Advance, B);
                        }
                        F[x2].en[x3].AssignInTime(B);
                        int slot = F[x2].AllocateParkingLot(B);
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].RemainingSpace-=1;
                        if(F[x2].s[xcordinate][ycordinate].RemainingSpace==0)
                        {
                            F[x2].s[xcordinate][ycordinate].IsSlotEmpty=false;
                        }
                        F[x2].en[x3].IsEmpty= true;
                        ListBikes.add(B);
                    }
                    else{System.out.println("Floor is full choose again");}
                }
                else if(x1==2)
                {
                    System.out.println(" Choose floor from "+F.length+ " Floors to park ");
                    for(int i=0;i<F.length;i++)
                    {
                        F[i].DisplaySlots();
                    }
                    int x2 = S.nextInt()-1;
                    if(F[x2].CheckFloorEmpty())
                    {
                        System.out.println("Enter your Full Name ");
                        String Name = S.next();
                        Car B = new Car(Name);
                        F[x2].DisplayEntries();
                        int x3 = S.nextInt()-1;
                        F[x2].en[x3].IsEmpty= false;
                        F[x2].en[x3].prePaymentOptions();
                        int x4 = S.nextInt();
                        if(x4!= -1)
                        {
                            System.out.println(" Enter Advance You wish To pay ");
                            int Advance = S.nextInt();
                            F[x2].en[x3].PrePayment(Advance, B);
                        }
                        F[x2].en[x3].AssignInTime(B);
                        int slot = F[x2].AllocateParkingLot(B);
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].RemainingSpace-=2;
                        if(F[x2].s[xcordinate][ycordinate].RemainingSpace==0)
                        {
                            F[x2].s[xcordinate][ycordinate].IsSlotEmpty=false;
                        }
                        F[x2].en[x3].IsEmpty= true;
                        ListCars.add(B);
                    }
                }
                else if(x1==3)
                {
                    System.out.println(" Choose floor from "+F.length+ " Floors to park ");
                    for(int i=0;i<F.length;i++)
                    {
                        F[i].DisplaySlots();
                    }
                    int x2 = S.nextInt()-1;
                    if(F[x2].CheckFloorEmpty())
                    {
                        System.out.println("Enter your Full Name ");
                        String Name = S.next();
                        Truck B = new Truck(Name);
                        F[x2].DisplayEntries();
                        int x3 = S.nextInt()-1;
                        F[x2].en[x3].IsEmpty= false;
                        F[x2].en[x3].prePaymentOptions();
                        int x4 = S.nextInt();
                        if(x4!= -1)
                        {
                            System.out.println(" Enter Advance You wish To pay ");
                            int Advance = S.nextInt();
                            F[x2].en[x3].PrePayment(Advance, B);
                        }
                        F[x2].en[x3].AssignInTime(B);
                        int slot = F[x2].AllocateParkingLot(B);
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].RemainingSpace=0;
                        F[x2].s[xcordinate][ycordinate].IsSlotEmpty=false;
                        F[x2].en[x3].IsEmpty= true;
                        ListTrucks.add(B);
                    }
                }
                else if(x1==4)
                {
                    System.out.println(" Choose floor from "+F.length+ " Floors to park ");
                    for(int i=0;i<F.length;i++)
                    {
                        F[i].DisplaySlots();
                    }
                    int x2 = S.nextInt()-1;
                    if(F[x2].CheckFloorEmpty())
                    {
                        System.out.println("Enter your Full Name ");
                        String Name = S.next();
                        ElectricCar B = new ElectricCar(Name);
                        F[x2].DisplayEntries();
                        int x3 = S.nextInt()-1;
                        F[x2].en[x3].IsEmpty= false;
                        F[x2].en[x3].prePaymentOptions();
                        int x4 = S.nextInt();
                        if(x4!= -1)
                        {
                            System.out.println(" Enter Advance You wish To pay ");
                            int Advance = S.nextInt();
                            F[x2].en[x3].PrePayment(Advance, B);
                        }
                        F[x2].en[x3].AssignInTime(B);
                        System.out.println("Enter 1 to Charge vehicle");
                        int r=S.nextInt();
                        if(r==1)
                        {
                            System.out.println("Enter units of charge required: ");
                            int z1=S.nextInt();
                            B.ChargeVehicle(z1,F[x2].getCostperUnitCharge());
                        }
                        int slot = F[x2].AllocateParkingLot(B);
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].RemainingSpace-=2;
                        if(F[x2].s[xcordinate][ycordinate].RemainingSpace==0)
                        {
                            F[x2].s[xcordinate][ycordinate].IsSlotEmpty=false;
                        }
                        F[x2].en[x3].IsEmpty= true;
                        ListElectricCars.add(B);
                    }
                }
            }
            else if(x==2)
            {
                int x1 = S.nextInt();
                if(x1==1)
                {
                    System.out.println(" Enter The Floor you Parked Your Vehicle");
                    int x2 = S.nextInt()-1;
                    while(x2>F.length || x2<0)
                    {
                        System.out.println("Enter Floor again (you entered invalid Floor)");
                        x2 = S.nextInt()-1;
                    }
                    int slot = 0,VehicleIdInList= -1;
                    boolean VehicleIsPresent=true;
                    while(VehicleIdInList<0 && VehicleIsPresent)
                    {
                        System.out.println("Enter Your Your Full Name as registerd in Info");
                        String Name = S.next();
                        for(int i=0;i<ListBikes.size();i++)
                        {
                            if(ListBikes.get(i).OwnerName.compareTo(Name)==0)
                            {
                                slot = ListBikes.get(i).AllocatedParkingLot;
                                VehicleIdInList= i;
                                break;
                            }
                        }
                        if(VehicleIdInList==-1)
                        {
                            System.out.println("Vehicle not found , Enter name Correctly");
                            System.out.println("If Your Vehicle is not parked ,Enter -2 ");
                        }
                        if(VehicleIdInList==-2)
                        {
                            VehicleIsPresent=false;
                        }
                    }
                    if(VehicleIdInList>=0)
                    {
                        System.out.println("Choose Exit");
                        F[x2].DisplayExits();
                        int x3 = S.nextInt()-1;
                        F[x2].ex[x3].IsEmpty=false;
                        F[x2].ex[x3].AssignOutTime(ListBikes.get(VehicleIdInList));
                        slot = ListBikes.get(VehicleIdInList).AllocatedParkingLot;
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].MakeSlotFree(1);
                        F[x2].ex[x3].CheckPayment(ListBikes.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].PaymentOptions();
                        int x4 =S.nextInt();
                        while(x4!=1&& x4!=2)
                        {
                            System.out.println("Invalid Payment Method,Enter Choice Again");
                            x4=S.nextInt();
                        }
                        if(x4==1)
                        {
                            ListBikes.get(VehicleIdInList).PaymentMethod="Card";
                        }
                        else if(x4==2)
                        {
                            ListBikes.get(VehicleIdInList).PaymentMethod="Attendant";
                        }
                        ListBikes.get(VehicleIdInList).PayFee();
                        F[x2].ex[x3].CheckPayment(ListBikes.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].IsEmpty=true;
                    }
                }
                else if(x1==2)
                {
                    System.out.println(" Enter The Floor you Parked Your Vehicle");
                    int x2 = S.nextInt()-1;
                    while(x2>F.length || x2<0)
                    {
                        System.out.println("Enter Floor again (you entered invalid Floor)");
                        x2 = S.nextInt()-1;
                    }
                    int slot = 0,VehicleIdInList= -1;
                    boolean VehicleIsPresent=true;
                    while(VehicleIdInList<0 && VehicleIsPresent)
                    {
                        System.out.println("Enter Your Your Full Name as registerd in Info");
                        String Name = S.next();
                        for(int i=0;i<ListCars.size();i++)
                        {
                            if(ListCars.get(i).OwnerName.compareTo(Name)==0)
                            {
                                slot = ListCars.get(i).AllocatedParkingLot;
                                VehicleIdInList= i;
                                break;
                            }
                        }
                        if(VehicleIdInList==-1)
                        {
                            System.out.println("Vehicle not found , Enter name Correctly");
                            System.out.println("If Your Vehicle is not parked ,Enter -2 ");
                        }
                        if(VehicleIdInList==-2)
                        {
                            VehicleIsPresent=false;
                        }
                    }
                    if(VehicleIdInList>=0)
                    {
                        System.out.println("Choose Exit");
                        F[x2].DisplayExits();
                        int x3 = S.nextInt()-1;
                        F[x2].ex[x3].IsEmpty=false;
                        F[x2].ex[x3].AssignOutTime(ListCars.get(VehicleIdInList));
                        slot = ListCars.get(VehicleIdInList).AllocatedParkingLot;
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].MakeSlotFree(2);
                        F[x2].ex[x3].CheckPayment(ListCars.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].PaymentOptions();
                        int x4 =S.nextInt();
                        while(x4!=1&& x4!=2)
                        {
                            System.out.println("Invalid Payment Method,Enter Choice Again");
                            x4=S.nextInt();
                        }
                        if(x4==1)
                        {
                            ListCars.get(VehicleIdInList).PaymentMethod="Card";
                        }
                        else if(x4==2)
                        {
                            ListCars.get(VehicleIdInList).PaymentMethod="Attendant";
                        }
                        ListCars.get(VehicleIdInList).PayFee();
                        F[x2].ex[x3].CheckPayment(ListCars.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].IsEmpty=true;
                    }
                }
                else if(x1==3)
                {
                    System.out.println(" Enter The Floor you Parked Your Vehicle");
                    int x2 = S.nextInt()-1;
                    while(x2>F.length || x2<0)
                    {
                        System.out.println("Enter Floor again (you entered invalid Floor)");
                        x2 = S.nextInt()-1;
                    }
                    int slot = 0,VehicleIdInList= -1;
                    boolean VehicleIsPresent=true;
                    while(VehicleIdInList<0 && VehicleIsPresent)
                    {
                        System.out.println("Enter Your Your Full Name as registerd in Info");
                        String Name = S.next();
                        for(int i=0;i<ListTrucks.size();i++)
                        {
                            if(ListTrucks.get(i).OwnerName.compareTo(Name)==0)
                            {
                                slot = ListTrucks.get(i).AllocatedParkingLot;
                                VehicleIdInList= i;
                                break;
                            }
                        }
                        if(VehicleIdInList==-1)
                        {
                            System.out.println("Vehicle not found , Enter name Correctly");
                            System.out.println("If Your Vehicle is not parked ,Enter -2 ");
                        }
                        if(VehicleIdInList==-2)
                        {
                            VehicleIsPresent=false;
                        }
                    }
                    if(VehicleIdInList>=0)
                    {
                        System.out.println("Choose Exit");
                        F[x2].DisplayExits();
                        int x3 = S.nextInt()-1;
                        F[x2].ex[x3].IsEmpty=false;
                        F[x2].ex[x3].AssignOutTime(ListTrucks.get(VehicleIdInList));
                        slot = ListTrucks.get(VehicleIdInList).AllocatedParkingLot;
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].MakeSlotFree(4);
                        F[x2].ex[x3].CheckPayment(ListTrucks.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].PaymentOptions();
                        int x4 =S.nextInt();
                        while(x4!=1&& x4!=2)
                        {
                            System.out.println("Invalid Payment Method,Enter Choice Again");
                            x4=S.nextInt();
                        }
                        if(x4==1)
                        {
                            ListTrucks.get(VehicleIdInList).PaymentMethod="Card";
                        }
                        else if(x4==2)
                        {
                            ListTrucks.get(VehicleIdInList).PaymentMethod="Attendant";
                        }
                        ListTrucks.get(VehicleIdInList).PayFee();
                        F[x2].ex[x3].CheckPayment(ListTrucks.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].IsEmpty=true;
                    }
                }

                else if(x1==4)
                {
                    System.out.println(" Enter The Floor you Parked Your Vehicle");
                    int x2 = S.nextInt()-1;
                    while(x2>F.length || x2<0)
                    {
                        System.out.println("Enter Floor again (you entered invalid Floor)");
                        x2 = S.nextInt()-1;
                    }
                    int slot = 0,VehicleIdInList= -1;
                    boolean VehicleIsPresent=true;
                    while(VehicleIdInList<0 && VehicleIsPresent)
                    {
                        System.out.println("Enter Your Your Full Name as registerd in Info");
                        String Name = S.next();
                        for(int i=0;i<ListElectricCars.size();i++)
                        {
                            if(ListElectricCars.get(i).OwnerName.compareTo(Name)==0)
                            {
                                slot = ListElectricCars.get(i).AllocatedParkingLot;
                                VehicleIdInList= i;
                                break;
                            }
                        }
                        if(VehicleIdInList==-1)
                        {
                            System.out.println("Vehicle not found , Enter name Correctly");
                            System.out.println("If Your Vehicle is not parked ,Enter -2 ");
                        }
                        if(VehicleIdInList==-2)
                        {
                            VehicleIsPresent=false;
                        }
                    }
                    if(VehicleIdInList>=0)
                    {
                        System.out.println("Choose Exit");
                        F[x2].DisplayExits();
                        int x3 = S.nextInt()-1;
                        F[x2].ex[x3].IsEmpty=false;
                        F[x2].ex[x3].AssignOutTime(ListElectricCars.get(VehicleIdInList));
                        slot = ListElectricCars.get(VehicleIdInList).AllocatedParkingLot;
                        int xcordinate = --slot/(F[x2].s[0].length);
                        int ycordinate =slot%(F[x2].s[0].length);
                        F[x2].s[xcordinate][ycordinate].MakeSlotFree(2);
                        F[x2].ex[x3].CheckPayment(ListElectricCars.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].PaymentOptions();
                        int x4 =S.nextInt();
                        while(x4!=1&& x4!=2)
                        {
                            System.out.println("Invalid Payment Method,Enter Choice Again");
                            x4=S.nextInt();
                        }
                        if(x4==1)
                        {
                            ListElectricCars.get(VehicleIdInList).PaymentMethod="Card";
                        }
                        else if(x4==2)
                        {
                            ListElectricCars.get(VehicleIdInList).PaymentMethod="Attendant";
                        }
                        ListElectricCars.get(VehicleIdInList).PayFee();
                        F[x2].ex[x3].CheckPayment(ListElectricCars.get(VehicleIdInList),F[x2].cost);
                        F[x2].ex[x3].IsEmpty=true;
                    }
                }
            }
            PreliminaryInstructions();
            x =S.nextInt();
        }
        S.close();
    }
}
// modify bill generation algorithmt