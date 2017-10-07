package com.youranxue.domain.vo;

import java.util.List;

import lombok.Data;

@Data
public class Section {
	private long sectionId;
	private String sectionName;
	private int allCounts;
	private int finishCounts;
	private List<Integer> thumbsups;

}
