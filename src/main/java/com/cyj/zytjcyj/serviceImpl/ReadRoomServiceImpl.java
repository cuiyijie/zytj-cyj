package com.cyj.zytjcyj.serviceImpl;

import com.cyj.zytjcyj.entity.ReadroomsEntity;
import com.cyj.zytjcyj.mapper.ReadroomMapper;
import com.cyj.zytjcyj.service.ReadroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReadRoomServiceImpl implements ReadroomService {
    @Autowired
    private ReadroomMapper readroomMapper;
    /**
     * 查询所有阅览室
     * @return
     */
    @Override
    public List<ReadroomsEntity> queryAllRoom() {
        return readroomMapper.queryAllRoom();
    }
}
