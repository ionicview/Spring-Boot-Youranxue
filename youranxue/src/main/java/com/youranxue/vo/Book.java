package com.youranxue.vo;

import lombok.Data;

@Data
public class Book {

	private Integer bookId;

	private String bookName;

	private String coverImgPath;

	public Book(Integer bookId, String bookName, String coverImgPath) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.coverImgPath = coverImgPath;
	}

}
