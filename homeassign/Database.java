package week3.homeassign;

public abstract class Database implements DatabaseConnection {
 
	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Database is connected successfully");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Database got disconnected");
	}

	
}
