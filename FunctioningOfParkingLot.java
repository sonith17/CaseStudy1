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
        Scanner S2 = new Scanner(System.in);
        System.out.println("Enter Number Of Floors");
        int NoOfFloors = S2.nextInt();
        Management M = new Management(NoOfFloors);
        User U = new User();
        PreliminaryInstructions();
        int x = S2.nextInt();
        while(x!=-1)
        {
            ChooseVehicle();
            if(x==1)
            {
                int ChoiceOfVehicle = S2.nextInt(),FloorNumber=S2.nextInt();
                U.Enter(M, FloorNumber-1, ChoiceOfVehicle);
            }
            else if(x==2)
            {
                int ChoiceOfVehicle = S2.nextInt();
                U.Exit(M, ChoiceOfVehicle);   
            }
            PreliminaryInstructions();
            x =S2.nextInt();
        }
        S2.close();
    }
}