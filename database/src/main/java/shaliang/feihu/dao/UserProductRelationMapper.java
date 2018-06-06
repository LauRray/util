package shaliang.feihu.dao;

import java.util.List;
import shaliang.feihu.entity.UserProductRelation;
import shaliang.feihu.entity.UserProductRelationExample;

public interface UserProductRelationMapper {
    long countByExample(UserProductRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserProductRelation record);

    int insertSelective(UserProductRelation record);

    List<UserProductRelation> selectByExample(UserProductRelationExample example);

    UserProductRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProductRelation record);

    int updateByPrimaryKey(UserProductRelation record);
}