package com.nt.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Plan_Categorey")
@Data
public class PlanCategorey {
	
	@Id
	@SequenceGenerator(name = "gen1",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator ="gen1",strategy = GenerationType.SEQUENCE )
	private int planId;
	@JoinColumn(referencedColumnName = "planName")
	private String category_name;
	private String hotel_stay;
	private String transportation_type;
	private float budget;
	
	
	private char activeSw;
	private Date createdDate;
	private Date udatedDate;
	private String createdBy;
	private String updatedBy;
	

}
