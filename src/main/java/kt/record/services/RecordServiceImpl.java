package kt.record.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.TypedSort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import kt.record.entity.Record;
import kt.record.entity.RecordPK;
import kt.record.repositories.RecordRepository; // extends jpa Crud 

@Service
public class RecordServiceImpl implements RecordService {

	private RecordRepository recordRepository;
	
	public void setRecordRepository(RecordRepository recordRepository) {
		this.recordRepository = recordRepository;
	}
	
	//전체조회
	@Override
	public List<Record> listAllRecord() {
		List<Record> recordList = recordRepository.findAll(); 
		return recordList;
	}
	
	//상세조회 /수정
	@Override
	public List<Record> findByIdx(Integer idx) {
		Optional<Record> optionalRecord = recordRepository.findById(idx);
		if(optionalRecord.isPresent()) {
			Record record = optionalRecord.get();
		}
		List<Record> recordList = recordRepository.findAll();
		
		return recordList;
	}
	
	//삭제
	@Override
	public void deleteRecord(Integer idx) {
		recordRepository.deleteById(idx);
	}
	
	
	
	
	//추후구현
//	@Override
//	public List<Record> findAllByCustNbOrSvcNb(String custNb, String svcNb, Pageable pageable) {
//		return null;
//	}
//	//추후구현
//	@Override
//	public List<Record> findAllByCustNbOrSvcNb(RecordPK pk, TypedSort<Record> sort) {
//		return null;
//	}
	
	
	
	
//	@Override
//	@Query("select r.* from record r where r.cust_number like ? 1")
//	public List<Record> findAllByCustAndSvc(String custNb, String svcNb) {
//		return null;
//	}
	
	// 소팅
//	@Override
//	public List<Record> findAllByCustNbOrSvcNb(String custNb, String svcNb, TypedSort<Record> sort) {
//		
//		TypedSort<Record> record = Sort.sort(Record.class); 
//		sort = (TypedSort<Record>) record.by(Record::getRegDate).ascending().and(record.by(Record::getRegDate).descending());
//		
//		List<Record> list = recordRepository.findAll();
//		return null;
//	}


	

}
