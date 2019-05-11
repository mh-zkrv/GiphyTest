
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Analytics {

    @SerializedName("onload")
    @Expose
    private Onload onload;
    @SerializedName("onclick")
    @Expose
    private Onclick onclick;
    @SerializedName("onsent")
    @Expose
    private Onsent onsent;

    public Onload getOnload() {
        return onload;
    }

    public void setOnload(Onload onload) {
        this.onload = onload;
    }

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    public Onsent getOnsent() {
        return onsent;
    }

    public void setOnsent(Onsent onsent) {
        this.onsent = onsent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onload", onload).append("onclick", onclick).append("onsent", onsent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onload).append(onsent).append(onclick).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Analytics) == false) {
            return false;
        }
        Analytics rhs = ((Analytics) other);
        return new EqualsBuilder().append(onload, rhs.onload).append(onsent, rhs.onsent).append(onclick, rhs.onclick).isEquals();
    }

}
