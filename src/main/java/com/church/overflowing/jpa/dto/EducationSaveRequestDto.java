package com.church.overflowing.jpa.dto;

import java.time.LocalDateTime;

import com.church.overflowing.jpa.entity.Education;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EducationSaveRequestDto {
	
	private String eduNm;
	
	private String eduTeacher;
	
	private LocalDateTime eduStdate;
	
	private LocalDateTime eduEnddate;
	
	private int eduFixedNum;
	
	private String eduPlace;
	
	private String eduDesc;
	
	
	
	@Builder
	public EducationSaveRequestDto(String eduNm,
									String eduTeacher,
									LocalDateTime eduStdate,
									LocalDateTime eduEnddate,
									int eduFixedNum,
									String eduPlace,
									String eduDesc) {
		
		this.eduNm = eduNm;
		this.eduTeacher = eduTeacher;
		this.eduStdate = eduStdate;
		this.eduEnddate = eduEnddate;
		this.eduFixedNum = eduFixedNum;
		this.eduPlace = eduPlace;
		this.eduDesc = eduDesc;
	}
	
	
	
	public Education toEntity() {
		
		return Education.builder()
						.eduNm(eduNm)
						.eduTeacher(eduTeacher)
						.eduStdate(eduStdate)
						.eduEnddate(eduEnddate)
						.eduFixedNum(eduFixedNum)
						.eduPlace(eduPlace)
						.eduDesc(eduDesc)
						.build();
	}
}
