import java.util.Arrays;
public class String_Sort {
		public static void main(String[] udhaya){
			String[] food= {"Tea","Coffee","Snacks","Burger","Sweet"};
			for(int i=0; i<food.length; i++) {
				for(int j=i+1; j<food.length; j++) {
				if(food[i].compareTo(food[j])>0) { 
				 String temp=food[i];
						food[i]=food[j];
						food[j]=temp;}
				}
			}
				System.out.print(Arrays.toString(food));
		}

}
