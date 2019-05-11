
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FixedHeightSmall {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).append("size", size).append("mp4", mp4).append("mp4Size", mp4Size).append("webp", webp).append("webpSize", webpSize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(webpSize).append(webp).append(mp4Size).append(height).append(width).append(mp4).append(url).append(size).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedHeightSmall) == false) {
            return false;
        }
        FixedHeightSmall rhs = ((FixedHeightSmall) other);
        return new EqualsBuilder().append(webpSize, rhs.webpSize).append(webp, rhs.webp).append(mp4Size, rhs.mp4Size).append(height, rhs.height).append(width, rhs.width).append(mp4, rhs.mp4).append(url, rhs.url).append(size, rhs.size).isEquals();
    }

}
