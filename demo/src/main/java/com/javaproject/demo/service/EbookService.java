package com.javaproject.demo.service;

import com.javaproject.demo.domain.Ebook;
import com.javaproject.demo.domain.EbookExample;
import com.javaproject.demo.mapper.EbookMapper;
import com.javaproject.demo.req.EbookReq;
import com.javaproject.demo.resp.EbookResp;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        // 使用Ebook执行查询
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 将查出的Ebook复制到EbookResp中
        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
//            ebookResp.setId(123l);
            respList.add(ebookResp);
        }
        // 将EbookResp类型的列表返回给Controller
        return respList;
    }
}
