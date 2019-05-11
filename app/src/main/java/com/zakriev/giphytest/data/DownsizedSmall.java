
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DownsizedSmall {

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

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
        return new ToStringBuilder(this).append("width", width).append("height", height).append("mp4", mp4).append("mp4Size", mp4Size).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mp4Size).append(height).append(width).append(mp4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownsizedSmall) == false) {
            return false;
        }
        DownsizedSmall rhs = ((DownsizedSmall) other);
        return new EqualsBuilder().append(mp4Size, rhs.mp4Size).append(height, rhs.height).append(width, rhs.width).append(mp4, rhs.mp4).isEquals();
    }

}
