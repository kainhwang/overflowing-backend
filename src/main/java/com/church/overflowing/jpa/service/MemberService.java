package com.church.overflowing.jpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.church.overflowing.jpa.dto.McMainResponseDto;
import com.church.overflowing.jpa.dto.MemberSaveRequestDto;
import com.church.overflowing.jpa.entity.Member;
import com.church.overflowing.jpa.repository.MemberRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MemberService {
	
	
	
	@Autowired
	private MemberRepository memberRepository;
	
	
	
	@Transactional
	public Long insertMember(MemberSaveRequestDto dto) {
		
		return memberRepository.save(dto.toEntity()).getMemSq();
	}
	
	
	
	@Transactional(readOnly = true)
	public List<McMainResponseDto> selectAllDesc() {
		
		return memberRepository.findAllDesc()
									.map(McMainResponseDto::new)
									.collect(Collectors.toList());
	}
	
	
	
	public Member selectMemberBySq(long sq) {
		
		return memberRepository.findOneByMemSq(sq);
	}
	
//	public Member selectMemberBySq(long memSq) {
//		
//		return memberRepository.findByMemSq(memSq);
//	}
//	
//	public List<Member> selectMemberAll() {
//		
//		return memberRepository.findAll();
//	}
}
