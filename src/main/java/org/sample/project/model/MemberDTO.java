package org.sample.project.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MemberDTO {
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_address;
	private Timestamp m_regDate;
}
