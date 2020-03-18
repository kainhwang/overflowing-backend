package com.church.overflowing.jpa.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.church.overflowing.jpa.entity.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
	
	
	
	@Query("SELECT e FROM Education e ORDER BY e.eduSq DESC")
	Stream<Education> findAllDesc();
	
	Education findOneByEduSq(long eduSq);
}
