package com.example.server.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Collection;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 * 包含全部用户的表
 * </p>
 *
 * @author xx
 * @since 2022-03-22
 */
@ApiModel(value="T01对象", description="包含全部用户的表")
public class T01 implements Serializable , UserDetails {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    @JsonProperty("F0101")
    private String F0101;


    @ApiModelProperty(value = "用户职位ID")
    private String F1201;

    @ApiModelProperty(value = "用户真实姓名")

    private String F0102;

    @ApiModelProperty(value = "用户的微信名")

    private String F0103;

    @ApiModelProperty(value = "用户唯一识别ID")
    private String F0104;

    @ApiModelProperty(value = "用户微信头像URL")
    private String F0105;

    @ApiModelProperty(value = "用户手机号")
    private String F0106;

    @ApiModelProperty(value = "用户PC端登录名，仅限管理员")
    private String username;

    @ApiModelProperty(value = "用户PC端登录密码，仅限管理员")
    private String password;

    @ApiModelProperty(value = "最后一次修改表数据的时间")
    private LocalDateTime F0130;

    @ApiModelProperty(value = "第一次创建表的时间")
    private LocalDateTime F0131;

    @ApiModelProperty(value = "用于伪删除的标记")
    private String F0132;

    @ApiModelProperty(value = "用于备注特殊情况")
    private String F0133;

    @ApiModelProperty(value = "是否启用")
    @Getter(AccessLevel.NONE)
    private Boolean enabled;

    public String getF0101() {
        return F0101;
    }

    public void setF0101(String F0101) {
        this.F0101 = F0101;
    }
    public String getF1201() {
        return F1201;
    }

    public void setF1201(String F1201) {
        this.F1201 = F1201;
    }
    public String getF0102() {
        return F0102;
    }

    public void setF0102(String F0102) {
        this.F0102 = F0102;
    }
    public String getF0103() {
        return F0103;
    }

    public void setF0103(String F0103) {
        this.F0103 = F0103;
    }
    public String getF0104() {
        return F0104;
    }

    public void setF0104(String F0104) {
        this.F0104 = F0104;
    }
    public String getF0105() {
        return F0105;
    }

    public void setF0105(String F0105) {
        this.F0105 = F0105;
    }
    public String getF0106() {
        return F0106;
    }

    public void setF0106(String F0106) {
        this.F0106 = F0106;
    }
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getF0130() {
        return F0130;
    }

    public void setF0130(LocalDateTime F0130) {
        this.F0130 = F0130;
    }
    public LocalDateTime getF0131() {
        return F0131;
    }

    public void setF0131(LocalDateTime F0131) {
        this.F0131 = F0131;
    }
    public String getF0132() {
        return F0132;
    }

    public void setF0132(String F0132) {
        this.F0132 = F0132;
    }
    public String getF0133() {
        return F0133;
    }

    public void setF0133(String F0133) {
        this.F0133 = F0133;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "T01{" +
            "F0101=" + F0101 +
            ", F1201=" + F1201 +
            ", F0102=" + F0102 +
            ", F0103=" + F0103 +
            ", F0104=" + F0104 +
            ", F0105=" + F0105 +
            ", F0106=" + F0106 +
            ", username=" + username +
            ", password=" + password +
            ", F0130=" + F0130 +
            ", F0131=" + F0131 +
            ", F0132=" + F0132 +
            ", F0133=" + F0133 +
            ", enabled=" + enabled +
        "}";
    }
}
