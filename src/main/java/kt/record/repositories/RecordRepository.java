package kt.record.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kt.record.entity.Record;
import kt.record.entity.RecordPK;

//jpa -----> crud 할수 있게끔 엔티티랑 구분자값 타입가져옴 // 복합키일때 복합키 클래스를 가져옴 // 다중식별에서 일단 하나로 정의 
public interface RecordRepository extends JpaRepository<Record, Integer> {

}
