
class Bank {
 int getInterest() {
	return 0; }
	}
	
class SBI extends Bank {
 int getInterest() {
	return 8; }
	}

class HDFC extends Bank {
 int getInterest() {
	return 11; }
	}

	
class ICICI extends Bank {
	int getInterest() {
	return 7; }
	}

class AXIS extends Bank {
  int getInterest() {
     return 9; }
	 }
 class Test_Bank {
	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println("SBI rate of Interest: "+s.getInterest());
		AXIS a=new AXIS();
		System.out.println("Axis rate of Interest: "+a.getInterest());
		ICICI i=new ICICI();
		System.out.println("SBI rate of Interest: "+i.getInterest());
		HDFC h=new HDFC();
		System.out.println("HDFC rate of Interest: "+h.getInterest());
	}
 }