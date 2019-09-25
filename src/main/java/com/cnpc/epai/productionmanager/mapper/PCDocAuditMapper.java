package com.cnpc.epai.productionmanager.mapper;

import com.cnpc.epai.productionmanager.pojo.PCDocAudit;

public interface PCDocAuditMapper {
    int deleteByPrimaryKey(Object docuAuditId);

    int insert(PCDocAudit record);

    int insertSelective(PCDocAudit record);

    PCDocAudit selectByPrimaryKey(Object docuAuditId);

    int updateByPrimaryKeySelective(PCDocAudit record);

    int updateByPrimaryKey(PCDocAudit record);
}