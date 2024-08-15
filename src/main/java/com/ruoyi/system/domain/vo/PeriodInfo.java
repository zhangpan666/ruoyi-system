package com.ruoyi.system.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class PeriodInfo implements Serializable {

    private Integer year;

    private Integer period;

    private String issueNo;

}
