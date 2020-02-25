package com.church.overflowing.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.church.overflowing.jpa.entity.Member;
import com.church.overflowing.jpa.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;
	
	public Member selectMemberBySq(long memSq) {
		
		return memberRepository.findByMemSq(memSq);
	}
}
