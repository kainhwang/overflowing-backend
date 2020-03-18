package com.church.overflowing.jpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.church.overflowing.jpa.dto.EducationMainResponseDto;
import com.church.overflowing.jpa.dto.EducationSaveRequestDto;
import com.church.overflowing.jpa.entity.Education;
import com.church.overflowing.jpa.repository.EducationRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EducationService {
	
	
	
	private EducationRepository educationRepository;
	
	
	
	@Transactional
	public Long insertEducation(EducationSaveRequestDto dto) {
		
		return educationRepository.save(dto.toEntity()).getEduSq();
	}
	
	
	
	@Transactional(readOnly = true)
	public List<EducationMainResponseDto> selectAllDesc() {
		
		return educationRepository.findAllDesc()
									.map(EducationMainResponseDto::new)
									.collect(Collectors.toList());
	}
	
	
	
	public Education selectEducationBySq(long sq) {
		
		return educationRepository.findOneByEduSq(sq);
	}
}
