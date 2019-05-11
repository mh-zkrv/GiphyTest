
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Onclick {

    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Onclick) == false) {
            return false;
        }
        Onclick rhs = ((Onclick) other);
        return new EqualsBuilder().append(url, rhs.url).isEquals();
    }

}
