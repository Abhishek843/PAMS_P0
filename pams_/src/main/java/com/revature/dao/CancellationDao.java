package com.revature.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.revature.model.Appointment;

public interface CancellationDao {
	

	/*public List<Patient> getPatients() throws SQLException;
	
	public String generateCancellationId(int patientId);
	
	public void getCancelTime();

	public int update(Patient patient) throws SQLException;
	
	public Patient getPatient(String PatientId) throws SQLException;

	Patient getPatient1(String PatientId) throws SQLException;
	*/
	public static List<Appointment> cancelList = new ArrayList<>();
	public void reflectChanges(int appointmentId);
	public void displayCancellationDetails(int appointmentId);
	public static ArrayList<Appointment> appointmentlist = new ArrayList<>();
	public void checkAppointment(int oId);
	public void cancelAppointment(int appointmentId, String reason) throws SQLException;
	
	public int generateCancellationId();
	

}