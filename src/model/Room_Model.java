/**
 * 
 */
package model;

/**
 * @author user
 *
 */
public class Room_Model {

private int roomId;
private String roomAvailability;
private int roomPrice;
private int roomNo;
public Room_Model(int roomId, String roomAvailability, int roomPrice,  int roomNo) {
	super();
	this.roomId = roomId;
	this.roomAvailability = roomAvailability;
	this.roomPrice = roomPrice;
	this.roomNo = roomNo;
}

public Room_Model(int roomId, String roomAvailability) {
	super();
	this.roomId = roomId;
	this.roomAvailability = roomAvailability;
}

public Room_Model() {
	this.roomId = 0;
	this.roomAvailability = "";
	this.roomPrice = 0;
	this.roomNo = 0;
}

public int getRoomId() {
	return roomId;
}

public void setRoomId(int roomId) {
	this.roomId = roomId;
}

public String getRoomAvailability() {
	return roomAvailability;
}

public void setRoomAvailability(String roomAvailability) {
	this.roomAvailability = roomAvailability;
}

public int getRoomPrice() {
	return roomPrice;
}

public void setRoomPrice(int roomPrice) {
	this.roomPrice = roomPrice;
}

public int getRoomNo() {
	return roomNo;
}

public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

@Override
public String toString() {
	return "Room_Model [roomId=" + roomId + ", roomAvailability=" + roomAvailability + ", roomPrice=" + roomPrice
			 + ", roomNo=" + roomNo + "]";
}




}
