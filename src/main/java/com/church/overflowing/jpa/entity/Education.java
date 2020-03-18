package com.church.overflowing.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
@Table(name="EDUCATION")
public class Education extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EDU_SQ", updatable=false)
	private long eduSq;
	
	@Column(name="EDU_NM")
	private String eduNm;
	
	@Column(name="EDU_TEACHER")
	private String eduTeacher;
	
	@Column(name="EDU_STDATE")
	private LocalDateTime eduStdate;
	
	@Column(name="EDU_ENDDATE")
	private LocalDateTime eduEnddate;
	
	@Column(name="EDU_FIXED_NUM")
	private int eduFixedNum;
	
	@Column(name="EDU_PLACE")
	private String eduPlace;
	
	@Column(name="EDU_DESC")
	private String eduDesc;
	
	
	
	@Builder
	public Education(long eduSq,
						String eduNm,
						String eduTeacher,
						LocalDateTime eduStdate,
						LocalDateTime eduEnddate,
						int eduFixedNum,
						String eduPlace,
						String eduDesc) {
		
		this.eduSq = eduSq;
		this.eduNm = eduNm;
		this.eduTeacher = eduTeacher;
		this.eduStdate = eduStdate;
		this.eduEnddate = eduEnddate;
		this.eduFixedNum = eduFixedNum;
		this.eduPlace = eduPlace;
		this.eduDesc = eduDesc;
	}	
}
