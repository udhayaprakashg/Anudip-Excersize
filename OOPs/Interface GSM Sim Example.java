
interface Sim {
	String	dailCall(long mobile_No);
	String sendSms(long mobile_No, String msg);
	}
	
 class Airtel implements Sim {
		public String dailCall(long mobile_No) {
		 return "Airtel NO busy plz try again"; }
		public String sendSms(long mobile_No, String msg) {
			return "Airtel masage sent"; }
	}
 class Vi implements Sim {
		public String dailCall(long mobile_No) {
		 return "Vi NO busy plz try again"; }
		public String sendSms(long mobile_No, String msg) {
			return "Vi masage sent"; }
	}
 class Mobile {
	private Sim s;
	public void insertSim(Sim s) {
	this.s=s;
	}
	public String dailCall(long mobile_No) {
		return s.dailCall(mobile_No);
		}
	public String sendSms(long mobile_No, String msg) {
		return s.sendSms(mobile_No,msg);
		}
	}
 class MobileUser {
	public static void main(String arg[]) {
		Mobile iphone=new Mobile();
		iphone.insertSim(new Airtel());
		String res=iphone.dailCall(79955);
		System.out.println(res);
	}
}
 
