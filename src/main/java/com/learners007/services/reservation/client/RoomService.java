package com.learners007.services.reservation.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.learners007.services.reservation.domain.Room;

@FeignClient("ROOMSERVICES")
public interface RoomService {

	@RequestMapping(value="/rooms", method=RequestMethod.GET)
	List<Room> findAll(@RequestParam(name="roomNumber", required=false) String roomNumber);
}
