package com.church.overflowing.jpa.dto;

import com.church.overflowing.jpa.entity.MC;
import com.church.overflowing.util.DateUtil;

import lombok.Getter;

@Getter
public class McMainResponseDto {
	
	private long mcSq;
	
	private String mcNm;
	
	private String mcLeader;
	
	private String mcStdate;
	
	private String mcEnddate;
	
	private String mcDesc;
	
	
	public McMainResponseDto(MC mc) {
		
		mcSq = mc.getMcSq();
		mcNm = mc.getMcNm();
		mcLeader = mc.getMcLeader();
		mcStdate = DateUtil.toStringDateTime(mc.getMcStdate());
		mcEnddate = DateUtil.toStringDateTime(mc.getMcEnddate());
		mcDesc = mc.getMcDesc();
	}
}
