package emp.service;

import java.sql.Connection;
import java.util.List;

import static emp.dao.JdbcUtil.*;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

// ~~Service : 실질적인 비지니스 로직을 처리
public class EmpListService {
	
	public List<EmpDTO> getEmpList(){
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		List<EmpDTO> list = dao.getList();
		
		//select 작업 수행하는 거임으로 committe 이랑 rollback 이 필요없음
		close(con);
		
		return list;
	}

}
