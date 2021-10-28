package com.rupang.webservice.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 500,nullable = false)
	private String title;
	
	@Column(columnDefinition = "Text",nullable = false)
	private String content;
	
	private String author;
	
	@Builder
	public Posts(String title,String content,String author) {
		this.author=title;
		this.content=content;
		this.author=author;
	}
}
