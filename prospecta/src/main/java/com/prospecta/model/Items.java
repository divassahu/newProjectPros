package com.prospecta.model;

import java.util.List;

import lombok.Data;

@Data
public class Items {
	
	private int count;
	private List<Entry> entries;

}
