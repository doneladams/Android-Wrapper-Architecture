package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 9/11/2018 7:29:45 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class StoreProductsFilter implements KvmSerializable {

    public int storeId;
//    public int barcodeId;
    public int productId;
//    public int replacementProductId;
//    public int supplierId;
//    public int preferredSupplierId;
//    public int classification1IdField;
//    public int productCategoryId;
//    public int cashRegisterGroupId;
//    public int brandId;
//    public int subBrandId;
//    public String modifiedSinceDateTime;
//    public String modifiedStockSinceDateTime;
//    public String lastModifiedDateFrom;
//    public String lastModifiedDateTo;
//    public WS_Enums.BooleanFilter isMaintainStockOnly;
//    public boolean isParentShopServerStockOnly;
//    public boolean isIncludeCalculatedFields;
//    public WS_Enums.BooleanFilter isIgnoreCancelledProducts;

    public StoreProductsFilter() {
    }

    public StoreProductsFilter(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("StoreId")) {
            Object obj = soapObject.getProperty("StoreId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                storeId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                storeId = (Integer) obj;
            }
        }
//        if (soapObject.hasProperty("BarcodeId")) {
//            Object obj = soapObject.getProperty("BarcodeId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                barcodeId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                barcodeId = (Integer) obj;
//            }
//        }
        if (soapObject.hasProperty("ProductId")) {
            Object obj = soapObject.getProperty("ProductId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                productId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                productId = (Integer) obj;
            }
        }
//        if (soapObject.hasProperty("ReplacementProductId")) {
//            Object obj = soapObject.getProperty("ReplacementProductId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                replacementProductId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                replacementProductId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("SupplierId")) {
//            Object obj = soapObject.getProperty("SupplierId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                supplierId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                supplierId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("PreferredSupplierId")) {
//            Object obj = soapObject.getProperty("PreferredSupplierId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                preferredSupplierId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                preferredSupplierId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("Classification1Id")) {
//            Object obj = soapObject.getProperty("Classification1Id");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                classification1IdField = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                classification1IdField = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("ProductCategoryId")) {
//            Object obj = soapObject.getProperty("ProductCategoryId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                productCategoryId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                productCategoryId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("CashRegisterGroupId")) {
//            Object obj = soapObject.getProperty("CashRegisterGroupId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                cashRegisterGroupId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                cashRegisterGroupId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("BrandId")) {
//            Object obj = soapObject.getProperty("BrandId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                brandId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                brandId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("SubBrandId")) {
//            Object obj = soapObject.getProperty("SubBrandId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                subBrandId = Integer.parseInt(j.toString());
//            } else if (obj != null && obj instanceof Number) {
//                subBrandId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("ModifiedSinceDateTime")) {
//            Object obj = soapObject.getProperty("ModifiedSinceDateTime");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                modifiedSinceDateTime = j.toString();
//            } else if (obj != null && obj instanceof String) {
//                modifiedSinceDateTime = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("ModifiedStockSinceDateTime")) {
//            Object obj = soapObject.getProperty("ModifiedStockSinceDateTime");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                modifiedStockSinceDateTime = j.toString();
//            } else if (obj != null && obj instanceof String) {
//                modifiedStockSinceDateTime = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("LastModifiedDateFrom")) {
//            Object obj = soapObject.getProperty("LastModifiedDateFrom");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                lastModifiedDateFrom = j.toString();
//            } else if (obj != null && obj instanceof String) {
//                lastModifiedDateFrom = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("LastModifiedDateTo")) {
//            Object obj = soapObject.getProperty("LastModifiedDateTo");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                lastModifiedDateTo = j.toString();
//            } else if (obj != null && obj instanceof String) {
//                lastModifiedDateTo = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("IsMaintainStockOnly")) {
//            Object obj = soapObject.getProperty("IsMaintainStockOnly");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                isMaintainStockOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("IsParentShopServerStockOnly")) {
//            Object obj = soapObject.getProperty("IsParentShopServerStockOnly");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                isParentShopServerStockOnly = Boolean.parseBoolean(j.toString());
//            } else if (obj != null && obj instanceof Boolean) {
//                isParentShopServerStockOnly = (Boolean) obj;
//            }
//        }
//        if (soapObject.hasProperty("IsIncludeCalculatedFields")) {
//            Object obj = soapObject.getProperty("IsIncludeCalculatedFields");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                isIncludeCalculatedFields = Boolean.parseBoolean(j.toString());
//            } else if (obj != null && obj instanceof Boolean) {
//                isIncludeCalculatedFields = (Boolean) obj;
//            }
//        }
//        if (soapObject.hasProperty("IsIgnoreCancelledProducts")) {
//            Object obj = soapObject.getProperty("IsIgnoreCancelledProducts");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
//                SoapPrimitive j = (SoapPrimitive) obj;
//                isIgnoreCancelledProducts = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return storeId;
//            case 1:
//                return barcodeId;
            case 1:
                return productId;
//            case 3:
//                return replacementProductId;
//            case 4:
//                return supplierId;
//            case 5:
//                return preferredSupplierId;
//            case 6:
//                return classification1IdField;
//            case 7:
//                return productCategoryId;
//            case 8:
//                return cashRegisterGroupId;
//            case 9:
//                return brandId;
//            case 10:
//                return subBrandId;
//            case 11:
//                return modifiedSinceDateTime;
//            case 12:
//                return modifiedStockSinceDateTime;
//            case 13:
//                return lastModifiedDateFrom;
//            case 14:
//                return lastModifiedDateTo;
//            case 15:
//                return isMaintainStockOnly.toString();
//            case 16:
//                return isParentShopServerStockOnly;
//            case 17:
//                return isIncludeCalculatedFields;
//            case 18:
//                return isIgnoreCancelledProducts.toString();
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
//            case 1:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "BarcodeId";
//                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ProductId";
                break;
//            case 3:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "ReplacementProductId";
//                break;
//            case 4:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "SupplierId";
//                break;
//            case 5:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "PreferredSupplierId";
//                break;
//            case 6:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "Classification1Id";
//                break;
//            case 7:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "ProductCategoryId";
//                break;
//            case 8:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "CashRegisterGroupId";
//                break;
//            case 9:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "BrandId";
//                break;
//            case 10:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "SubBrandId";
//                break;
//            case 11:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "ModifiedSinceDateTime";
//                break;
//            case 12:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "ModifiedStockSinceDateTime";
//                break;
//            case 13:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "LastModifiedDateFrom";
//                break;
//            case 14:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "LastModifiedDateTo";
//                break;
//            case 15:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsMaintainStockOnly";
//                break;
//            case 16:
//                info.type = PropertyInfo.BOOLEAN_CLASS;
//                info.name = "IsParentShopServerStockOnly";
//                break;
//            case 17:
//                info.type = PropertyInfo.BOOLEAN_CLASS;
//                info.name = "IsIncludeCalculatedFields";
//                break;
//            case 18:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsIgnoreCancelledProducts";
//                break;
        }
    }

    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}