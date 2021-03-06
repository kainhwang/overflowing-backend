package com.church.overflowing.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.church.overflowing.jpa.entity.Flags.ChurchJob;
import com.church.overflowing.jpa.entity.Flags.Gender;
import com.church.overflowing.jpa.entity.Flags.MemberGrade;
import com.church.overflowing.jpa.entity.Flags.SchoolState;
import com.church.overflowing.jpa.entity.Flags.YesOrNo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
@Table(name="MEMBER")
public class Member extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MEM_SQ", updatable=false)
	private long memSq;
	
	@Column(name="MEM_ID")
	private String memId;
	
	@Column(name="MEM_PWD")
	private String memPwd;
	
	@Column(name="MEM_NM")
	private String memNm;
	
	@Column(name="MEM_ENM")
	private String memEnm;
	
	@Column(name="MEM_BIRTH")
	private LocalDateTime memBirth;
	
	@Column(name="MEM_PHONE")
	private String memPhone;
	
	@Column(name="MEM_EMAIL")
	private String memEmail;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_GENDER")
	private Gender memGender;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_MARRIAGE_YN")
	private YesOrNo memMarriageYn;
	
	@Column(name="MEM_MARRIAGE_PARTNER")
	private String memMarriagePartner;
	
	@Column(name="MEM_MARRIAGE_DATE")
	private LocalDateTime memMarriageDate;
	
	@Column(name="MEM_REGDATE")
	private LocalDateTime memRegDate;
	
	@Column(name="MEM_GUIDE_NM")
	private String memGuideNm;
	
	@Column(name="MEM_PRE_CHURCH")
	private String memPreChurch;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_BAPTISM_YN")
	private YesOrNo memBaptismYn;
	
	@Column(name="MEM_BAPTISM_DATE")
	private LocalDateTime memBaptismDate;
	
	@Column(name="MEM_BAPTISM_CHURCH")
	private String memBaptismChurch;
	
	@Column(name="MEM_ADDR")
	private String memAddr;
	
	@Column(name="MEM_SCHOOL")
	private String memSchool;
	
	@Column(name="MEM_MAJOR")
	private String memMajor;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_SCHOOL_STATE")
	private SchoolState memSchoolState;
	
	@Column(name="MEM_COMPANY")
	private String memCompany;
	
	@Column(name="MEM_COMPANY_POSITION")
	private String memCompanyPosition;
	
	@Column(name="MEM_COMPANY_TASK")
	private String memCompanyTask;
	
	@Column(name="MEM_CAR_NM")
	private String memCarNm;
	
	@Column(name="MEM_CAR_NUM")
	private String memCarNum;
	
	@Column(name="MEM_CAR_POOL")
	private int memCarPool;
	
	@Column(name="MEM_DESC")
	private String memDesc;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_GRADE")
	private MemberGrade memGrade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="MEM_CHURCH_JOB")
	private ChurchJob memChurchJob;
	
	@Builder
	public Member(long memSq, String memId, String memPwd, String memNm, String memEnm, LocalDateTime memBirth,
			String memPhone, String memEmail, Gender memGender, YesOrNo memMarriageYn, String memMarriagePartner,
			LocalDateTime memMarriageDate, LocalDateTime memRegDate, String memGuideNm, String memPreChurch,
			YesOrNo memBaptismYn, LocalDateTime memBaptismDate, String memBaptismChurch, String memAddr, String memSchool,
			String memMajor, SchoolState memSchoolState, String memCompany, String memCompanyPosition,
			String memCompanyTask, String memCarNm, String memCarNum, int memCarPool, String memDesc,
			MemberGrade memGrade, ChurchJob memChurchJob) {
		
		this.memSq = memSq;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memNm = memNm;
		this.memEnm = memEnm;
		this.memBirth = memBirth;
		this.memPhone = memPhone;
		this.memEmail = memEmail;
		this.memGender = memGender;
		this.memMarriageYn = memMarriageYn;
		this.memMarriagePartner = memMarriagePartner;
		this.memMarriageDate = memMarriageDate;
		this.memRegDate = memRegDate;
		this.memGuideNm = memGuideNm;
		this.memPreChurch = memPreChurch;
		this.memBaptismYn = memBaptismYn;
		this.memBaptismDate = memBaptismDate;
		this.memBaptismChurch = memBaptismChurch;
		this.memAddr = memAddr;
		this.memSchool = memSchool;
		this.memMajor = memMajor;
		this.memSchoolState = memSchoolState;
		this.memCompany = memCompany;
		this.memCompanyPosition = memCompanyPosition;
		this.memCompanyTask = memCompanyTask;
		this.memCarNm = memCarNm;
		this.memCarNum = memCarNum;
		this.memCarPool = memCarPool;
		this.memDesc = memDesc;
		this.memGrade = memGrade;
		this.memChurchJob = memChurchJob;
	}
}
