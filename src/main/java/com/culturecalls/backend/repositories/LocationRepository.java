package com.culturecalls.backend.repositories;

import com.culturecalls.backend.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository <Location, Long>{

}
