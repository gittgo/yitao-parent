package com.ruanmou.yt.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_product")
public class TProduct implements Serializable {
    /**
     * 商品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名称
     */
    @Column(name = "prod_name")
    private String prodName;

    /**
     * 商品简介
     */
    @Column(name = "prod_bried")
    private String prodBried;

    /**
     * 商品图片
     */
    @Column(name = "prod_image")
    private String prodImage;

    /**
     * 促销价格
     */
    @Column(name = "prime_cost")
    private BigDecimal primeCost;

    /**
     * 销售价格
     */
    @Column(name = "prod_sale")
    private BigDecimal prodSale;

    /**
     * 销量
     */
    @Column(name = "sale_count")
    private Long saleCount;

    /**
     * 库存
     */
    @Column(name = "prod_stock")
    private Long prodStock;

    /**
     * 上架状态 0-上架、1-下架
     */
    @Column(name = "shelf_status")
    private Short shelfStatus;

    /**
     * 热门商品 0 - 热门、1-不热门
     */
    @Column(name = "prod_hot")
    private Short prodHot;

    /**
     * 分类编号
     */
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "navicat_id")
    private Long navicatId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Short isDelete;

    /**
     * 商品详情
     */
    @Column(name = "prod_detail")
    private String prodDetail;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品编号
     *
     * @return id - 商品编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置商品编号
     *
     * @param id 商品编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return prod_name - 商品名称
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * 设置商品名称
     *
     * @param prodName 商品名称
     */
    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    /**
     * 获取商品简介
     *
     * @return prod_bried - 商品简介
     */
    public String getProdBried() {
        return prodBried;
    }

    /**
     * 设置商品简介
     *
     * @param prodBried 商品简介
     */
    public void setProdBried(String prodBried) {
        this.prodBried = prodBried == null ? null : prodBried.trim();
    }

    /**
     * 获取商品图片
     *
     * @return prod_image - 商品图片
     */
    public String getProdImage() {
        return prodImage;
    }

    /**
     * 设置商品图片
     *
     * @param prodImage 商品图片
     */
    public void setProdImage(String prodImage) {
        this.prodImage = prodImage == null ? null : prodImage.trim();
    }

    /**
     * 获取促销价格
     *
     * @return prime_cost - 促销价格
     */
    public BigDecimal getPrimeCost() {
        return primeCost;
    }

    /**
     * 设置促销价格
     *
     * @param primeCost 促销价格
     */
    public void setPrimeCost(BigDecimal primeCost) {
        this.primeCost = primeCost;
    }

    /**
     * 获取销售价格
     *
     * @return prod_sale - 销售价格
     */
    public BigDecimal getProdSale() {
        return prodSale;
    }

    /**
     * 设置销售价格
     *
     * @param prodSale 销售价格
     */
    public void setProdSale(BigDecimal prodSale) {
        this.prodSale = prodSale;
    }

    /**
     * 获取销量
     *
     * @return sale_count - 销量
     */
    public Long getSaleCount() {
        return saleCount;
    }

    /**
     * 设置销量
     *
     * @param saleCount 销量
     */
    public void setSaleCount(Long saleCount) {
        this.saleCount = saleCount;
    }

    /**
     * 获取库存
     *
     * @return prod_stock - 库存
     */
    public Long getProdStock() {
        return prodStock;
    }

    /**
     * 设置库存
     *
     * @param prodStock 库存
     */
    public void setProdStock(Long prodStock) {
        this.prodStock = prodStock;
    }

    /**
     * 获取上架状态 0-上架、1-下架
     *
     * @return shelf_status - 上架状态 0-上架、1-下架
     */
    public Short getShelfStatus() {
        return shelfStatus;
    }

    /**
     * 设置上架状态 0-上架、1-下架
     *
     * @param shelfStatus 上架状态 0-上架、1-下架
     */
    public void setShelfStatus(Short shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    /**
     * 获取热门商品 0 - 热门、1-不热门
     *
     * @return prod_hot - 热门商品 0 - 热门、1-不热门
     */
    public Short getProdHot() {
        return prodHot;
    }

    /**
     * 设置热门商品 0 - 热门、1-不热门
     *
     * @param prodHot 热门商品 0 - 热门、1-不热门
     */
    public void setProdHot(Short prodHot) {
        this.prodHot = prodHot;
    }

    /**
     * 获取分类编号
     *
     * @return category_id - 分类编号
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类编号
     *
     * @param categoryId 分类编号
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return brand_id
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * @param brandId
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * @return navicat_id
     */
    public Long getNavicatId() {
        return navicatId;
    }

    /**
     * @param navicatId
     */
    public void setNavicatId(Long navicatId) {
        this.navicatId = navicatId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取商品详情
     *
     * @return prod_detail - 商品详情
     */
    public String getProdDetail() {
        return prodDetail;
    }

    /**
     * 设置商品详情
     *
     * @param prodDetail 商品详情
     */
    public void setProdDetail(String prodDetail) {
        this.prodDetail = prodDetail == null ? null : prodDetail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prodName=").append(prodName);
        sb.append(", prodBried=").append(prodBried);
        sb.append(", prodImage=").append(prodImage);
        sb.append(", primeCost=").append(primeCost);
        sb.append(", prodSale=").append(prodSale);
        sb.append(", saleCount=").append(saleCount);
        sb.append(", prodStock=").append(prodStock);
        sb.append(", shelfStatus=").append(shelfStatus);
        sb.append(", prodHot=").append(prodHot);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", brandId=").append(brandId);
        sb.append(", navicatId=").append(navicatId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", prodDetail=").append(prodDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}