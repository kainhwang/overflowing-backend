package com.church.overflowing.jpa.dto;

import com.church.overflowing.jpa.entity.Community;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;
import com.church.overflowing.util.DateUtil;

import lombok.Getter;

@Getter
public class CommunityMainResponseDto {
	
	private long commSq;
	
	private String commNm;
	
	private String commPaster;
	
	private String commStdate;
	
	private String commEnddate;
	
	private String commDesc;
	
	private YesOrNo commUseYn;
	
	
	public CommunityMainResponseDto(Community community) {
		
		commSq = community.getCommSq();
		commNm = community.getCommNm();
		commPaster = community.getCommPaster();
		commStdate = DateUtil.toStringDateTime(community.getCommStdate());
		commEnddate = DateUtil.toStringDateTime(community.getCommEnddate());
		commDesc = community.getCommDesc();
		commUseYn = community.getCommUseYn();
	}
}
