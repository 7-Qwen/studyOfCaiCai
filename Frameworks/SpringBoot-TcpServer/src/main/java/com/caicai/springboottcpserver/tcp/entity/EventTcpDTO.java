package com.caicai.springboottcpserver.tcp.entity;

import lombok.Data;

/**
 * @author: 菜菜的后端私房菜
 * @create: 2024/8/15 17:07
 * @description: 事件上报
 */
@Data
public class EventTcpDTO extends BaseTcpDTO{

    // 设备类型，用于标识设备的类别
    // 3烟雾
    private byte deviceType;

    // 事件类型 1心跳
    private byte eventType;

    // 设备编号，用于唯一标识设备
    private String deviceId;

    // IMSI，国际移动用户识别码
    private String imsi;

    // ICCID，集成电路卡识别码
    private String iccid;

    // 电池电压，设备电池的当前电压 0.1V单位
    private String batteryVoltage;

    // CSQ信号强度，信号质量指标
    private byte csq;

    // 电池电量，电池剩余电量百分比
    private String batteryLevel;

    // 程序版本，设备上运行软件的版本
    private String softwareVersion;
}
