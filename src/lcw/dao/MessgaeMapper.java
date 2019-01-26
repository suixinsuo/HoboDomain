package lcw.dao;

import com.hobo.mms.domain.Messgae;

public interface MessgaeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Messgae record);

    int insertSelective(Messgae record);

    Messgae selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Messgae record);

    int updateByPrimaryKey(Messgae record);
}