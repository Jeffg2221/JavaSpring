package com.jeffgomez.mvcDemo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity //declares that is going to be apart of mysql
@Table(name="donation") // gives the table name of the model
public class Donation {
	//Attributes
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing
	 private Long id;
	 
	 
	 @Size(min = 3, max = 255)//validation for strings
	 @NotNull(message = "donationName is required!")
	 private String donationName;// The presistant layer will change this for you (dont try and snake case will cause errors later on)
	 
	 @Size(min = 2, max = 50)
	 @NotEmpty(message = "Decription is required!")
	 private String donor;
	 
	 @Min(0)// validation for ints
	 @Max(1000)// validation for ints
	 @NotNull
	 private Integer quantity; //wrapper class so our presistant class can handle the data type
	 
	 // This will not allow the createdAt column to be updated after creation
	 @Column(updatable=false)
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date createdAt;
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date updatedAt;
	 
	//constructor
	public Donation() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Donation( String donationName,String donor,Integer quantity) {
		this.donationName = donationName;
		this.donor = donor;
		this.quantity = quantity;
	}



	//getters and setters
	
	
	// other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public String getDonor() {
		return donor;
	}

	public void setDonor(String donor) {
		this.donor = donor;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}


	@PreUpdate // add the updated at date and time when being updated
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
