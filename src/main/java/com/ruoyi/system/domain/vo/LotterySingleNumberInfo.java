package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@ApiModel(description = "单个开奖数字信息")
@Data
@Accessors(chain = true)
public class LotterySingleNumberInfo implements Serializable {

    private static final long serialVersionUID = 6054291740919340242L;

    @ApiModelProperty(example = "数字")
    private String number;

    @ApiModelProperty(example = "生肖")
    private String shengXiao;

    @ApiModelProperty(example = "五行")
    private String wuXing;

    @ApiModelProperty(example = "颜色(1-红色，2-蓝色，3-绿色)")
    private Byte color;

    @ApiModelProperty(example = "大小")
    private String daXiao;

    @ApiModelProperty(example = "单双")
    private String danShuang;

    @ApiModelProperty(example = "特码，1-是，0-否")
    private Byte specialNumber;

    @ApiModelProperty(example = "动物彩选手名称")
    private String playerName;

    @ApiModelProperty(example = "动物彩选手字母编号")
    private String playerLetterNumber;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


}
