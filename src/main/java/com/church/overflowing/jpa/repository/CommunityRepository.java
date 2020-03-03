package com.church.overflowing.jpa.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.church.overflowing.jpa.entity.Community;

public interface CommunityRepository extends JpaRepository<Community, Long> {
	
	
	
	@Query("SELECT c FROM Community c ORDER BY c.sq DESC")
	Stream<Community> findAllDesc();
}
