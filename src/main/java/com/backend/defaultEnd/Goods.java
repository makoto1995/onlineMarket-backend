package com.backend.defaultEnd;

public class Goods {
    private String goodsID;   //��Ʒ���
    private String goodsName;  //��Ʒ����
    private float goodsCount;  //�������
    private float goodsPrice; //����
    private String storeWay; //�����д���
    private String sourceArea;//ԭ����
    private String setDate;//�ϼ�ʱ��
    private String sellerID; //�̼ұ��
    private String goodsType;//��Ʒ���
    private float leastAmount;//������
    private float largeAmount;//�����ɹ�������
    private float largePrice;//�����ɹ���
    private String Picture; //��ƷͼƬ
    void setgoodsID(String  goodsID)
    {
    	this.goodsID=goodsID;
    }
    void setgoodsName(String  goodsName)
    {
    	this.goodsName=goodsName;
    }
    void setgoodsCount(float  goodsCount)
    {
    	this.goodsCount=goodsCount;
    } 
    void setgoodsPrice(float  goodsPrice)
    {
    	this.goodsPrice=goodsPrice;
    }
    void setstoreWay(String  storeWay)
    {
    	this.storeWay=storeWay;
    }
    void setsourceArea(String  sourceArea)
    {
    	this.sourceArea=sourceArea;
    }
    void setsetDate(String  setDate)
    {
    	this.setDate=setDate;
    }
    void setsellerID(String  sellerID)
    {
    	this.sellerID=sellerID;
    }
    void setgoodsType(String  goodsType)
    {
    	this.goodsType=goodsType;
    }
    void setleastAmount(float  leastAmount)
    {
    	this.leastAmount=leastAmount;
    }
    void setlargeAmount(float  largeAmount)
    {
    	this.largeAmount=largeAmount;
    }
    void setlargePrice(float  largePrice)
    {
    	this.largePrice=largePrice;
    }
    String getgoodsID()
    {
    	return this.goodsID;
    }
    String getgoodsName()
    {
    	return this.goodsName;
    }
    String getsourceArea()
    {
    	return this.sourceArea;
    }
    String getsetDate()
    {
    	return this.setDate;
    }
    String getsellerID()
    {
    	return this.sellerID;
    }
    String getgoodsType()
    {
    	return this.goodsType;
    }
    String getPicture()
    {
    	return this.Picture;
    }
    float getgoodsCount()
    {
    	return this.goodsCount;
    }
    float getgoodsPrice()
    {
    	return this.goodsPrice;
    }
    String getstoreWay()
    {
    	return this.storeWay;
    }
    float getleastAmount()
    {
    	return this.leastAmount;
    }
    float getlargeAmount()
    {
    	return this.largeAmount;
    }
    float getlargePrice()
    {
    	return this.largePrice;
    }
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public float getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(float goodsCount) {
		this.goodsCount = goodsCount;
	}
	public float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public float getStoreWay() {
		return storeWay;
	}
	public void setStoreWay(float storeWay) {
		this.storeWay = storeWay;
	}
	public String getSourceArea() {
		return sourceArea;
	}
	public void setSourceArea(String sourceArea) {
		this.sourceArea = sourceArea;
	}
	public String getSetDate() {
		return setDate;
	}
	public void setSetDate(String setDate) {
		this.setDate = setDate;
	}
	public String getSellerID() {
		return sellerID;
	}
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public float getLeastAmount() {
		return leastAmount;
	}
	public void setLeastAmount(float leastAmount) {
		this.leastAmount = leastAmount;
	}
	public float getLargeAmount() {
		return largeAmount;
	}
	public void setLargeAmount(float largeAmount) {
		this.largeAmount = largeAmount;
	}
	public float getLargePrice() {
		return largePrice;
	}
	public void setLargePrice(float largePrice) {
		this.largePrice = largePrice;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
    
}
