package com.learners007.services.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learners007.services.reservation.client.RoomService;
import com.learners007.services.reservation.domain.Room;;

@RestController
public class RoomReservationController {

	@Autowired
	private RoomService roomService;

	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<Room> getAllRooms() {
		return roomService.findAll(null);
	}
}
