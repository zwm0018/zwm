package com.javaproject.demo.mapper;

import com.javaproject.demo.domain.Ebook;
import com.javaproject.demo.domain.EbookExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EbookMapper {
    public List<Ebook> list();

    long countByExample(EbookExample example);

    int deleteByExample(EbookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);

    List<Ebook> selectByExample(EbookExample example);

    Ebook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByExample(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}