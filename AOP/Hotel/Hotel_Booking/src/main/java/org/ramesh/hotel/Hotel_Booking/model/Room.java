package org.ramesh.hotel.Hotel_Booking.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.testUtil.RandomUtil;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.utility.RandomString;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room
{
	private static final String RandomStringUtil = null;
	private static final String RandomStringUtils = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roomType;
	private BigDecimal roomPrice;
	private boolean isBooked = false;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<BookedRoom> bookings;

	public Room()
	{
		this.bookings= new ArrayList<>();
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getRoomType() {
		return roomType;
	}



	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}



	public BigDecimal getRoomPrice() {
		return roomPrice;
	}



	public void setRoomPrice(BigDecimal roomPrice) {
		this.roomPrice = roomPrice;
	}



	public List<BookedRoom> getBookings() {
		return bookings;
	}



	public void setBookings(List<BookedRoom> bookings) {
		this.bookings = bookings;
	}

	

	



	public Room(Long id, String roomType, BigDecimal roomPrice, List<BookedRoom> bookings) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.bookings = bookings;
	}



	public void addBookings(BookedRoom booking)
	{
		if(bookings==null)
		{
			bookings = new ArrayList<>();
		}
		bookings.add(booking);
		booking.setRoom(this);
		isBooked = true;
//		String bookingCode = RandomStringUtils.randomNumeric(count:1);
	}
	
	
}
