package vn.vnext.fridaynight.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "paper", schema = "safuri_schema", catalog = "")
public class PaperEntity {
    private int paperId;
    private String name;
    private int basicWeight;
    private int normValue;
    private Timestamp updatedDate;

    @Id
    @Column(name = "paperID")
    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "basicWeight")
    public int getBasicWeight() {
        return basicWeight;
    }

    public void setBasicWeight(int basicWeight) {
        this.basicWeight = basicWeight;
    }

    @Basic
    @Column(name = "normValue")
    public int getNormValue() {
        return normValue;
    }

    public void setNormValue(int normValue) {
        this.normValue = normValue;
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

        PaperEntity that = (PaperEntity) o;

        if (paperId != that.paperId) return false;
        if (basicWeight != that.basicWeight) return false;
        if (normValue != that.normValue) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paperId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + basicWeight;
        result = 31 * result + normValue;
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
