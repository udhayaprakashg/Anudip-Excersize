
interface Interface_Vehicle_Example {
		void owner(String n);
		void vechicle_name(String v);
		void engine_capacity(String c);
		void speed(int s);
}

	class Bike implements Interface_Vehicle_Example{
        String name;
        String v_name;
        String capacity;
        int speed;
        
        
		@Override
		public void owner(String n) {
           name = n;
			
		}
		
		@Override
		public void vechicle_name(String v) {
			v_name =v;
			
		}

		@Override
		public void engine_capacity(String c) {
			capacity =c;
			
		}

		@Override
		public void speed(int s) {
			speed=s;
			
		}
		
		
		public void Bike_detail() {
			System.out.println(name+" is owner of this "+v_name+" Bike and This engine capacity is "+
		capacity+". The speed of the bike upto "+speed+"km.");
			
	}
	}
		
		class Car implements Interface_Vehicle_Example{
			String name;
	        String v_name;
	        String capacity;
	        int speed;
	        
	        
			@Override
			public void owner(String n) {
	           name = n;
				
			}
			
			@Override
			public void vechicle_name(String v) {
				v_name =v;
				
			}

			@Override
			public void engine_capacity(String c) {
				capacity =c;
				
			}

			@Override
			public void speed(int s) {
				speed=s;
				
			}
			
			
			public void Car_detail() {
				System.out.println(name+" is owner of this "+v_name+" Bike and This engine capacity is "+
			capacity+". The speed of the bike upto "+speed+"km.");
				
		}
			
		}
		
		
	class Main {
	
		public static void main (String[] args) {
		
			Bike bike = new Bike();
			bike.owner("Udhayaprakash");
			bike.engine_capacity("150cc");
			bike.vechicle_name("TVS");
			bike.speed(150);
			System.out.println("Bike Details:\n");
			bike.Bike_detail();
			
			System.out.println("------------------------------");
			
			Car car = new Car();
			car.owner("Manikandan");
			car.engine_capacity("500cc");
			car.vechicle_name("Toyato");
			car.speed(300);
			System.out.println("Car Details:\n");
			car.Car_detail();
			
		}
	}