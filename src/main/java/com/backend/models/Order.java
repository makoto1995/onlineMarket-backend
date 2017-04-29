package com.backend.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by kevin on 2017/4/25.
 */
@Entity
public class Order {
    private String orderId;
    private String receiverName;
    private String phone;
    private String orderStatus;
    private Timestamp payTime;
    private Timestamp deliveryTime;
    private Double shipCost;
    private Double allPrice;
    private Timestamp confirmTime;
    private String postcode;
    private String province;
    private String city;
    private String district;
    private String street;
    private String address;
    private Timestamp creatTime;
    private String userId;
    private String sellerId;

    @Id
    @Column(name = "orderID", nullable = false, length = 12)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "receiverName", nullable = true, length = 20)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "Phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "orderStatus", nullable = true, length = 20)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "payTime", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "deliveryTime", nullable = true)
    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Basic
    @Column(name = "shipCost", nullable = true, precision = 0)
    public Double getShipCost() {
        return shipCost;
    }

    public void setShipCost(Double shipCost) {
        this.shipCost = shipCost;
    }

    @Basic
    @Column(name = "allPrice", nullable = true, precision = 0)
    public Double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(Double allPrice) {
        this.allPrice = allPrice;
    }

    @Basic
    @Column(name = "confirmTime", nullable = true)
    public Timestamp getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Basic
    @Column(name = "Postcode", nullable = true, length = 6)
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "Province", nullable = true, length = 20)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "District", nullable = true, length = 20)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Street", nullable = true, length = 20)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "creatTime", nullable = true)
    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    @Basic
    @Column(name = "userID", nullable = true, length = 12)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "sellerID", nullable = true, length = 12)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != null ? !orderId.equals(order.orderId) : order.orderId != null) return false;
        if (receiverName != null ? !receiverName.equals(order.receiverName) : order.receiverName != null) return false;
        if (phone != null ? !phone.equals(order.phone) : order.phone != null) return false;
        if (orderStatus != null ? !orderStatus.equals(order.orderStatus) : order.orderStatus != null) return false;
        if (payTime != null ? !payTime.equals(order.payTime) : order.payTime != null) return false;
        if (deliveryTime != null ? !deliveryTime.equals(order.deliveryTime) : order.deliveryTime != null) return false;
        if (shipCost != null ? !shipCost.equals(order.shipCost) : order.shipCost != null) return false;
        if (allPrice != null ? !allPrice.equals(order.allPrice) : order.allPrice != null) return false;
        if (confirmTime != null ? !confirmTime.equals(order.confirmTime) : order.confirmTime != null) return false;
        if (postcode != null ? !postcode.equals(order.postcode) : order.postcode != null) return false;
        if (province != null ? !province.equals(order.province) : order.province != null) return false;
        if (city != null ? !city.equals(order.city) : order.city != null) return false;
        if (district != null ? !district.equals(order.district) : order.district != null) return false;
        if (street != null ? !street.equals(order.street) : order.street != null) return false;
        if (address != null ? !address.equals(order.address) : order.address != null) return false;
        if (creatTime != null ? !creatTime.equals(order.creatTime) : order.creatTime != null) return false;
        if (userId != null ? !userId.equals(order.userId) : order.userId != null) return false;
        if (sellerId != null ? !sellerId.equals(order.sellerId) : order.sellerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (deliveryTime != null ? deliveryTime.hashCode() : 0);
        result = 31 * result + (shipCost != null ? shipCost.hashCode() : 0);
        result = 31 * result + (allPrice != null ? allPrice.hashCode() : 0);
        result = 31 * result + (confirmTime != null ? confirmTime.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (creatTime != null ? creatTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        return result;
    }
}
