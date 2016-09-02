package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "packing", schema = "safuri_schema", catalog = "")
public class PackingEntity {
    private int packingId;
    private String method;
    private String lot;
    private BigDecimal percent;
    private Timestamp updatedDate;

    @Id
    @Column(name = "packingID")
    public int getPackingId() {
        return packingId;
    }

    public void setPackingId(int packingId) {
        this.packingId = packingId;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "lot")
    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    @Basic
    @Column(name = "percent")
    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
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

        PackingEntity that = (PackingEntity) o;

        if (packingId != that.packingId) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (lot != null ? !lot.equals(that.lot) : that.lot != null) return false;
        if (percent != null ? !percent.equals(that.percent) : that.percent != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packingId;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (lot != null ? lot.hashCode() : 0);
        result = 31 * result + (percent != null ? percent.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
