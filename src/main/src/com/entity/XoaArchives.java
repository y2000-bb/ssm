package com.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class XoaArchives implements Serializable {


    private String id;
    /**
     * 姓名
     */

    private java.lang.String name;
    /**
     * 曾用名
     */

    private String nameUsed;
    /**
     * 身份证号
    private java.lang.String idNumber;


    private java.lang.String partyPositionIds;


    private java.lang.String trainingInformation;

    /*
     *  选中的力量编程
     * */
    private String armyUnitIds;


    private String dutyNames;
}
