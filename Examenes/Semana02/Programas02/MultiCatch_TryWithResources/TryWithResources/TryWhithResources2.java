package TryWithResources;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryWhithResources2 {

	public static void main(String[] args) throws SQLException {
		
		String sql = null;

		try (Connection connection = getConnection();
				PreparedStatement pStatement = connection.prepareStatement(sql);
				ResultSet resultSet =pStatement.executeQuery()){
		while (resultSet.next()) {
			}
		} 
		catch (SQLException e) { //Se encarga de manejar cualquier exception
			throw e;
		}//catch general 
	}//main

	private static Connection getConnection() {
		return null;
	}//getConnection
	
}//class TryWhithResources1
