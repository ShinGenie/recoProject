package kt.record.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.TypedSort;

import kt.record.entity.RecordPK;
import kt.record.entity.Record;

public interface RecordService {
	
	//전체조회
	List<Record> listAllRecord();
	
	//상세조회 
	List<Record> findByIdx(Integer idx);
	
	//상세조회 
	//List<Record> findAllByCustNbOrSvcNb(String custNb, String svcNb, Pageable pageable);
	
	//sort형식으롤 조회
	//List<Record> findAllByCustNbOrSvcNb(RecordPK pk, TypedSort<Record> sort);
	
	//삭제
	void deleteRecord(Integer idx);
}
