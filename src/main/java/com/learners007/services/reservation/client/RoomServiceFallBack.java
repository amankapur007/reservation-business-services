package com.learners007.services.reservation.client;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learners007.services.reservation.domain.Room;

@Component
public class RoomServiceFallBack implements RoomService {

	@Override
	public List<Room> findAll(String roomNumber) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

}
