package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 详细记录隐患及相关信息
 * </p>
 *
 * @author xx
 * @since 2022-03-21
 */
@ApiModel(value="T02对象", description="详细记录隐患及相关信息")
public class T02 implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "隐患ID")
    @TableId(value = "F0201", type = IdType.AUTO)
    private String F0201;

    @ApiModelProperty(value = "上报隐患时，上报人ID")
    private String F0101;

    @ApiModelProperty(value = "上报隐患时，隐患类型ID")
    private String F0301;

    @ApiModelProperty(value = "上报隐患时，隐患等级ID")
    private String F0401;

    @ApiModelProperty(value = "上报隐患时，媒体ID")
    private String F0501;

    @ApiModelProperty(value = "上报隐患时，描述文字")
    private String F0203;

    @ApiModelProperty(value = "上报隐患时，上报时间")
    private LocalDateTime F0204;

    @ApiModelProperty(value = "上报隐患时，隐患位置（GPS）")
    private String F0205;

    @ApiModelProperty(value = "上报隐患时，隐患位置（用户自选区域）")
    private String F0206;

    @ApiModelProperty(value = "上报隐患时，隐患位置（用户详细描述）")
    private String F0207;

    @ApiModelProperty(value = "上报隐患后，排查人员处理隐患的状态")
    private String F0208;

    @ApiModelProperty(value = "上报隐患后，各状态下是否需要通知")
    private String F0209;

    @ApiModelProperty(value = "排查隐患时，处理人ID")
    private String F0210;

    @ApiModelProperty(value = "排查隐患时，处理时间")
    private LocalDateTime F0211;

    @ApiModelProperty(value = "排查隐患时，对意外情况的描述")
    private byte[] F0212;

    @ApiModelProperty(value = "排查隐患时，处理人对处理隐患的描述")
    private String F0213;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0230;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0231;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0232;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0233;

    public String getF0201() {
        return F0201;
    }

    public void setF0201(String F0201) {
        this.F0201 = F0201;
    }
    public String getF0101() {
        return F0101;
    }

    public void setF0101(String F0101) {
        this.F0101 = F0101;
    }
    public String getF0301() {
        return F0301;
    }

    public void setF0301(String F0301) {
        this.F0301 = F0301;
    }
    public String getF0401() {
        return F0401;
    }

    public void setF0401(String F0401) {
        this.F0401 = F0401;
    }
    public String getF0501() {
        return F0501;
    }

    public void setF0501(String F0501) {
        this.F0501 = F0501;
    }
    public String getF0203() {
        return F0203;
    }

    public void setF0203(String F0203) {
        this.F0203 = F0203;
    }
    public LocalDateTime getF0204() {
        return F0204;
    }

    public void setF0204(LocalDateTime F0204) {
        this.F0204 = F0204;
    }
    public String getF0205() {
        return F0205;
    }

    public void setF0205(String F0205) {
        this.F0205 = F0205;
    }
    public String getF0206() {
        return F0206;
    }

    public void setF0206(String F0206) {
        this.F0206 = F0206;
    }
    public String getF0207() {
        return F0207;
    }

    public void setF0207(String F0207) {
        this.F0207 = F0207;
    }
    public String getF0208() {
        return F0208;
    }

    public void setF0208(String F0208) {
        this.F0208 = F0208;
    }
    public String getF0209() {
        return F0209;
    }

    public void setF0209(String F0209) {
        this.F0209 = F0209;
    }
    public String getF0210() {
        return F0210;
    }

    public void setF0210(String F0210) {
        this.F0210 = F0210;
    }
    public LocalDateTime getF0211() {
        return F0211;
    }

    public void setF0211(LocalDateTime F0211) {
        this.F0211 = F0211;
    }
    public byte[] getF0212() {
        return F0212;
    }

    public void setF0212(byte[] F0212) {
        this.F0212 = F0212;
    }
    public String getF0213() {
        return F0213;
    }

    public void setF0213(String F0213) {
        this.F0213 = F0213;
    }
    public LocalDateTime getF0230() {
        return F0230;
    }

    public void setF0230(LocalDateTime F0230) {
        this.F0230 = F0230;
    }
    public LocalDateTime getF0231() {
        return F0231;
    }

    public void setF0231(LocalDateTime F0231) {
        this.F0231 = F0231;
    }
    public String getF0232() {
        return F0232;
    }

    public void setF0232(String F0232) {
        this.F0232 = F0232;
    }
    public String getF0233() {
        return F0233;
    }

    public void setF0233(String F0233) {
        this.F0233 = F0233;
    }

    @Override
    public String toString() {
        return "T02{" +
            "F0201=" + F0201 +
            ", F0101=" + F0101 +
            ", F0301=" + F0301 +
            ", F0401=" + F0401 +
            ", F0501=" + F0501 +
            ", F0203=" + F0203 +
            ", F0204=" + F0204 +
            ", F0205=" + F0205 +
            ", F0206=" + F0206 +
            ", F0207=" + F0207 +
            ", F0208=" + F0208 +
            ", F0209=" + F0209 +
            ", F0210=" + F0210 +
            ", F0211=" + F0211 +
            ", F0212=" + F0212 +
            ", F0213=" + F0213 +
            ", F0230=" + F0230 +
            ", F0231=" + F0231 +
            ", F0232=" + F0232 +
            ", F0233=" + F0233 +
        "}";
    }
}
