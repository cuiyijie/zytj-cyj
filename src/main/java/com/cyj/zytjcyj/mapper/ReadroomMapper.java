package com.cyj.zytjcyj.mapper;

import com.cyj.zytjcyj.entity.ReadroomsEntity;

import java.util.List;

public interface ReadroomMapper {
    /**
     * 查询所有阅览室
     * @return
     */
    List<ReadroomsEntity> queryAllRoom();

}
