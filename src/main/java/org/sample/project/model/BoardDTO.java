package org.sample.project.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDTO {
	private int b_no;
	private String b_title;
	private String b_content;
	private String b_writer;
	private Timestamp b_reg_date;
}