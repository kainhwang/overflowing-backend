package com.church.overflowing.jpa.entity;

public class Flags {

	public static enum YesOrNo {
		Y, N
	}
	
	public static enum Gender {
		M, F
	}
	
	public static enum SchoolState {
		E,	//졸업
		I,	//재학
		R	//휴학
	}
	
	public static enum MemberGrade {
		R,
		S
	}
	
	public static enum ChurchJob {
		A, // admin
		P, // paster, 사역자
		G, // 간사
		L, // 리더
		M  // 성도
	}
}
