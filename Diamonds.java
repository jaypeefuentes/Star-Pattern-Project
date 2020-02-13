import java.util.Scanner;

public class Diamonds {
	
	public static void main(String[] args) {
		
		int c1, c2;
		
		Scanner scannerc1 = new Scanner(System.in);
		System.out.println("Enter which figure you want to be created:");
		System.out.println("1. Left Triangle");
		System.out.println("2. Right Triangle");
		System.out.println("3. Diamond Pattern");
		System.out.println("4. Pyramid Pattern");
		c1 = scannerc1.nextInt();
		
		Scanner scannerc2 = new Scanner(System.in);
		System.out.println("Enter How many rows you want the pattern to be:");
		c2 = scannerc2.nextInt();
		
		switch (c1){
		
		case 1:
		
			int i,j;
			
			for(i=0; i<c2; i++){
				
				for(j=0; j<=i; j++){
					
					System.out.print("* ");
					
				}
				
				System.out.println();
				
			}
			
			break;
		
		case 2:
			
			for(i=0; i<c2; i++){
				
				for(j=2*(c2-i); j>=0; j--){
					
					System.out.print(" ");
					
				}
				
				
				for(j=0; j<=i; j++){
					
					System.out.print("* ");
					
				}
				
				System.out.println();
				
			}
			
			break;
			
		case 3:
			
			int space = c2 - 1;
			
			for(i=0; i<c2; i++){
				
				for(j=0; j<space; j++){
					
					System.out.print(" ");
					
				}
				
				for(j=0; j<=i; j++){
					
					System.out.print("* ");
					
				}
				
				System.out.print("\n");
				space--;
				
			}
			
			space = 0;
			
	        for (i = c2; i > 0; i--) 
	        { 

	            for (j = 0; j < space; j++) 
	                System.out.print(" "); 
	      

	            for (j = 0; j < i; j++) 
	                System.out.print("* "); 
	      
	            System.out.print("\n"); 
	            
	            space++; 
	        } 
	        
			break;
			
					
		case 4:
			
			for(i=0; i<c2; i++){
				
				for(j=c2-i; j>1; j--){
					
					System.out.print(" ");
					
				}
				
				for(j=0; j<=i; j++){
					
					System.out.print("* ");
					
				}
				
				System.out.println();
				
			}
			
			break;
					
		
		}

	  }
}
