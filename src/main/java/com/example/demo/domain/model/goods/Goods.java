package com.example.demo.domain.model.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    private Long id;

    private Date createTime;

    private Date lastUpdateTeim;

    private String name;

    private BigDecimal price;

    private String icon;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTeim() {
        return lastUpdateTeim;
    }

    public void setLastUpdateTeim(Date lastUpdateTeim) {
        this.lastUpdateTeim = lastUpdateTeim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateTeim=").append(lastUpdateTeim);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", icon=").append(icon);
        sb.append("]");
        return sb.toString();
    }
}