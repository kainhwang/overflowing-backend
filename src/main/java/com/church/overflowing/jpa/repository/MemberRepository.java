package com.church.overflowing.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.church.overflowing.jpa.entity.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {
	
	Member findByMemSq(long memSq);
}
