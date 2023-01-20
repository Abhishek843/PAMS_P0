package com.revature.constants;

public class Constants {
	public static final String SELECT_APPOINTMENT_QUERY = "SELECT `O`.`APPOINTMENT_ID`,`O`.`PREFERRED_LOGIN_ID`,`O`.`DOCTOR_ID`,`P`.`DOCTOR_NAME`,`O`.`PATIENT_AGE`,`O`.`TOTAL_FEE` ,`O`.`APPOINTMENT_DATE` FROM `pams_project`.`APPOINTMENT_DETAILS` `O` JOIN `pams_project`.`DOCTOR` `P` ON `P`.`DOCTOR_ID` = `O`.`DOCTOR_ID` WHERE `O`.`STATUS`='CONFIRMED'";
	public static final String UPDATE_STATUS = "UPDATE APPOINTMENT_details SET STATUS = 'Cancelled', CANCELLATION_ID =?, CANCELLATION_DATE =?, CANCELLATION_REASON = ? WHERE APPOINTMENT_ID= ? ";
	public static final String GET_APPOINTMENT_DETAILS= "SELECT * FROM APPOINTMENT_DETAILS";
	public static final String WELCOME_MESSAGE = "****WELCOME TO HOSPITAL *****";
	public static final String SIGN_IN = "1. Sign In";
	public static final String EXIT = "2. Exit";


	public static final String UPDATE_COUNT = "UPDATE DOCTOR p join appointment_details o on p.DOCTOR_ID=o.DOCTOR_ID set DOCTOR_EXPERIENCE= (p.DOCTOR_EXPERIENCE+ o.PATIENT_AGE ) where p.DOCTOR_ID = ? ";

	public static final String GET_PID = "SELECT DOCTOR_ID FROM APPOINTMENT_DETAILS WHERE APPOINTMENT_ID = ? ";

}