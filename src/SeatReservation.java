import java.util.*;
public class SeatReservation {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\t Movie Seat Reservation");
			char seat[][] = new char [5][5];
			for (int colum=1; colum <= 5; colum++)
				System.out.print("\t"+colum);
			System.out.println();
			for (int row = 0; row <= 4; row++)
			{
				System.out.print((row+1)+"\t");
				for (char col=0; col <=4; col++)
				{
					seat[row][col]= 'O';
					System.out.print(seat[row][col]+"\t");
				}
				System.out.println();	
			}
			while (true) {
				
				System.out.println("Enter seat row number by space: ");
				int x,y;
				while(!sc.hasNext("[12345]"))
				{
					System.out.println("Seat not exist");
					x = sc.nextInt();
					y = sc.nextInt();
					sc.next();
				}
				x = sc.nextInt();
				y = sc.nextInt();
				sc.nextLine();
				System.out.println("Name of person seat is: ");
				String name= sc.nextLine();
				while(name.trim().equals(""))
				{
					System.out.println("Name can't empty.");
					name = sc.nextLine();
					
				}
				System.out.println(name+" seat number is: "+x+y);
				
				if(seat[x-1][y-1]=='O') {
				for (int colum=1; colum <= 5; colum++)
					System.out.print("\t"+colum);
				System.out.println();
				for (int row = 0; row <= 4; row++){
					System.out.print((row+1)+"\t");
					
					for (int col=0; col <=4; col++){
							seat[x-1][y-1] = 'X';
							System.out.print(seat[row][col]+"\t");
							}
					System.out.println();	
					}
				}
				else
					System.out.println("Seat is not available.");
				System.out.println("Do you want reserve another one? (enter 'y' to continue or enter anything to stop)");
				char ch = sc.next().charAt(0);
				if (ch == 'y'|| ch=='Y')
				{
					sc.nextLine();
					continue;
				}
				else
					break;
				}
			
		}
		
	}
	
	

}
