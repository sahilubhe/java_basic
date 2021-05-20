package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLAccess {

	final private static String hostName = "localhost";
	final private static String userName = "root";
	final private static String password = "Ubhe@1150";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://"+hostName+"/project?"+"user="+userName+ "&password="+password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM project.classroom");
			while(resultSet.next()) {
				String student_name = resultSet.getString("student_name");
				String phone_number = resultSet.getString("phone_number");
				String address = resultSet.getString("address");
				System.out.println("Name:"+ student_name);
				System.out.println("Phone Number:"+ phone_number);
				System.out.println("Address:"+ address);
				System.out.println("\n\n");

			}
			
		}finally {
		}
	}
}