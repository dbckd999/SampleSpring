package org.sample.project.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class CommentDTO {
	private int c_no;
	private String c_id;
	private int c_content_no;
	private String c_comment;
	private Timestamp c_reg_date;
}