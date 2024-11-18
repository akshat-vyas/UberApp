package com.Project.uberApp;

import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.RideRequest;
import com.Project.uberApp.strategies.RideStrategyManager;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.Project.uberApp.dto.PointDto;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;

import java.util.List;

@SpringBootTest

class UberAppApplicationTests {

//	@Autowired
//	RideStrategyManager rideStrategyManager;

	@Test
	void getListOfDrivers() {

//		GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
//		Coordinate pickupCoordinate = new Coordinate(74.221323, 28.33423123);
//		Coordinate dropOffCoordinate = new Coordinate(74.1213, 28.234123);
//		RideRequest rideRequest= RideRequest.builder()
//				.dropOffLocation( geometryFactory.createPoint(dropOffCoordinate))
//				.pickUpLocation(geometryFactory.createPoint(pickupCoordinate))
//				.build();
//		List<Driver> drivers =rideStrategyManager.driverMatchingStrategy(4.9).findMatchingDriver(rideRequest);
	}

}
