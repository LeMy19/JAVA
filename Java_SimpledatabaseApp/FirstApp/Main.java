import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		HW1 hw=new HW1();
		
		System.out.println("Student ID: 1015087");
		System.out.println("Student Name: Lee Kiyeon");
		System.out.println();
		
		System.out.println("==== MENU ====");
		System.out.println("(1) Printing contents of the Movie table.");
		System.out.println("(2) Printing contents of the Production table.");
		System.out.println("(3) Printing contents of the Type table.");
		System.out.println("(4) Printing contents of the Rank table.");
		System.out.println("(5) Printing all the database contents");
		System.out.println("(6) Printing the title, release date, production name and rank of the top 5 ranked movies");
		System.out.println("(7) Printing movie title and production information");
		System.out.println("(8) Average Rank");
		System.out.println("(9) Insert a new movie.");
		System.out.println("(10) Update the rank of a movie.");
		System.out.println("(11) Delete a movie");
		System.out.println("(12) Exit");
		System.out.println();
		System.out.print("Choose the menu: ");
		
		int menu=input.nextInt();
		
		switch(menu){
		case 1:
			hw.doWork1();
			break;
		case 2:
			hw.doWork2();
			break;
		case 3:
			hw.doWork3();
			break;
		case 4:
			hw.doWork4();
			break;
		case 5:
			hw.doWork5();
			break;
		case 6:
			hw.doWork6();
			break;
		case 7:
			hw.doWork7();
			break;
		case 8: 
			System.out.println("Please choose the type: Love(1), Action(2), Horror(3), Comedy(4), Science Fiction(5)");
			int type=input.nextInt();
			
			switch(type){
			case 1:
				hw.doWork8_Love();
				break;
				
			case 2:
				hw.doWork8_Action();
				break;
			case 3:
				hw.doWork8_Horror();
				break;
			case 4:
				hw.doWork8_Comedy();
				break;
			case 5:
				hw.doWork8_SF();
				break;
				
			}
			break;
		case 12:
			hw.doWork12();
			break;
		}
		
	}
}