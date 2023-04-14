package com.f.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "Register_Ap")
public class RegisterApi {

    @Id
   @Column 
	private String urlId;
    @Column
	private String request;
    @Column
	private String response;
    @Column
	private int module;
    @Column
	private int operation;
    @Column
	private int tags;
    @Column
	private String secretKey;
    @Column
	private int methodType;
    @Column
	private int inputType;
    @Column
	private int outputType;
	
    
}
