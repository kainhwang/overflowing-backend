package com.church.overflowing.jpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.church.overflowing.jpa.dto.McMainResponseDto;
import com.church.overflowing.jpa.dto.McSaveRequestDto;
import com.church.overflowing.jpa.entity.MC;
import com.church.overflowing.jpa.repository.McRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class McService {
	
	
	
	private McRepository mcRepository;
	
	
	
	@Transactional
	public Long insertMc(McSaveRequestDto dto) {
		
		return mcRepository.save(dto.toEntity()).getMcSq();
	}
	
	
	
	@Transactional(readOnly = true)
	public List<McMainResponseDto> selectAllDesc() {
		
		return mcRepository.findAllDesc()
									.map(McMainResponseDto::new)
									.collect(Collectors.toList());
	}
	
	
	
	public MC selectMcBySq(long sq) {
		
		return mcRepository.findOneByMcSq(sq);
	}
}
