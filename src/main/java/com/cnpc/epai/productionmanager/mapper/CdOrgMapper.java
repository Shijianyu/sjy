package com.cnpc.epai.productionmanager.mapper;

import com.cnpc.epai.productionmanager.pojo.CdOrg;

public interface CdOrgMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(CdOrg record);

    int insertSelective(CdOrg record);

    CdOrg selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(CdOrg record);

    int updateByPrimaryKey(CdOrg record);
}