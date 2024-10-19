package JspServletDao;

import JspServletModel.Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

        public int registerEmployee(Employees employees)throws ClassNotFoundException {
            String INSERT_USER_SQL="INSERT INTO empoyee"+"id,first_name,last_name,user_name,password,adress,contact)VALUES "
                    + "(?,?,?,?,?,?,?);";

            int result=0;
            Class.forName ("com.mysql.jdbc.Driver");

            try{
                Connection connection= DriverManager.
                        getConnection("jdbc:mysql://localhost:3306/imformation",
                                "root", "Moneygram34");

                PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER_SQL);
                preparedStatement.setInt(1,1);
                preparedStatement.setString(2, employees.getFirstName());
                preparedStatement.setString(3, employees.getLastName());
                preparedStatement.setString(4, employees.getUserName());
                preparedStatement.setString(5, employees.getPassword());
                preparedStatement.setString(6, employees.getAddress());
                preparedStatement.setString(7, employees.getContact());

                System.out.println(preparedStatement);

                result=preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();        }
            return 0;
        }


    }

