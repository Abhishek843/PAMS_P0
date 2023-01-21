package com.revature.model;

public class Cancellation {
	private int cancellationId = 100001;
	// private String cancellationDate;
	private String CancellationReason;
	private int patientId;
	private String cancellationDate;
	

	public Cancellation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cancellation(int cancellationId, String cancellationDate, String cancellationReason, int patientId) {
		super();
		this.cancellationId = cancellationId = 100000;
		this.cancellationDate = cancellationDate;
		this.CancellationReason = cancellationReason;
		this.patientId = patientId;
	}

	public int getCancellationId() {
		return cancellationId;
	}

	/*
	 * public String getCancellationDate() { return cancellationDate; }
	 */
	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.CancellationReason = cancellationReason;
	}

	public int getOrderId() {
		return patientId;
	}

	public void setOrderId(int patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "Cancellation [cancellationId=" + cancellationId + ", CancellationReason=" + CancellationReason
				+ ", patientId=" + patientId + ", cancellationDate=" + cancellationDate + "]";
	}

}