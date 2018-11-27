package com.cyj.zytjcyj.service;

import com.cyj.zytjcyj.entity.ReadroomsEntity;

import java.util.List;

public interface ReadroomService {
    /**
     * 查询所有阅览室
     * @return
     */
    List<ReadroomsEntity> queryAllRoom();

}
