package com.church.overflowing.jpa.dto;

import com.church.overflowing.jpa.entity.Community;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;

import lombok.Getter;

@Getter
public class CommunityMainResponseDto {
	
	private String commNm;
	
	private String commPaster;
	
	private String commStdate;
	
	private String commEnddate;
	
	private String commDesc;
	
	private YesOrNo commUseYn;
	
	public CommunityMainResponseDto(Community community) {
		
	}
}
