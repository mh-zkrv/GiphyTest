
package com.zakriev.giphytest.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Gif {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("is_sticker")
    @Expose
    private Integer isSticker;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("analytics")
    @Expose
    private Analytics analytics;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    public String getBitlyUrl() {
        return bitlyUrl;
    }

    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getSourceTld() {
        return sourceTld;
    }

    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    public Integer getIsSticker() {
        return isSticker;
    }

    public void setIsSticker(Integer isSticker) {
        this.isSticker = isSticker;
    }

    public String getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Analytics getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("slug", slug).append("url", url).append("bitlyGifUrl", bitlyGifUrl).append("bitlyUrl", bitlyUrl).append("embedUrl", embedUrl).append("username", username).append("source", source).append("rating", rating).append("contentUrl", contentUrl).append("sourceTld", sourceTld).append("sourcePostUrl", sourcePostUrl).append("isSticker", isSticker).append("importDatetime", importDatetime).append("trendingDatetime", trendingDatetime).append("images", images).append("title", title).append("analytics", analytics).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(importDatetime).append(bitlyGifUrl).append(contentUrl).append(embedUrl).append(sourceTld).append(type).append(analytics).append(trendingDatetime).append(url).append(isSticker).append(bitlyUrl).append(id).append(title).append(username).append(source).append(sourcePostUrl).append(images).append(slug).append(rating).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gif) == false) {
            return false;
        }
        Gif rhs = ((Gif) other);
        return new EqualsBuilder().append(importDatetime, rhs.importDatetime).append(bitlyGifUrl, rhs.bitlyGifUrl).append(contentUrl, rhs.contentUrl).append(embedUrl, rhs.embedUrl).append(sourceTld, rhs.sourceTld).append(type, rhs.type).append(analytics, rhs.analytics).append(trendingDatetime, rhs.trendingDatetime).append(url, rhs.url).append(isSticker, rhs.isSticker).append(bitlyUrl, rhs.bitlyUrl).append(id, rhs.id).append(title, rhs.title).append(username, rhs.username).append(source, rhs.source).append(sourcePostUrl, rhs.sourcePostUrl).append(images, rhs.images).append(slug, rhs.slug).append(rating, rhs.rating).isEquals();
    }

}
