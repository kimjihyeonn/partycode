package co.kr.mono.training.dto;

import java.sql.Timestamp;

public class SimpleDTO {
private String currentStrDate;
private java.util.Date utilCurrentDate;
private java.sql.Date	sqlCurrentDate;
private java.sql.Timestamp	sqlCurrentTimeStamp;
	
private java.sql.Timestamp	sqlDbCurrentTimeStamp;

public SimpleDTO() {
	// TODO Auto-generated constructor stub
}
public SimpleDTO(Timestamp sqlDbCurrentTimeStamp) {
	super();
	this.sqlDbCurrentTimeStamp = sqlDbCurrentTimeStamp;
}

@Override
public String toString() {
	return "SimpleDTO [currentStrDate=" + currentStrDate + ", utilCurrentDate=" + utilCurrentDate + ", sqlCurrentDate="
			+ sqlCurrentDate + ", sqlCurrentTimeStamp=" + sqlCurrentTimeStamp + ", sqlDbCurrentTimeStamp="
			+ sqlDbCurrentTimeStamp + "]";
}

public String getCurrentStrDate() {
	return currentStrDate;
}

public void setCurrentStrDate(String currentStrDate) {
	this.currentStrDate = currentStrDate;
}

public java.util.Date getUtilCurrentDate() {
	return utilCurrentDate;
}

public void setUtilCurrentDate(java.util.Date utilCurrentDate) {
	this.utilCurrentDate = utilCurrentDate;
}

public java.sql.Date getSqlCurrentDate() {
	return sqlCurrentDate;
}

public void setSqlCurrentDate(java.sql.Date sqlCurrentDate) {
	this.sqlCurrentDate = sqlCurrentDate;
}

public java.sql.Timestamp getSqlCurrentTimeStamp() {
	return sqlCurrentTimeStamp;
}

public void setSqlCurrentTimeStamp(java.sql.Timestamp sqlCurrentTimeStamp) {
	this.sqlCurrentTimeStamp = sqlCurrentTimeStamp;
}
	
}
