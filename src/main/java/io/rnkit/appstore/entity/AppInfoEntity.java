package io.rnkit.appstore.entity;

import java.util.List;

/**
 * Name: AppInfoEntity
 * Author: SimMan [liwei0990@gmail.com]
 * CreatedAt: 01/09/2017
 * Description:
 * Copyright (c) 2017 Toutoo, Inc.
 */
public class AppInfoEntity {

    /**
     * 应用ID
     */
    private Long trackId;

    /**
     * 应用名称
     */
    private String trackName;

    /**
     * 包名
     */
    private String bundleId;

    /**
     * 当前最新版本号
     */
    private String version;

    /**
     * 文件大小
     */
    private Long fileSizeBytes;

    /**
     * 当前版本的发布时间
     */
    private String currentVersionReleaseDate;

    /**
     * 更新描述
     */
    private String releaseNotes;

    /**
     * 应用简介
     */
    private String description;

    /**
     * 是否支持游戏中心
     */
    private Boolean isGameCenterEnabled;

    /**
     * iPad屏幕URL地址数组
     */
    private List<String> ipadScreenshotUrls;

    /**
     * appleTV屏幕URL地址
     */
    private List<String> appletvScreenshotUrls;

    /**
     * 拥有者ID
     */
    private String artistId;

    /**
     * 拥有者名称
     */
    private String artistName;
    /**
     * 拥有者APP Store介绍页面
     */
    private String artistViewUrl;

    /**
     * 小图标
     */
    private String artworkUrl60;

    /**
     * 中图标
     */
    private String artworkUrl100;

    /**
     * 大图标
     */
    private String artworkUrl512;

    /**
     * 种类
     * eg: software
     */
    private String kind;

    /**
     * 特性
     */
    private List<String> features;

    /**
     * 支持的设备
     */
    private List<String> supportedDevices;

    /**
     * 屏幕图片地址
     */
    private List<String> screenshotUrls;

    private List<String> advisories;

    private Double averageUserRatingForCurrentVersion;

    /**
     * 语言编码
     */
    private List<String> languageCodesISO2A;

    /**
     * 网站
     */
    private String sellerUrl;

    private Double userRatingCountForCurrentVersion;

    /**
     * 年龄限制
     */
    private String trackContentRating;

    private String trackCensoredName;

    /**
     * 详情地址
     */
    private String trackViewUrl;

    private String contentAdvisoryRating;

    private String currency;

    private String wrapperType;

    private List<String> genres;

    /**
     * 销售价格
     */
    private Double price;

    private Boolean isVppDeviceBasedLicensingEnabled;

    private String primaryGenreName;

    /**
     * 发布时间
     */
    private String releaseDate;

    private String formattedPrice;

    /**
     * 支持的最小系统版本
     */
    private String minimumOsVersion;

    private Integer primaryGenreId;

    private String sellerName;

    private List<Integer> genreIds;

    private Double averageUserRating;

    private Double userRatingCount;

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public String getCurrentVersionReleaseDate() {
        return currentVersionReleaseDate;
    }

    public void setCurrentVersionReleaseDate(String currentVersionReleaseDate) {
        this.currentVersionReleaseDate = currentVersionReleaseDate;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getGameCenterEnabled() {
        return isGameCenterEnabled;
    }

    public void setGameCenterEnabled(Boolean gameCenterEnabled) {
        isGameCenterEnabled = gameCenterEnabled;
    }

    public List<String> getIpadScreenshotUrls() {
        return ipadScreenshotUrls;
    }

    public void setIpadScreenshotUrls(List<String> ipadScreenshotUrls) {
        this.ipadScreenshotUrls = ipadScreenshotUrls;
    }

    public List<String> getAppletvScreenshotUrls() {
        return appletvScreenshotUrls;
    }

    public void setAppletvScreenshotUrls(List<String> appletvScreenshotUrls) {
        this.appletvScreenshotUrls = appletvScreenshotUrls;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getArtworkUrl512() {
        return artworkUrl512;
    }

    public void setArtworkUrl512(String artworkUrl512) {
        this.artworkUrl512 = artworkUrl512;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public List<String> getSupportedDevices() {
        return supportedDevices;
    }

    public void setSupportedDevices(List<String> supportedDevices) {
        this.supportedDevices = supportedDevices;
    }

    public List<String> getScreenshotUrls() {
        return screenshotUrls;
    }

    public void setScreenshotUrls(List<String> screenshotUrls) {
        this.screenshotUrls = screenshotUrls;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public void setAdvisories(List<String> advisories) {
        this.advisories = advisories;
    }

    public Double getAverageUserRatingForCurrentVersion() {
        return averageUserRatingForCurrentVersion;
    }

    public void setAverageUserRatingForCurrentVersion(Double averageUserRatingForCurrentVersion) {
        this.averageUserRatingForCurrentVersion = averageUserRatingForCurrentVersion;
    }

    public List<String> getLanguageCodesISO2A() {
        return languageCodesISO2A;
    }

    public void setLanguageCodesISO2A(List<String> languageCodesISO2A) {
        this.languageCodesISO2A = languageCodesISO2A;
    }

    public String getSellerUrl() {
        return sellerUrl;
    }

    public void setSellerUrl(String sellerUrl) {
        this.sellerUrl = sellerUrl;
    }

    public Double getUserRatingCountForCurrentVersion() {
        return userRatingCountForCurrentVersion;
    }

    public void setUserRatingCountForCurrentVersion(Double userRatingCountForCurrentVersion) {
        this.userRatingCountForCurrentVersion = userRatingCountForCurrentVersion;
    }

    public String getTrackContentRating() {
        return trackContentRating;
    }

    public void setTrackContentRating(String trackContentRating) {
        this.trackContentRating = trackContentRating;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getVppDeviceBasedLicensingEnabled() {
        return isVppDeviceBasedLicensingEnabled;
    }

    public void setVppDeviceBasedLicensingEnabled(Boolean vppDeviceBasedLicensingEnabled) {
        isVppDeviceBasedLicensingEnabled = vppDeviceBasedLicensingEnabled;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public String getMinimumOsVersion() {
        return minimumOsVersion;
    }

    public void setMinimumOsVersion(String minimumOsVersion) {
        this.minimumOsVersion = minimumOsVersion;
    }

    public Integer getPrimaryGenreId() {
        return primaryGenreId;
    }

    public void setPrimaryGenreId(Integer primaryGenreId) {
        this.primaryGenreId = primaryGenreId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Double getAverageUserRating() {
        return averageUserRating;
    }

    public void setAverageUserRating(Double averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public Double getUserRatingCount() {
        return userRatingCount;
    }

    public void setUserRatingCount(Double userRatingCount) {
        this.userRatingCount = userRatingCount;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", bundleId='" + bundleId + '\'' +
                ", version='" + version + '\'' +
                ", fileSizeBytes=" + fileSizeBytes +
                ", currentVersionReleaseDate='" + currentVersionReleaseDate + '\'' +
                ", releaseNotes='" + releaseNotes + '\'' +
                ", description='" + description + '\'' +
                ", isGameCenterEnabled=" + isGameCenterEnabled +
                ", ipadScreenshotUrls=" + ipadScreenshotUrls +
                ", appletvScreenshotUrls=" + appletvScreenshotUrls +
                ", artistId='" + artistId + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artistViewUrl='" + artistViewUrl + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", artworkUrl512='" + artworkUrl512 + '\'' +
                ", kind='" + kind + '\'' +
                ", features=" + features +
                ", supportedDevices=" + supportedDevices +
                ", screenshotUrls=" + screenshotUrls +
                ", advisories=" + advisories +
                ", averageUserRatingForCurrentVersion=" + averageUserRatingForCurrentVersion +
                ", languageCodesISO2A=" + languageCodesISO2A +
                ", sellerUrl='" + sellerUrl + '\'' +
                ", userRatingCountForCurrentVersion=" + userRatingCountForCurrentVersion +
                ", trackContentRating='" + trackContentRating + '\'' +
                ", trackCensoredName='" + trackCensoredName + '\'' +
                ", trackViewUrl='" + trackViewUrl + '\'' +
                ", contentAdvisoryRating='" + contentAdvisoryRating + '\'' +
                ", currency='" + currency + '\'' +
                ", wrapperType='" + wrapperType + '\'' +
                ", genres=" + genres +
                ", price=" + price +
                ", isVppDeviceBasedLicensingEnabled=" + isVppDeviceBasedLicensingEnabled +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", formattedPrice='" + formattedPrice + '\'' +
                ", minimumOsVersion='" + minimumOsVersion + '\'' +
                ", primaryGenreId=" + primaryGenreId +
                ", sellerName='" + sellerName + '\'' +
                ", genreIds=" + genreIds +
                ", averageUserRating=" + averageUserRating +
                ", userRatingCount=" + userRatingCount +
                '}';
    }
}
