package shaliang.feihu.entity;

import java.io.Serializable;
import java.util.Date;

public class UserProductRelation implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Date beginDate;

    private Date endDate;

    private Double currentIntegral;

    private Integer level;

    private Integer isUsed;

    private Integer orderId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getCurrentIntegral() {
        return currentIntegral;
    }

    public void setCurrentIntegral(Double currentIntegral) {
        this.currentIntegral = currentIntegral;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}