package com.sprint1.CapGPlus.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private String content;
	private User user;
	private Community community;
	private HashSet<User> likedBy;
	private List<Comment> comments;
	private LocalDateTime postedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public HashSet<User> getLikedBy() {
		return likedBy;
	}
	public void setLikedBy(HashSet<User> likedBy) {
		this.likedBy = likedBy;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public LocalDateTime getPostedAt() {
		return postedAt;
	}
	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}
	
}