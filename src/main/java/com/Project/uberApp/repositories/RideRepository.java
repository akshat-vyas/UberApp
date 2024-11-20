package com.Project.uberApp.repositories;

import com.Project.uberApp.entities.Driver;
import com.Project.uberApp.entities.Ride;
import com.Project.uberApp.entities.Rider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
    Page<Ride> findByRider (Rider rider, Pageable pageRequest);

    Page<Ride> findByDriver (Driver driver, Pageable pageRequest);
}
