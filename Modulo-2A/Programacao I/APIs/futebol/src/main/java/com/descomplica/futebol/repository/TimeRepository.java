package com.descomplica.futebol.repository;

import com.descomplica.futebol.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer> {
}
