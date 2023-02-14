package com.jeffgomez.bookclub.models;

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
@Table(name = "books")
public class Book {
	
	// ==== Primary Key =================
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	// ==== Member Variables ============
    @NotEmpty(message = "Title is required")
    @Size(min = 2, max = 100)
    private String title;
    
    @NotEmpty(message = "Author is required")
    @Size(min = 2, max = 100)
    private String author;
    
    @NotEmpty(message = "My thoughts is required")
    @Size(min = 2, max = 500, message="My thoughts must be between 2 to 500 characters.")
    private String thoughts;
    
    public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@NotEmpty
    private String genre;

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
    public Book() {}
    
	public Book(String title, String author, String thoughts) {
		super();
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
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
