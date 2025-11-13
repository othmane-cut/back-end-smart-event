package com.smart.event.back_end.database.repositories;

import com.smart.event.back_end.database.entities.Right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RightRepository extends JpaRepository<Right, Long> {
}
