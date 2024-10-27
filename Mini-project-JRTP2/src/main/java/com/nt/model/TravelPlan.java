package com.nt.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Travel_Plan")
@Data
@DynamicInsert(true)
public class TravelPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  planId;
		private String planName;
	private String planDescription;
	private String planMinBudget;
	private int planMinCategoreyId;
	
	
	private char activeSw;
	@Column(updatable = false)
	@CreationTimestamp
	private Date createdDate;
	@Column(insertable = false,updatable = true)
	@UpdateTimestamp
	private Date udatedDate;
	private Date createdBy;
	private Date updatedBy;
	

}
