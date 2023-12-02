package com.xworkz.breakfast;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="breakfast")
public class BreakFastDto {//JPA
	
	@Id
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String type;

}
