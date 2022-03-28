package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 工作人员职位表，后期扩展
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T12对象", description="工作人员职位表，后期扩展")
public class T12 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "职位ID")
    @TableId(value = "F1201", type = IdType.AUTO)
    private String F1201;

    @ApiModelProperty(value = "职位等级（管理员：1、工作人员：2、普通用户：3，等）")
    private String F1202;

    @ApiModelProperty(value = "职位的名称")
    private String F1203;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F1230;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F1231;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F1232;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F1233;

    public String getF1201() {
        return F1201;
    }

    public void setF1201(String F1201) {
        this.F1201 = F1201;
    }
    public String getF1202() {
        return F1202;
    }

    public void setF1202(String F1202) {
        this.F1202 = F1202;
    }
    public String getF1203() {
        return F1203;
    }

    public void setF1203(String F1203) {
        this.F1203 = F1203;
    }
    public LocalDateTime getF1230() {
        return F1230;
    }

    public void setF1230(LocalDateTime F1230) {
        this.F1230 = F1230;
    }
    public LocalDateTime getF1231() {
        return F1231;
    }

    public void setF1231(LocalDateTime F1231) {
        this.F1231 = F1231;
    }
    public String getF1232() {
        return F1232;
    }

    public void setF1232(String F1232) {
        this.F1232 = F1232;
    }
    public String getF1233() {
        return F1233;
    }

    public void setF1233(String F1233) {
        this.F1233 = F1233;
    }

    @Override
    public String toString() {
        return "T12{" +
            "F1201=" + F1201 +
            ", F1202=" + F1202 +
            ", F1203=" + F1203 +
            ", F1230=" + F1230 +
            ", F1231=" + F1231 +
            ", F1232=" + F1232 +
            ", F1233=" + F1233 +
        "}";
    }
}
