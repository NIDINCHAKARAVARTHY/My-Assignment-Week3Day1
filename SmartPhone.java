package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsup() {
		System.out.println("Connect Through Whatsup");
	}
   public void takeVideo() {
	   System.out.println("Take Video From SmartPhone");
   }
	public static void main(String[] args) {
		
		SmartPhone obj = new SmartPhone();
		obj.connectWhatsup();
		obj.takeVideo();
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
	}
}
