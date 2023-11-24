package model;

public class booking_Model {
	private int bookingId;
	private String checkIn;
	private String checkOut;
	private int adults;
	private int childrens;
	private String bookingStatus;
	private int customerId;
	private int roomId;
	public booking_Model(int bookingId, String checkIn, String checkOut, int adults, int childrens,
			String bookingStatus, int customerId, int roomId) {
		super();
		this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adults = adults;
		this.childrens = childrens;
		this.bookingStatus = bookingStatus;
		this.customerId = customerId;
		this.roomId = roomId;
	}
	
	public booking_Model(int bookingId, String checkIn, String checkOut, 
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.bookingStatus = bookingStatus;
	}

	public booking_Model(String checkIn, String checkOut, int adults, int childrens,
			String bookingStatus, int customerId, int roomId) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adults = adults;
		this.childrens = childrens;
		this.bookingStatus = bookingStatus;
		this.customerId = customerId;
		this.roomId = roomId;
	}
	public booking_Model() {
		this.checkIn = "";
		this.checkOut = "";
		this.adults = 0;
		this.childrens = 0;
		this.bookingStatus = "";
		this.customerId = 0;
		this.roomId = 0;
	}

	



	public booking_Model(int bookingId, String checkIn, String checkOut, int adults, int childrens) {
		// TODO Auto-generated constructor stub
		super();
		this.bookingId= bookingId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adults = adults;
		this.childrens = childrens;
	}
	
	

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildrens() {
		return childrens;
	}

	public void setChildrens(int childrens) {
		this.childrens = childrens;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Override
	public String toString() {
		return "booking_Model [bookingId=" + bookingId + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", adults="
				+ adults + ", childrens=" + childrens + ", bookingStatus=" + bookingStatus
				+ ", customerId=" + customerId + ", roomId=" + roomId + "]";
	}

	
	
	
}