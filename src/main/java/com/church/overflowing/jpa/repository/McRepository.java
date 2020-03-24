package com.church.overflowing.jpa.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.church.overflowing.jpa.entity.MC;

public interface McRepository extends JpaRepository<MC, Long> {
	
	
	
	@Query("SELECT m FROM MC m ORDER BY m.mcSq DESC")
	Stream<MC> findAllDesc();
	
	MC findOneByMcSq(long mcSq);
}
