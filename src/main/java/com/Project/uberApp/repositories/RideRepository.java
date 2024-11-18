package com.Project.uberApp.repositories;

import com.Project.uberApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
