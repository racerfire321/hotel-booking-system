package model;

public class RoomType_Model {
private int roomNo;
private String roomName;
private int noOfBeds;
private String balcony;
private int floorNo;
public RoomType_Model(int roomNo, String roomName, int noOfBeds, String balcony, int floorNo) {
	super();
	this.roomNo = roomNo;
	this.roomName = roomName;
	this.noOfBeds = noOfBeds;
	this.balcony = balcony;
	this.floorNo = floorNo;
}

public RoomType_Model(int roomNo, String roomName) {
	super();
	this.roomNo = roomNo;
	this.roomName = roomName;
}

public RoomType_Model() {
	this.roomNo = 0;
	this.roomName = "";
	this.noOfBeds = 0;
	this.balcony = "";
	this.floorNo = 0;
}

public int getRoomNo() {
	return roomNo;
}

public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

public String getRoomName() {
	return roomName;
}

public void setRoomName(String roomName) {
	this.roomName = roomName;
}

public int getNoOfBeds() {
	return noOfBeds;
}

public void setNoOfBeds(int noOfBeds) {
	this.noOfBeds = noOfBeds;
}

public String getBalcony() {
	return balcony;
}

public void setBalcony(String balcony) {
	this.balcony = balcony;
}

public int getFloorNo() {
	return floorNo;
}

public void setFloorNo(int floorNo) {
	this.floorNo = floorNo;
}

@Override
public String toString() {
	return "RoomType_Model [roomNo=" + roomNo + ", roomName=" + roomName + ", noOfBeds=" + noOfBeds + ", balcony="
			+ balcony + ", floorNo=" + floorNo + "]";
}





}
