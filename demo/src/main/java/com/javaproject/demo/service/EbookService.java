package com.javaproject.demo.service;

import com.javaproject.demo.domain.Ebook;
import com.javaproject.demo.mapper.EbookMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.list();
    }
}
