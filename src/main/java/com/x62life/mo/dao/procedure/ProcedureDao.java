package com.x62life.mo.dao.procedure;

import java.util.Map;

public interface ProcedureDao {
    Map<String, Object> getDLVDTbyHolidayGeneral(Map<String, Object> paramMap);

    Map<String, Object> getDlvDtByHolidayPackage(Map<String, Object> paramMap);
}
