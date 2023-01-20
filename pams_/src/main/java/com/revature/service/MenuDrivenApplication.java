
package com.revature.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.dao.CancellationDao;
import java.util.Scanner;
import com.revature.dao.CancellationDaoImpl;
import com.revature.config.DatabaseConnection;
import com.revature.constants.Constants;
import com.revature.model.Appointment;
import com.revature.model.Order;
import com.revature.util.DateTimeUtil;

public class  MenuDrivenApplication {
	private static final Logger logger = Logger.getLogger(MenuDrivenApplication.class);
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {	
		showMenu();
	}
	
	public static void showMenu() throws SQLException, ClassNotFoundException {
		logger.info(Constants.WELCOME_MESSAGE);
		logger.info("================================================");
		logger.info("\n");		
		logger.info(Constants.SIGN_IN);
		logger.info(Constants.EXIT);

		char choice = 'y';
		do {
			choice = in.next().charAt(0);
			in.nextLine();

			switch (choice) {
			case '1':
				login();
				break;
			case '2':
				logger.info("**Thank You Visit Again!**");
				System.exit(0);
				break;
			default:
				logger.info("\t\t Enter a valid option");
			}
		} while (choice != 'n');
	}
	
	
	
	
	public static void login() throws SQLException, ClassNotFoundException {

		try(Connection connection = DatabaseConnection.getConnection();){
				Statement statement = connection.createStatement();
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		String username = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();
			// Execute a query
		    
			logger.info("Checking credentials...");

			String sql;
			sql = "SELECT * FROM patient WHERE preferred_login_id = '" + username + "' AND password = '" + password + "'";
			ResultSet rs = statement.executeQuery(sql);
			
			// Extract data from result set
			
			if (rs.next()) {
				// Retrieve by column name
				String customerName = rs.getString("preferred_login_id");
				String customerPassword = rs.getString("password");

				// Display values
				logger.info("\n");
				logger.info("------------ Welcome, " + customerName + "!----------------");
				cancelAppointments();
			} else {
				Scanner scan = new Scanner(System.in);
				logger.info("Invalid username or password.");
				logger.info("You are not a registered user");
				showMenu();
				
			}
		}
	}
	
	
	public static void cancelAppointment() throws SQLException, ClassNotFoundException {
		CancellationDaoImpl impl = new CancellationDaoImpl();
		CancellationDaoImpl olist = new CancellationDaoImpl();
		Appointment appointment  = new Appointment ();
		CancellationDaoImpl c = new CancellationDaoImpl();
		char ch;
		logger.info("=================================================");
		logger.info("\n \t \t  PLACED ORDERS: \n");
		impl.displayAppointmentlist();
		logger.info("==================================================================================================");
		
		do {
			/*logger.info("=================================================");
			logger.info("\n \t \t  PLACED ORDERS: \n");
			impl.displayOrderlist();
			logger.info("==================================================================================================");*/
			logger.info("Do you want to Cancel any order? \nPress y or n?");
			ch = in.next().charAt(0);
			in.nextLine();
			if(ch =='y')
			{
				logger.info("\n");
				logger.info("Enter the Details to Cancel: ");
	
				logger.info("Appointment ID: ");
				int oId = in.nextInt();
				in.nextLine();
				
				c.checkAppointment(oId); //call method to check if valid order 
				
				logger.info("Reason: ");
				String reason = in.next();
				in.nextLine();
				
				logger.info("\n");
				logger.info("Are you sure to cancel order "+oId+" ?\n Press y or n?");
				char ch2 = in.next().charAt(0);
				in.nextLine();
		
				if (ch2 == 'y') {
					c.getCancelAppointmentDetails(oId, reason);
					logger.info("***** Order Cancelled sucessfully ******");
					logger.info("\n");
					
					logger.info("===========================================");
					logger.info("View Cancellation details? \nPress y or n?");
					char ch3 = in.next().charAt(0);
					in.nextLine();
					if(ch3 =='y') {
						logger.info("Cancellation Details: ");
						logger.info("----------------------------------------------------------------------------------------------------------------------------------------------------------");
						c.displayCancellationDetails(oId);
						
						
						for(Appointment j: CancellationDao.cancelList ) {
							logger.info(j);	
						}
						logger.info("----------------------------------------------------------------------------------------------------------------------------------------------------------");
					}	
				}	
			}
			logger.info("Do you want to continue? Press y or n?");
			ch = in.next().charAt(0);
		}while(ch == 'y');
		logger.info("=================================================");
		logger.info("\n \t \t  PLACED ORDERS: \n");
		impl.displayAppointmentlist();
		logger.info("==================================================================================================");
		logger.info("\n");
		logger.info("Thank You Visit Again");
		logger.info("\n");
		showMenu();
	}
}
