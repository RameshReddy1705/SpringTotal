//package org.ramesh9705.model;
//
//import java.time.LocalDateTime;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//@Entity
//public class CustomerCurrentSession
//{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer userId;
//	
//	private String type;
//	
//	private String userUniqueId;
//	
//	private LocalDateTime localDateTime;
//
//	public CustomerCurrentSession() {
//		super();
//	}
//
//	public CustomerCurrentSession(Integer userId, String type, String userUniqueId, LocalDateTime localDateTime) {
//		super();
//		this.userId = userId;
//		this.type = type;
//		this.userUniqueId = userUniqueId;
//		this.localDateTime = localDateTime;
//	}
//
//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getUserUniqueId() {
//		return userUniqueId;
//	}
//
//	public void setUserUniqueId(String userUniqueId) {
//		this.userUniqueId = userUniqueId;
//	}
//
//	public LocalDateTime getLocalDateTime() {
//		return localDateTime;
//	}
//
//	public void setLocalDateTime(LocalDateTime localDateTime) {
//		this.localDateTime = localDateTime;
//	}
//
//	@Override
//	public String toString() {
//		return "CustomerCurrentSession [userId=" + userId + ", type=" + type + ", userUniqueId=" + userUniqueId
//				+ ", localDateTime=" + localDateTime + "]";
//	}
//	
//	
//}
