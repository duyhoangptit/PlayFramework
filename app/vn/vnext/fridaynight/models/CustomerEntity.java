package vn.vnext.fridaynight.models;

import javax.persistence.*;

/**
 * Created by VuPT on 8/31/2016.
 */
@Entity
@Table(name = "customer", schema = "safuri_schema", catalog = "")
public class CustomerEntity {
    private int customerId;
    private String name;

    @Id
    @Column(name = "customerID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != that.customerId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
