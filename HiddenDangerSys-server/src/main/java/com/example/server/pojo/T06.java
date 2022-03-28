package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用于区域划分

 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T06对象", description="用于区域划分")
public class T06 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域ID")
    @TableId(value = "F0601", type = IdType.AUTO)
    private String F0601;

    @ApiModelProperty(value = "区域名称")
    private String F0602;

    @ApiModelProperty(value = "GPS坐标")
    private String F0603;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0630;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0631;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0632;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0633;

    public String getF0601() {
        return F0601;
    }

    public void setF0601(String F0601) {
        this.F0601 = F0601;
    }
    public String getF0602() {
        return F0602;
    }

    public void setF0602(String F0602) {
        this.F0602 = F0602;
    }
    public String getF0603() {
        return F0603;
    }

    public void setF0603(String F0603) {
        this.F0603 = F0603;
    }
    public LocalDateTime getF0630() {
        return F0630;
    }

    public void setF0630(LocalDateTime F0630) {
        this.F0630 = F0630;
    }
    public LocalDateTime getF0631() {
        return F0631;
    }

    public void setF0631(LocalDateTime F0631) {
        this.F0631 = F0631;
    }
    public String getF0632() {
        return F0632;
    }

    public void setF0632(String F0632) {
        this.F0632 = F0632;
    }
    public String getF0633() {
        return F0633;
    }

    public void setF0633(String F0633) {
        this.F0633 = F0633;
    }

    @Override
    public String toString() {
        return "T06{" +
            "F0601=" + F0601 +
            ", F0602=" + F0602 +
            ", F0603=" + F0603 +
            ", F0630=" + F0630 +
            ", F0631=" + F0631 +
            ", F0632=" + F0632 +
            ", F0633=" + F0633 +
        "}";
    }
}
