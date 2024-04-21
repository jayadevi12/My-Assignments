package week3.homeassign;

public class JavaConnection extends Database{

	
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Java connection update is done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   JavaConnection jc = new JavaConnection();
   jc.connect();
   jc.disconnect();
   jc.executeUpdate();
	}

}
