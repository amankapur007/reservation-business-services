package com.learners007.services.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learners007.services.reservation.domain.Room;;

@RestController
public class RoomReservationController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/rooms", method = RequestMethod.GET)
	public List<Room> getAllRooms() {
		ResponseEntity<List<Room>> roomsResponse = restTemplate.exchange("http://ROOMSERVICES/rooms", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Room>>() {
				});
		return roomsResponse.getBody();
	}
}
