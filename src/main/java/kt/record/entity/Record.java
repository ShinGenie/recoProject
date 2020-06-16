package kt.record.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="record")
//@ConfigurationProperties(prefix="file")
@SequenceGenerator(
  name = "RECORD_SEQ_GENERATOR", 
  sequenceName = "record_idx_seq", // 매핑할 데이터베이스 시퀀스 이름 
  initialValue = 1,
  allocationSize = 1)
//@IdClass(RecordPK.class)
public class Record {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RECORD_SEQ_GENERATOR")
	@Column(name="idx")
	private Integer idx;
	
	//@Id
	@Column(name="cust_number")
	private String custNb; 
	
	//@Id
	@Column(name="svc_number")
	private String svcNb;
	
	@Column(name="upload_dir")
	private String uploadDir;
	
	@Column(name="svc_key")
	private String svcKey;
	
	@Column(name="cmd")
	private String cmd; 
	
	@Column(name="auth_token")
	private String authToken;
	
	@Column(name="rec_source")
	private Integer recSource;
	
	@Column(name="called_number")
	private String calledNb;
	
	@Column(name="retention_period")
	private Integer retentionPeriod;
	
	@Column(name="rec_period")
	private Integer recPeriod; 
	
	@Column(name="rec_count")
	private Integer recCnt;
	
	@Column(name="req_number")
	private String reqNb; 
	
	@Column(name="res_number")
	private String resNo;
	
	@Column(name="is_act")
	private String isAct;
	
	@Column(name="rec_name")
	private String recName;
	
	@Column(name="reg_date")
	@CreationTimestamp
	private LocalDateTime regDate;
	
	@Column(name="res_date")
	@CreationTimestamp
	private LocalDateTime resDate;
	
}
