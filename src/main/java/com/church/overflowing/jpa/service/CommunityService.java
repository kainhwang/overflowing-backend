package com.church.overflowing.jpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.church.overflowing.jpa.dto.CommunityMainResponseDto;
import com.church.overflowing.jpa.dto.CommunitySaveRequestDto;
import com.church.overflowing.jpa.entity.Community;
import com.church.overflowing.jpa.repository.CommunityRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CommunityService {
	
	
	
	private CommunityRepository communityRepository;
	
	
	
	@Transactional
	public Long insertCommunity(CommunitySaveRequestDto dto) {
		
		return communityRepository.save(dto.toEntity()).getCommSq();
	}
	
	
	
	@Transactional(readOnly = true)
	public List<CommunityMainResponseDto> selectAllDesc() {
		
		return communityRepository.findAllDesc()
									.map(CommunityMainResponseDto::new)
									.collect(Collectors.toList());
	}
	
	
	
	public Community selectCommunityBySq(long sq) {
		
		return communityRepository.findOneByCommSq(sq);
	}
}
