package com.church.overflowing.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.church.overflowing.jpa.entity.Flags.YesOrNo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
@Table(name="EDUCATION_HIS")
public class EducationHistory extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EDU_HIS_SQ", updatable=false)
	private long eduHisSq;
	
	@Column(name="EDU_HIS_FINISH_YN")
	private YesOrNo eduHisFinishYn;
	
	@Column(name="EDU_HIS_DESC")
	private String eduHisDesc;

}
