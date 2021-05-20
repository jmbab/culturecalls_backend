package com.culturecalls.backend.repositories;

import com.culturecalls.backend.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository <Show, Long>{

}
