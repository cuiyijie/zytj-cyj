package com.cyj.zytjcyj.service;

import com.cyj.zytjcyj.entity.MembershipsEntity;

import java.util.List;

public interface MembershipsService {
    /***
     * 查询所有院系
     * @return
     */
    List<MembershipsEntity> queryaAllMemberships();
}
