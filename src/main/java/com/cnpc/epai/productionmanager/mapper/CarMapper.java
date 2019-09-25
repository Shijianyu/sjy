package com.cnpc.epai.productionmanager.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CarMapper {

    /**
     * 查询测试
     * @param schema sql模板中使用的是${schema}, 此占位符会直接被“变量的值”替换，只有在动态设置比如schema的情况下使用，并且此参数的值“最好”不是有前台客户端直接传递的
     * @param fileClassId sql模板中使用的是#{fileClassId}, 此占位符会被替换成问号“?”, 这可以防止 sql 注入
     * @return
     */
    List<Map> selectCarList(@Param("schema") String schema, @Param("fileClassId") String fileClassId);
}
