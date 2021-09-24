package com.neosoft.student.jwtmodel;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3385859061455143255L;
	
	private String username;
	private  String password;
	

}
