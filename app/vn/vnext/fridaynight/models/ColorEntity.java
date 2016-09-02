package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "color", schema = "safuri_schema", catalog = "")
public class ColorEntity {
    private int colorId;
    private Integer basicCost;
    private BigDecimal throughWage;
    private Integer costPerPacket;
    private Integer throughWageBranch;
    private Timestamp updatedDate;

    @Id
    @Column(name = "colorID")
    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    @Basic
    @Column(name = "basicCost")
    public Integer getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(Integer basicCost) {
        this.basicCost = basicCost;
    }

    @Basic
    @Column(name = "throughWage")
    public BigDecimal getThroughWage() {
        return throughWage;
    }

    public void setThroughWage(BigDecimal throughWage) {
        this.throughWage = throughWage;
    }

    @Basic
    @Column(name = "costPerPacket")
    public Integer getCostPerPacket() {
        return costPerPacket;
    }

    public void setCostPerPacket(Integer costPerPacket) {
        this.costPerPacket = costPerPacket;
    }

    @Basic
    @Column(name = "throughWageBranch")
    public Integer getThroughWageBranch() {
        return throughWageBranch;
    }

    public void setThroughWageBranch(Integer throughWageBranch) {
        this.throughWageBranch = throughWageBranch;
    }

    @Basic
    @Column(name = "updatedDate")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColorEntity that = (ColorEntity) o;

        if (colorId != that.colorId) return false;
        if (basicCost != null ? !basicCost.equals(that.basicCost) : that.basicCost != null) return false;
        if (throughWage != null ? !throughWage.equals(that.throughWage) : that.throughWage != null) return false;
        if (costPerPacket != null ? !costPerPacket.equals(that.costPerPacket) : that.costPerPacket != null)
            return false;
        if (throughWageBranch != null ? !throughWageBranch.equals(that.throughWageBranch) : that.throughWageBranch != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = colorId;
        result = 31 * result + (basicCost != null ? basicCost.hashCode() : 0);
        result = 31 * result + (throughWage != null ? throughWage.hashCode() : 0);
        result = 31 * result + (costPerPacket != null ? costPerPacket.hashCode() : 0);
        result = 31 * result + (throughWageBranch != null ? throughWageBranch.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
