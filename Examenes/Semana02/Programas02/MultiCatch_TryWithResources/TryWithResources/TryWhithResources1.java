package TryWithResources;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryWhithResources1 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ResultSet resultSet = null;
		String sql = null;
		
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(sql);
			resultSet = pStatement.executeQuery();
		while (resultSet.next()) {
			}
		} 
		catch (SQLException e) {
			throw e;
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
					}//catch
			}//if resultSet
			if (pStatement != null) {
				try {
					pStatement.close();
				} catch (Exception e) {
					}//catch
			}//if pStatement
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					}//catch
			}//if conection
		}//finally
		
	}//main

	private static Connection getConnection() {
		return null;
	}
	
}//class TryWhithResources1
