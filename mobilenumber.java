package week1.day1;

public class mobilenumber {
	String mobileModel = "samsung";
	float mobileweight = 10.5f;
	boolean isFullCharged=true;
	int mobileCost=10000;
	
	public void makeCall() {
		System.out.println("makeCall");	
		
	}
    public void sendMsg() {
    	System.out.println("sendMsg");
    }
    public static void main(String[] args) {
    	//System.out.println("In main method");
    	//mobilenumber mymobile=new mobilenumber();
    	//mymobile.makeCall();
    	//mymobile.sendMsg();
    	mobilenumber obj=new mobilenumber();
    	obj.makeCall();
    	obj.sendMsg();
    	System.out.println(obj.mobileModel);
    	System.out.println(obj.mobileweight);
    	System.out.println(obj.isFullCharged);
    	System.out.println(obj.mobileCost);
    	
    }
}
