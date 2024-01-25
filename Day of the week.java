/*
Create a Program that satisfy the following problems.

1. Display the day of the week depending on the user's input.

2. Display the Whole Week.

3. Display the days range depending on the user's input.
*/


import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	System.out.println("1.Display the day of the week");
	System.out.println("2.Display the whole week");
	System.out.println("3.Display the days range");
	Scanner scan = new Scanner(System.in);
	System.out.print("Choose Method:"); 
	int Method = scan.nextInt();

    switch (Method) { // switch case method for the 3 choices
        case 1: // 1 Display the day of the week
            System.out.println("Days of the Week: \n0 Sunday, 1 Monday, 2 Tuesday, 3 Wednesday, 4 Thursday, 5 Friday, 6 Saturday");
            System.out.print("Choose Day:"); 
            int i = scan.nextInt();
                switch(i){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Sunday");
                        break;
                        }
                    break;
        case 2: // 2 Display the Whole Week
            System.out.println("Sunday");
            System.out.println("Monday");					                       
            System.out.println("Tuesday");                     
            System.out.println("Wednesday");                      
            System.out.println("Thursday");                      
            System.out.println("Friday");                
            System.out.println("Saturday");
            break;
        
        case 3: // 3 Display the range of Days in a week
        	System.out.println("Days of the Week: \n1 Sunday, 2 Monday, 3 Tuesday, 4 Wednesday, 5 Thursday, 6 Friday, 7 Saturday");
            System.out.print("Choose End Point of Day:"); 
            int range = scan.nextInt();
            for(int j = 0; j <= range; j++){ // for loop for the end day range
                switch(j){
                    case 1:
                    	System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Please Enter A Valid Choice");
                        break;
                        }
            }
            break;
                
        default:
            System.out.println("Please enter a valid choice");
            break;
    }
}
}