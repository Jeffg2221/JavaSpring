package com.jeffgomez.bundler.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "bundlers")
public class Bundler {
	
	// ==== Primary Key =================
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	// ==== Member Variables ============
    @NotEmpty(message = "name is required")
    @Size(min = 2, max = 100)
    private String name;
    
    @NotEmpty(message = "gender is required")
    @Size(min = 2, max = 100)
    private String gender;
    
    @NotEmpty(message = "Origin is required")
    @Size(min = 2, max = 50, message="Origin must be between 2 to 50 characters.")
    private String origin;
    
    @NotEmpty(message = "Meaning is required")
    @Size(min = 2, max = 500, message="My meaning must be between 2 to 500 characters.")
    private String meaning;
    
//    public String getGenre() {
//		return genre;
//	}
//
//	public void setGenre(String genre) {
//		this.genre = genre;
//	}
//
//	@NotEmpty
//    private String genre;

    // ==== Relationships ===============
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User creator;

	// ==== Data Creation Trackers ======
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

	// ==== Constructors ================
    public Bundler() {}
    
	public Bundler(String name, String gender, String meaning, String origin) {
		super();
		this.name = name;
		this.gender = gender;
		this.meaning = meaning;
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	// ==== Data Creation Event =========
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
        // ==== Getters and Setters =========
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getmeaning() {
		return meaning;
	}

	public void setmeaning(String meaning) {
		this.meaning = meaning;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
}