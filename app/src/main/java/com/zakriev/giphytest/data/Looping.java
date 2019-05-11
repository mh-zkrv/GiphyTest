
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Looping {

    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mp4", mp4).append("mp4Size", mp4Size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mp4Size).append(mp4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Looping) == false) {
            return false;
        }
        Looping rhs = ((Looping) other);
        return new EqualsBuilder().append(mp4Size, rhs.mp4Size).append(mp4, rhs.mp4).isEquals();
    }

}
