package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 8/16/2017 5:54:09 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import webservice.WS_Enums;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ViewMixedMatchInfo implements KvmSerializable {

    public String mixedMatchTypeDescription;
    public String mixedMatchDiscountTypeDescription;
    public String promotionCode;
    public String promotionDescription;
    public String displayDateFrom;
    public String displayDateTo;
    public long mainBarcode;
    public int storeId;
    public int mixedMatchNumber;
    public String externalCode;
    public String description;
    public WS_Enums.MixedMatchType mixedMatchType;
    public WS_Enums.MixedMatchDiscountType mixedMatchDiscountType;
    public int promotionId;
    public int timeProfileId;
    public int promotionVoucherTypeId;
    public Byte amount;
    public Byte amount2;
    public Byte amount3;
    public Byte amount4;
    public Byte amount5;
    public Byte amount6;
    public Byte amount7;
    public Byte amount8;
    public Byte amount9;
    public Byte amount10;
    public double discountPercentage;
    public double discountPrice;
    public double netPrice;
    public String dateFrom;
    public String dateTo;
    public boolean isIgnoreMixedMatch;
    public WS_Enums.MixedMatchReceiptDetailType receiptDetailType;
    public WS_Enums.MixedMatchDiscountOnArticlesType discountOnArticlesType;
    public Byte numberOfColumns;
    public boolean isDerived;
    public int organizationId;
    public int companyId;
    public int createdByUserId;
    public String createdDateTime;
    public int lastModifiedByUserId;
    public String lastModifiedDateTime;
    public int itemId;

    public ViewMixedMatchInfo() {
    }

    public ViewMixedMatchInfo(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("MixedMatchTypeDescription")) {
            Object obj = soapObject.getProperty("MixedMatchTypeDescription");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mixedMatchTypeDescription = j.toString();
            } else if (obj != null && obj instanceof String) {
                mixedMatchTypeDescription = (String) obj;
            }
        }
        if (soapObject.hasProperty("MixedMatchDiscountTypeDescription")) {
            Object obj = soapObject.getProperty("MixedMatchDiscountTypeDescription");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mixedMatchDiscountTypeDescription = j.toString();
            } else if (obj != null && obj instanceof String) {
                mixedMatchDiscountTypeDescription = (String) obj;
            }
        }
        if (soapObject.hasProperty("PromotionCode")) {
            Object obj = soapObject.getProperty("PromotionCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                promotionCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                promotionCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("PromotionDescription")) {
            Object obj = soapObject.getProperty("PromotionDescription");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                promotionDescription = j.toString();
            } else if (obj != null && obj instanceof String) {
                promotionDescription = (String) obj;
            }
        }
        if (soapObject.hasProperty("DisplayDateFrom")) {
            Object obj = soapObject.getProperty("DisplayDateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                displayDateFrom = j.toString();
            } else if (obj != null && obj instanceof String) {
                displayDateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("DisplayDateTo")) {
            Object obj = soapObject.getProperty("DisplayDateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                displayDateTo = j.toString();
            } else if (obj != null && obj instanceof String) {
                displayDateTo = (String) obj;
            }
        }
        if (soapObject.hasProperty("MainBarcode")) {
            Object obj = soapObject.getProperty("MainBarcode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mainBarcode = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                mainBarcode = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("StoreId")) {
            Object obj = soapObject.getProperty("StoreId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                storeId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                storeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("MixedMatchNumber")) {
            Object obj = soapObject.getProperty("MixedMatchNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mixedMatchNumber = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                mixedMatchNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ExternalCode")) {
            Object obj = soapObject.getProperty("ExternalCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                externalCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                externalCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("Description")) {
            Object obj = soapObject.getProperty("Description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                description = j.toString();
            } else if (obj != null && obj instanceof String) {
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("MixedMatchType")) {
            Object obj = soapObject.getProperty("MixedMatchType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mixedMatchType = WS_Enums.MixedMatchType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("MixedMatchDiscountType")) {
            Object obj = soapObject.getProperty("MixedMatchDiscountType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                mixedMatchDiscountType = WS_Enums.MixedMatchDiscountType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("PromotionId")) {
            Object obj = soapObject.getProperty("PromotionId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                promotionId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                promotionId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("TimeProfileId")) {
            Object obj = soapObject.getProperty("TimeProfileId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                timeProfileId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                timeProfileId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PromotionVoucherTypeId")) {
            Object obj = soapObject.getProperty("PromotionVoucherTypeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                promotionVoucherTypeId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                promotionVoucherTypeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Amount")) {
            Object obj = soapObject.getProperty("Amount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount2")) {
            Object obj = soapObject.getProperty("Amount2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount2 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount2 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount3")) {
            Object obj = soapObject.getProperty("Amount3");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount3 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount3 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount4")) {
            Object obj = soapObject.getProperty("Amount4");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount4 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount4 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount5")) {
            Object obj = soapObject.getProperty("Amount5");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount5 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount5 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount6")) {
            Object obj = soapObject.getProperty("Amount6");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount6 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount6 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount7")) {
            Object obj = soapObject.getProperty("Amount7");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount7 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount7 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount8")) {
            Object obj = soapObject.getProperty("Amount8");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount8 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount8 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount9")) {
            Object obj = soapObject.getProperty("Amount9");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount9 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount9 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("Amount10")) {
            Object obj = soapObject.getProperty("Amount10");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                amount10 = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                amount10 = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("DiscountPercentage")) {
            Object obj = soapObject.getProperty("DiscountPercentage");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                discountPercentage = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                discountPercentage = (Double) obj;
            }
        }
        if (soapObject.hasProperty("DiscountPrice")) {
            Object obj = soapObject.getProperty("DiscountPrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                discountPrice = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                discountPrice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("NetPrice")) {
            Object obj = soapObject.getProperty("NetPrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                netPrice = Double.parseDouble(j.toString());
            } else if (obj != null && obj instanceof Number) {
                netPrice = (Double) obj;
            }
        }
        if (soapObject.hasProperty("DateFrom")) {
            Object obj = soapObject.getProperty("DateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                dateFrom = j.toString();
            } else if (obj != null && obj instanceof String) {
                dateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("DateTo")) {
            Object obj = soapObject.getProperty("DateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                dateTo = j.toString();
            } else if (obj != null && obj instanceof String) {
                dateTo = (String) obj;
            }
        }
        if (soapObject.hasProperty("IsIgnoreMixedMatch")) {
            Object obj = soapObject.getProperty("IsIgnoreMixedMatch");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                isIgnoreMixedMatch = Boolean.parseBoolean(j.toString());
            } else if (obj != null && obj instanceof Boolean) {
                isIgnoreMixedMatch = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("ReceiptDetailType")) {
            Object obj = soapObject.getProperty("ReceiptDetailType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                receiptDetailType = WS_Enums.MixedMatchReceiptDetailType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("DiscountOnArticlesType")) {
            Object obj = soapObject.getProperty("DiscountOnArticlesType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                discountOnArticlesType = WS_Enums.MixedMatchDiscountOnArticlesType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("NumberOfColumns")) {
            Object obj = soapObject.getProperty("NumberOfColumns");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                numberOfColumns = Byte.parseByte(j.toString());
            } else if (obj != null && obj instanceof Byte) {
                numberOfColumns = (Byte) obj;
            }
        }
        if (soapObject.hasProperty("IsDerived")) {
            Object obj = soapObject.getProperty("IsDerived");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                isDerived = Boolean.parseBoolean(j.toString());
            } else if (obj != null && obj instanceof Boolean) {
                isDerived = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("OrganizationId")) {
            Object obj = soapObject.getProperty("OrganizationId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                organizationId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                organizationId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CompanyId")) {
            Object obj = soapObject.getProperty("CompanyId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                companyId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                companyId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreatedByUserId")) {
            Object obj = soapObject.getProperty("CreatedByUserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                createdByUserId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                createdByUserId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CreatedDateTime")) {
            Object obj = soapObject.getProperty("CreatedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                createdDateTime = j.toString();
            } else if (obj != null && obj instanceof String) {
                createdDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("LastModifiedByUserId")) {
            Object obj = soapObject.getProperty("LastModifiedByUserId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                lastModifiedByUserId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                lastModifiedByUserId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("LastModifiedDateTime")) {
            Object obj = soapObject.getProperty("LastModifiedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                lastModifiedDateTime = j.toString();
            } else if (obj != null && obj instanceof String) {
                lastModifiedDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("ItemId")) {
            Object obj = soapObject.getProperty("ItemId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                itemId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                itemId = (Integer) obj;
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return mixedMatchTypeDescription;
            case 1:
                return mixedMatchDiscountTypeDescription;
            case 2:
                return promotionCode;
            case 3:
                return promotionDescription;
            case 4:
                return displayDateFrom;
            case 5:
                return displayDateTo;
            case 6:
                return mainBarcode;
            case 7:
                return storeId;
            case 8:
                return mixedMatchNumber;
            case 9:
                return externalCode;
            case 10:
                return description;
            case 11:
                return mixedMatchType.toString();
            case 12:
                return mixedMatchDiscountType.toString();
            case 13:
                return promotionId;
            case 14:
                return timeProfileId;
            case 15:
                return promotionVoucherTypeId;
            case 16:
                return amount.toString();
            case 17:
                return amount2.toString();
            case 18:
                return amount3.toString();
            case 19:
                return amount4.toString();
            case 20:
                return amount5.toString();
            case 21:
                return amount6.toString();
            case 22:
                return amount7.toString();
            case 23:
                return amount8.toString();
            case 24:
                return amount9.toString();
            case 25:
                return amount10.toString();
            case 26:
                return discountPercentage;
            case 27:
                return discountPrice;
            case 28:
                return netPrice;
            case 29:
                return dateFrom;
            case 30:
                return dateTo;
            case 31:
                return isIgnoreMixedMatch;
            case 32:
                return receiptDetailType.toString();
            case 33:
                return discountOnArticlesType.toString();
            case 34:
                return numberOfColumns.toString();
            case 35:
                return isDerived;
            case 36:
                return organizationId;
            case 37:
                return companyId;
            case 38:
                return createdByUserId;
            case 39:
                return createdDateTime;
            case 40:
                return lastModifiedByUserId;
            case 41:
                return lastModifiedDateTime;
            case 42:
                return itemId;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 43;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MixedMatchTypeDescription";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MixedMatchDiscountTypeDescription";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PromotionCode";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PromotionDescription";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DisplayDateFrom";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DisplayDateTo";
                break;
            case 6:
                info.type = Long.class;
                info.name = "MainBarcode";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "MixedMatchNumber";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ExternalCode";
                break;
            case 10:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Description";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MixedMatchType";
                break;
            case 12:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "MixedMatchDiscountType";
                break;
            case 13:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PromotionId";
                break;
            case 14:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "TimeProfileId";
                break;
            case 15:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PromotionVoucherTypeId";
                break;
            case 16:
                info.type = Byte.class;
                info.name = "Amount";
                break;
            case 17:
                info.type = Byte.class;
                info.name = "Amount2";
                break;
            case 18:
                info.type = Byte.class;
                info.name = "Amount3";
                break;
            case 19:
                info.type = Byte.class;
                info.name = "Amount4";
                break;
            case 20:
                info.type = Byte.class;
                info.name = "Amount5";
                break;
            case 21:
                info.type = Byte.class;
                info.name = "Amount6";
                break;
            case 22:
                info.type = Byte.class;
                info.name = "Amount7";
                break;
            case 23:
                info.type = Byte.class;
                info.name = "Amount8";
                break;
            case 24:
                info.type = Byte.class;
                info.name = "Amount9";
                break;
            case 25:
                info.type = Byte.class;
                info.name = "Amount10";
                break;
            case 26:
                info.type = Double.class;
                info.name = "DiscountPercentage";
                break;
            case 27:
                info.type = Double.class;
                info.name = "DiscountPrice";
                break;
            case 28:
                info.type = Double.class;
                info.name = "NetPrice";
                break;
            case 29:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DateFrom";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DateTo";
                break;
            case 31:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsIgnoreMixedMatch";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ReceiptDetailType";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "DiscountOnArticlesType";
                break;
            case 34:
                info.type = Byte.class;
                info.name = "NumberOfColumns";
                break;
            case 35:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsDerived";
                break;
            case 36:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "OrganizationId";
                break;
            case 37:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CompanyId";
                break;
            case 38:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CreatedByUserId";
                break;
            case 39:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTime";
                break;
            case 40:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "LastModifiedByUserId";
                break;
            case 41:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "LastModifiedDateTime";
                break;
            case 42:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
        }
    }


    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
