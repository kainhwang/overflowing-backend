package com.church.overflowing.jpa.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.church.overflowing.jpa.entity.MC;
import com.church.overflowing.jpa.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {
	
	
	
	@Query("SELECT m FROM Member m ORDER BY m.memSq DESC")
	Stream<MC> findAllDesc();
	
	Member findOneByMemSq(long memSq);
}
