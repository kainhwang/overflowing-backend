package com.church.overflowing.jpa.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.church.overflowing.jpa.entity.Member;


@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
	
	Member findByMemSq(long memSq);
	
	List<Member> findAll();
}
