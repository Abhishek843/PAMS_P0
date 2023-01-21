


/*public class Patient{
	//private String patientId;
	//private String PatientName;
	private String reason;
	private String patientId;
	private String patientName;
	//private double Fees;
	private String status;
	private String CancellationId;

	public Patient() {
		super();
	}
	public Patient(String patientId, String PatientName, String reason, int duration, String status, String patientName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		//this.duration = duration;
		this.status = status;
		this.reason = reason;
	}
	
	public String getpatientId() {
		return patientId;
	}
	public void setpatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getreason() {
		return reason;
	}
	public void setreason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Authentication [ ,patientId=" + patientId + ", PatientName=" + PatientName + ", reason="
				+ reason + ",	Status+"+status+"]";
	}
	public String getCancellationId() {
		// TODO Auto-generated method stub
		return CancellationId;
	}
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}*/

/*public class Patient {
	private String patientId;
	private String patientName;
	private String appointmentStatus;
	
	public Patient() {
		super();
	}
	public Patient(String patientId, String patientName, String appointmentStatus) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentStatus=appointmentStatus;
	}
	
	public String getpatientId() {
		return patientId;
	}
	public void setpatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getpatientName() {
		return patientName;
	}
	public void setpatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getappointmentStatus() {
		return appointmentStatus;
	}
	public void setapointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	@Override
	public String toString() {
		return "Authentication [patientId=" + patientId + ", patientName=" + patientName + ", reason="
				+ appointmentStatus + "]";
	}
	public void setappointmentStatus(String string) {
		// TODO Auto-generated method stub
	}
	*/


package com.revature.model;
public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private int doctorExperience;
	private int doctorSlots;
	private String doctorEducation;
	private double doctorCharges;
	
	
	
	public Doctor(int doctorId, String doctorName, int doctorExperience, int doctorSlots, String doctorEducation,
			double doctorCharges) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorExperience = doctorExperience;
		this.doctorSlots = doctorSlots;
		this.doctorEducation = doctorEducation;
		this.doctorCharges = doctorCharges;
	}





	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public int getDoctorExperience() {
		return doctorExperience;
	}



	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}



	public int getDoctorSlots() {
		return doctorSlots;
	}



	public void setDoctorSlots(int doctorSlots) {
		this.doctorSlots = doctorSlots;
	}



	public String getDoctorEducation() {
		return doctorEducation;
	}



	public void setDoctorEducation(String doctorEducation) {
		this.doctorEducation = doctorEducation;
	}



	public double getDoctorCharges() {
		return doctorCharges;
	}



	public void setDoctorCharges(double doctorCharges) {
		this.doctorCharges = doctorCharges;
	}





	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorExperience=" + doctorExperience
				+ ", doctorSlots=" + doctorSlots + ", doctorEducation=" + doctorEducation + ", doctorCharges="
				+ doctorCharges + "]";
	}
	
}	