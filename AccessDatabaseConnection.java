import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class AccessDatabaseConnection {
    public static void main(String[] args) {
        // JDBC URL for Access database
        String url = "jdbc:ucanaccess:///C:/Users/Azrieli/IntelliJIDEAProjects/Library/YourDatabase.accdb";

        // JDBC connection parameters
        String user = "";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Now you can use 'connection' to interact with the database
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM your_table");

            // Process the result set
            while (resultSet.next()) {
                // Access columns using resultSet.get<DataType>("column_name")
                String columnName = resultSet.getString("column_name");
                System.out.println(columnName);
            }

            // Don't forget to close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
