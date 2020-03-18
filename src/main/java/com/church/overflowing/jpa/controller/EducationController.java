package com.church.overflowing.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.dto.EducationMainResponseDto;
import com.church.overflowing.jpa.dto.EducationSaveRequestDto;
import com.church.overflowing.jpa.service.EducationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Api(tags = "EDUCATION")
@RestController
@RequestMapping("/edu")
public class EducationController {
	
	
	
	private EducationService educationService;
	
	
	
	@PostMapping
	@ApiOperation(value = "교육 등록", response = Long.class)
	public ResponseEntity<Object> registEducation(@RequestBody EducationSaveRequestDto dto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(educationService.insertEducation(dto));
	}
	
	
	
	@GetMapping("/{eduSq}")
	@ApiOperation(value = "교육 시퀀스로 검색", response = EducationMainResponseDto.class)
	public ResponseEntity<Object> getEducation(@PathVariable("commSq") Long eduSq) {
		
		return ResponseEntity.status(HttpStatus.OK).body(educationService.selectEducationBySq(eduSq));
	}
	
	
	
	@GetMapping
	@ApiOperation(value = "교육 전체 검색", response = EducationMainResponseDto.class)
	public ResponseEntity<Object> getEducationList() {
		
		return ResponseEntity.status(HttpStatus.OK).body(educationService.selectAllDesc());
	}
}
