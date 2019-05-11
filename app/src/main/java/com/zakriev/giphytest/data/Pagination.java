
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Pagination {

    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("offset")
    @Expose
    private Integer offset;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalCount", totalCount).append("count", count).append("offset", offset).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(totalCount).append(offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pagination) == false) {
            return false;
        }
        Pagination rhs = ((Pagination) other);
        return new EqualsBuilder().append(count, rhs.count).append(totalCount, rhs.totalCount).append(offset, rhs.offset).isEquals();
    }

}
