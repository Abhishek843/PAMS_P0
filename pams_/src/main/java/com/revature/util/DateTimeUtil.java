/*package com.revature.util;


public class DateTimeUtil{
	private static int cancellationId =100001;
	private String cancellationDate;
	private String CancellationReason;
	private int patientId;
	
	
	public Cancellation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cancellation(int cancellationId, String cancellationDate, String cancellationReason, int patientId) {
		super();
		this.cancellationId = cancellationId =100000;
		this.cancellationDate = cancellationDate;
		CancellationReason = cancellationReason;
		this.patientId = orderId;
	}
	
	public int getCancellationId() {
		return cancellationId;
	}
	public void setCancellationId() {
		this.cancellationId = cancellationId++;
	}
	public String getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	public String getCancellationReason() {
		return CancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		CancellationReason = cancellationReason;
	}
	public int getOrderId() {
		return patientId;
	}
	public void setOrderId(int orderId) {
		this.patientId = orderId;
	}
	
	@Override
	public String toString() {
		return "Cancellation [cancellationId=" + cancellationId + ", cancellationDate=" + cancellationDate
				+ ", CancellationReason=" + CancellationReason + ", orderId=" + patientId + "]";
	}
	
	

}
*/

package com.revature.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static String getCurrentDateTime() {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = format.format(date);
		return currentDateTime;
	}
}