package StudentManager;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		int choose = 0;
		
		do{
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println("-----------------------Student Manager v1.0---------------------------");
			System.out.println("Enter Number:---------------------------------------------------------");
			System.out.println("Number 1: Input Information Student-----------------------------------");
			System.out.println("Number 2: Input Mark Student------------------------------------------");
			System.out.println("Number 3: Print One Student-------------------------------------------");
			System.out.println("Number 4: Print Class-------------------------------------------------");
			System.out.println("Number 5: Exit App----------------------------------------------------");
			System.out.println("----------------------------------------------------------------------");
			
			choose =  Integer.parseInt(input.nextLine());
			
			switch(choose){
			
			case 1: StudentManager.addStudentInfo();
				break;
			
			case 2: StudentManager.updateStudentMark();
				break;
			
			case 3: StudentManager.printStudent1();	
				break;
			case 4: StudentManager.printClass();	
				
				
			}
			
		}while(choose != 5);

	}

}
