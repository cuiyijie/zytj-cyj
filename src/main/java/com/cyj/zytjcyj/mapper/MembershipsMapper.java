package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.MembershipsEntity;

import java.util.List;

public interface MembershipsMapper {
    /***
     * 查询所有院系
     * @return
     */
    List<MembershipsEntity> queryaAllMemberships();
}
