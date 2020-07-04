package com.example.demo.dao.auto;

import com.example.demo.auto.TblWeiBoFavor;
import com.example.demo.auto.TblWeiBoFavorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblWeiBoFavorMapper {
    int countByExample(TblWeiBoFavorExample example);

    int deleteByExample(TblWeiBoFavorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblWeiBoFavor record);

    int insertSelective(TblWeiBoFavor record);

    List<TblWeiBoFavor> selectByExample(TblWeiBoFavorExample example);

    TblWeiBoFavor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblWeiBoFavor record, @Param("example") TblWeiBoFavorExample example);

    int updateByExample(@Param("record") TblWeiBoFavor record, @Param("example") TblWeiBoFavorExample example);

    int updateByPrimaryKeySelective(TblWeiBoFavor record);

    int updateByPrimaryKey(TblWeiBoFavor record);
}