package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "striking", schema = "safuri_schema", catalog = "")
public class StrikingEntity {
    private int strikingId;
    private String paperboardType;
    private String size;
    private int impositionNumber;
    private String throughNumber;
    private int basicCost;
    private BigDecimal throughWage;
    private Timestamp updatedDate;

    @Id
    @Column(name = "strikingID")
    public int getStrikingId() {
        return strikingId;
    }

    public void setStrikingId(int strikingId) {
        this.strikingId = strikingId;
    }

    @Basic
    @Column(name = "paperboardType")
    public String getPaperboardType() {
        return paperboardType;
    }

    public void setPaperboardType(String paperboardType) {
        this.paperboardType = paperboardType;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "impositionNumber")
    public int getImpositionNumber() {
        return impositionNumber;
    }

    public void setImpositionNumber(int impositionNumber) {
        this.impositionNumber = impositionNumber;
    }

    @Basic
    @Column(name = "throughNumber")
    public String getThroughNumber() {
        return throughNumber;
    }

    public void setThroughNumber(String throughNumber) {
        this.throughNumber = throughNumber;
    }

    @Basic
    @Column(name = "basicCost")
    public int getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(int basicCost) {
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

        StrikingEntity that = (StrikingEntity) o;

        if (strikingId != that.strikingId) return false;
        if (impositionNumber != that.impositionNumber) return false;
        if (basicCost != that.basicCost) return false;
        if (paperboardType != null ? !paperboardType.equals(that.paperboardType) : that.paperboardType != null)
            return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (throughNumber != null ? !throughNumber.equals(that.throughNumber) : that.throughNumber != null)
            return false;
        if (throughWage != null ? !throughWage.equals(that.throughWage) : that.throughWage != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = strikingId;
        result = 31 * result + (paperboardType != null ? paperboardType.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + impositionNumber;
        result = 31 * result + (throughNumber != null ? throughNumber.hashCode() : 0);
        result = 31 * result + basicCost;
        result = 31 * result + (throughWage != null ? throughWage.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
