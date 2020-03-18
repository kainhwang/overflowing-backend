package com.church.overflowing.jpa.dto;

import com.church.overflowing.jpa.entity.Education;
import com.church.overflowing.util.DateUtil;

import lombok.Getter;

@Getter
public class EducationMainResponseDto {
	
	private long eduSq;
	
	private String eduNm;
	
	private String eduTeacher;
	
	private String eduStdate;
	
	private String eduEnddate;
	
	private int eduFixedNum;
	
	private String eduPlace;
	
	private String eduDesc;
	
	
	
	public EducationMainResponseDto(Education education) {
		
		eduSq = education.getEduSq();
		eduNm = education.getEduNm();
		eduTeacher = education.getEduTeacher();
		eduStdate = DateUtil.toStringDateTime(education.getEduStdate());
		eduEnddate = DateUtil.toStringDateTime(education.getEduEnddate());
		eduFixedNum = education.getEduFixedNum();
		eduPlace = education.getEduPlace();
		eduDesc = education.getEduDesc();
	}
}
