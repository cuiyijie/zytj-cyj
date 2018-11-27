package com.cyj.zytjcyj.quartzJob;

import com.cyj.zytjcyj.entity.*;
import com.cyj.zytjcyj.serviceImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@EnableScheduling
public class QuartzJobImpl {
    @Autowired
    private CardTableServiceImpl cardTableService;
    @Autowired
    private ReadRoomServiceImpl readRoomService;
    @Autowired
    private ConsumelogsServiceImpl consumelogsService;
    @Autowired
    private  StatisticsServiceImpl statisticsService;

   @Scheduled(fixedRate = 1000 * 5)
    public void consumeLogs() {
        List<String> list = new ArrayList<String>();
        list.add("teacherss");
        list.add("students");
        int a = (int) (Math.random() * list.size());
        String tableName = list.get(a);
        System.out.println("随机表名" + tableName);
        List<CardTable> cardlist = cardTableService.queryTable(tableName);
        System.out.println("随机对象集合" + cardlist);
        int cardIndex = (int) (Math.random() * cardlist.size());
        CardTable cardTable = cardlist.get(cardIndex);
        System.out.println("随机出的幸运者" + cardTable);
        List<ReadroomsEntity> readroomId = readRoomService.queryAllRoom();
        int readIndex = (int) (Math.random() * readroomId.size());
        ReadroomsEntity readroomsEntity = readroomId.get(readIndex);
        System.out.println("随机阅览室" + readroomsEntity);
        CardTable cardTableEntity = new CardTable();
        cardTableEntity.setTableName(tableName);
        cardTableEntity.setCardNo(cardTable.getCardNo());
        if (cardTable.getStatus() == null || cardTable.getStatus().equals("0")) {
            System.out.println("进入阅览室");
            cardTableEntity.setStatus(readroomsEntity.getId() + "");
            cardTableService.updateStatic(cardTableEntity);
            System.out.println("修改成功");
            //插入一刷卡记录
            ConsumelogsEntity consumelogsEntity = new ConsumelogsEntity();
            consumelogsEntity.setCardNo(Integer.parseInt(cardTableEntity.getCardNo()));
            consumelogsEntity.setReadRoomId(readroomsEntity.getId());
            consumelogsEntity.setStatus(1);
            consumelogsEntity.setInTime(new Date());
            consumelogsService.addConsumeLogs(consumelogsEntity);
            System.out.println("刷卡成功");
        } else {
            System.out.println("离开阅览室");
            cardTableEntity.setStatus("0");
            cardTableService.updateStatic(cardTableEntity);
            ConsumelogsEntity upcon = new ConsumelogsEntity();
            upcon.setOutTime(new Date());
            upcon.setCardNo(Integer.parseInt(cardTable.getCardNo()));
            consumelogsService.updateConsumeLogs(upcon);
            System.out.println("已经离开阅览室");

        }


    }
    @Scheduled(cron ="0 0 23 * * *")
    public void statisticLogs() {
           List<StatisticsEntity> list=statisticsService.queryStaticLogs();
        for (StatisticsEntity statisticsEntity : list) {
            Calendar date = Calendar.getInstance();
            String year = String.valueOf(date.get(Calendar.YEAR));
            String month = String.valueOf(date.get(Calendar.MONTH)+1);
            String day = String.valueOf(date.get(Calendar.DAY_OF_MONTH));
            statisticsEntity.setYear(year);
            statisticsEntity.setMonth(month);
            statisticsEntity.setDay(day);
            statisticsService.addStaticlogs(statisticsEntity);
            System.out.println("添加成功"+statisticsEntity);
        }
    }


}
