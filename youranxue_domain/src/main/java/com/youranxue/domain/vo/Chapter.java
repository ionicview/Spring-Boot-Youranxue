package com.youranxue.domain.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Chapter {
	private long chapterId;
	private String chapterName;
	private List<Section> sectionList = new ArrayList<>();

	public void addSection(Section section) {
		this.sectionList.add(section);
	}
}
