package com.example.SpringDataJDA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@GeneratedValue
	private long MaCB;	
	private String GaDi;	
	private String GaDen;	
	private int DoDai;	
	private String GioDi;	
	private String GioDen;
	private int ChiPhi;

	
	

}
