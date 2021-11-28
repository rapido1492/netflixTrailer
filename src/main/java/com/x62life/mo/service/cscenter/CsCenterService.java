package com.x62life.mo.service.cscenter;

import com.x62life.mo.model.boardcontents.BdFaq;
import com.x62life.mo.model.boardcontents.BdNotice;
import com.x62life.mo.model.boardcontents.BdNoticeEx;

import java.util.List;
import java.util.Map;

public interface CsCenterService {
    List<BdNotice> recentNoticeFiveList();

    List<BdNoticeEx> recentNoticeTenList(String typeFaq);

    List<BdFaq> faqPaging(Map<String,Object> paramMap);

    List<BdFaq> faqList(Map<String, Object> paramMap);

    Map<String, Object> faqContent();
}
