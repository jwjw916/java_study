package com.example.demo;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 1. java beans 규약 필요
//  - 모든 member는 private
//  - getter/setter, default constructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // 테이블과 매핑해야해요
public class Employee {
	@Id // Primary Key로 동작하는 녀석
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empNo;
	private String name;
	private int age;
	private char gender;
	private long managerNo;
	private LocalDateTime hireDate;
	
	@ManyToOne(optional = false) // 여러 employee가 하나의 dept와 관계를 맺음 - join한다
	@JoinColumn(name = "dept_dept_id") // join에 사용되는 컬럼
	private Dept dept;
	
	}
