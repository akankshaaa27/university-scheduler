package com.example.demo.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@jakarta.persistence.Entity
@Table(name ="contact")
public class Entity {

	@Id
	//private long id;
	private long mob;
	private String name;
	private String email;
	private String subject;
	private String message;
}
