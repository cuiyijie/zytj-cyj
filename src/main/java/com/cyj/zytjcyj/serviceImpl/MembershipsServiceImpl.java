package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.MembershipsEntity;
import com.cyj.zytjcyj.mapper.MembershipsMapper;
import com.cyj.zytjcyj.service.MembershipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MembershipsServiceImpl implements MembershipsService {
    @Autowired
    private MembershipsMapper membershipsMapper;
    /***
     * 查询所有院系
     * @return
     */
    @Override
    public List<MembershipsEntity> queryaAllMemberships() {
        return membershipsMapper.queryaAllMemberships();
    }
}
