package com.church.overflowing.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.church.overflowing.jpa.dto.CommunityMainResponseDto;
import com.church.overflowing.jpa.dto.CommunitySaveRequestDto;
import com.church.overflowing.jpa.service.CommunityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Api(tags = "COMMUNITY")
@RequestMapping("/community")
public class CommunityController {
	
	
	
	private CommunityService communityService;
//	private Environment enviroment;
	
	
	
	@PostMapping
	@ApiOperation(value = "공동체 등록", response = Long.class)
	public ResponseEntity<Object> registCmmunity(@RequestBody CommunitySaveRequestDto dto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(communityService.insertCommunity(dto));
	}
	
	
	
	@GetMapping("/{commSq}")
	@ApiOperation(value = "공동체 시퀀스로 검색", response = CommunityMainResponseDto.class)
	public ResponseEntity<Object> getCommunity(@PathVariable("commSq") Long commSq) {
		
		return ResponseEntity.status(HttpStatus.OK).body(communityService.selectCommunityBySq(commSq));
	}
	
	
	
	@GetMapping
	@ApiOperation(value = "공동체 전체 검색", response = CommunityMainResponseDto.class)
	public ResponseEntity<Object> getCommunityList() {
		
		return ResponseEntity.status(HttpStatus.OK).body(communityService.selectAllDesc());
	}
	
	
	
//	@GetMapping
//	public ResponseEntity<Object> getCommunity() {
//		
//		return new ResponseEntity<Object>(Arrays.stream(enviroment.getActiveProfiles()).findFirst().orElse(""), HttpStatus.OK);
//	}
}
