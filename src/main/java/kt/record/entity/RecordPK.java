package kt.record.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class RecordPK implements Serializable {
	private Integer idx;
	private String cust_number;
	private String svc_number;
	
}
