
public class reverse_matrix {
   public static void main(String[] args) {
	   int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	   int reverse[][]=new int[3][3];
	   
	   for(int i=0; i<3 ; i++) {
		   for(int j=0; j<3 ; j++) {
			   reverse[i][j]=matrix[j][i];
		   }
	   }
	   System.out.println("Original Matrix is: ");
	   for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
	   }
	   System.out.println("Reversed Matrix is: ");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(reverse[i][j]+" ");    
		}    
		System.out.println();
	   
   }
   }
}

