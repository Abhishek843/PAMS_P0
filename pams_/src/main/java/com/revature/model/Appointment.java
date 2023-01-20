package com.revature.model;

public class Appointment {
	private int appointmentId;
	private int patientId;
	private int patientAge ;
	private double totalFee;
	private String appointmentDate;
	private String status;
	private int cancellationId;
	private String cancellationDate;
	private String cancellationReason;
	private String preffered_login_Id;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCancellationId() {
		return cancellationId;
	}

	public void setCancellationId(int cancellationId) {
		this.cancellationId = cancellationId;
	}

	public String getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getPreffered_login_Id() {
		return preffered_login_Id;
	}

	public void setPreffered_login_Id(String preffered_login_Id) {
		this.preffered_login_Id = preffered_login_Id;
	}

	public Appointment(int appointmentId, int patientId, int patientAge, double totalFee, String appointmentDate,
			String status, int cancellationId, String cancellationDate, String cancellationReason,
			String preffered_login_Id) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientAge = patientAge;
		this.totalFee = totalFee;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.cancellationId = cancellationId;
		this.cancellationDate = cancellationDate;
		this.cancellationReason = cancellationReason;
		this.preffered_login_Id = preffered_login_Id;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", patientAge=" + patientAge
				+ ", totalFee=" + totalFee + ", appointmentDate=" + appointmentDate + ", status=" + status
				+ ", cancellationId=" + cancellationId + ", cancellationDate=" + cancellationDate
				+ ", cancellationReason=" + cancellationReason + ", preffered_login_Id=" + preffered_login_Id + "]";
	}
}

	

	