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

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class SaleOrdersFilterDelivery implements KvmSerializable {

      public int storeId;


    public int orderNumber;

    public String expectedDeliveryDateFrom;
    public String expectedDeliveryDateTo;



    public SaleOrdersFilterDelivery() {
    }

    public SaleOrdersFilterDelivery(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("StoreId"))
        {
            Object obj = soapObject.getProperty("StoreId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                storeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                storeId = (Integer) obj;
            }
        }
//        if (soapObject.hasProperty("WebshopId"))
//        {
//            Object obj = soapObject.getProperty("WebshopId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                webshopId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                webshopId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("CustomerId"))
//        {
//            Object obj = soapObject.getProperty("CustomerId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                customerId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                customerId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("DeliveryCustomerId"))
//        {
//            Object obj = soapObject.getProperty("DeliveryCustomerId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                deliveryCustomerId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                deliveryCustomerId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("DebtorId"))
//        {
//            Object obj = soapObject.getProperty("DebtorId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                debtorId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                debtorId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("ScannerId"))
//        {
//            Object obj = soapObject.getProperty("ScannerId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                scannerId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                scannerId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("UserId"))
//        {
//            Object obj = soapObject.getProperty("UserId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                userId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                userId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("ReservationId"))
//        {
//            Object obj = soapObject.getProperty("ReservationId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                reservationId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                reservationId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("QuoteId"))
//        {
//            Object obj = soapObject.getProperty("QuoteId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                quoteId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                quoteId = (Integer) obj;
//            }
//        }






//        if (soapObject.hasProperty("ReferenceCode"))
//        {
//            Object obj = soapObject.getProperty("ReferenceCode");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                referenceCode = j.toString();
//            }else if (obj!= null && obj instanceof String){
//                referenceCode = (String) obj;
//            }
//        }


        if (soapObject.hasProperty("OrderNumber")) {
            Object obj = soapObject.getProperty("OrderNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                orderNumber = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                orderNumber = (Integer) obj;
            }
        }


//        if (soapObject.hasProperty("OrderNumberFrom"))
//        {
//            Object obj = soapObject.getProperty("OrderNumberFrom");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                orderNumberFrom = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                orderNumberFrom = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("OrderNumberTo"))
//        {
//            Object obj = soapObject.getProperty("OrderNumberTo");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                orderNumberTo = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                orderNumberTo = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("OrderStatus")) {
//            SoapObject j = (SoapObject) soapObject.getProperty("OrderStatus");
//            orderStatus = new VectorSaleOrderStatus(j);
//        }
//        if (soapObject.hasProperty("TransportTypeId"))
//        {
//            Object obj = soapObject.getProperty("TransportTypeId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                transportTypeId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                transportTypeId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("SaleOrderClassId"))
//        {
//            Object obj = soapObject.getProperty("SaleOrderClassId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                saleOrderClassIdField = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                saleOrderClassIdField = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("SaleOrderId"))
//        {
//            Object obj = soapObject.getProperty("SaleOrderId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                saleOrderId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                saleOrderId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("SaleOrderType"))
//        {
//            Object obj = soapObject.getProperty("SaleOrderType");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                saleOrderType = WS_Enums.SaleOrderType.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("PurchaseOrderId"))
//        {
//            Object obj = soapObject.getProperty("PurchaseOrderId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                purchaseOrderId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                purchaseOrderId = (Integer) obj;
//            }
//        }


        if (soapObject.hasProperty("ExpectedDeliveryDateFrom"))
        {
            Object obj = soapObject.getProperty("ExpectedDeliveryDateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                expectedDeliveryDateFrom = j.toString();
            }else if (obj!= null && obj instanceof String){
                expectedDeliveryDateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("ExpectedDeliveryDateTo"))
        {
            Object obj = soapObject.getProperty("ExpectedDeliveryDateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                expectedDeliveryDateTo = j.toString();
            }else if (obj!= null && obj instanceof String){
                expectedDeliveryDateTo = (String) obj;
            }
        }
//        if (soapObject.hasProperty("UtmostDeliveryDateFrom"))
//        {
//            Object obj = soapObject.getProperty("UtmostDeliveryDateFrom");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                utmostDeliveryDateFrom = j.toString();
//            }else if (obj!= null && obj instanceof String){
//                utmostDeliveryDateFrom = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("UtmostDeliveryDateTo"))
//        {
//            Object obj = soapObject.getProperty("UtmostDeliveryDateTo");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                utmostDeliveryDateTo = j.toString();
//            }else if (obj!= null && obj instanceof String){
//                utmostDeliveryDateTo = (String) obj;
//            }
//        }
//        if (soapObject.hasProperty("PrePaymentRequestNumber"))
//        {
//            Object obj = soapObject.getProperty("PrePaymentRequestNumber");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                prePaymentRequestNumber = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                prePaymentRequestNumber = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("PrePaymentNumber"))
//        {
//            Object obj = soapObject.getProperty("PrePaymentNumber");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                prePaymentNumber = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                prePaymentNumber = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("IsCancelledOnly"))
//        {
//            Object obj = soapObject.getProperty("IsCancelledOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                isCancelledOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("HasPendingPrePaymentsOnly"))
//        {
//            Object obj = soapObject.getProperty("HasPendingPrePaymentsOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                hasPendingPrePaymentsOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("IsShowOpenSaleOrdersOnly"))
//        {
//            Object obj = soapObject.getProperty("IsShowOpenSaleOrdersOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                isShowOpenSaleOrdersOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("OrdersWithRowsOnly"))
//        {
//            Object obj = soapObject.getProperty("OrdersWithRowsOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                ordersWithRowsOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("IsOrderResponseSentOnly"))
//        {
//            Object obj = soapObject.getProperty("IsOrderResponseSentOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                isOrderResponseSentOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("IsEdiSaleOrdersOnly"))
//        {
//            Object obj = soapObject.getProperty("IsEdiSaleOrdersOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                isEdiSaleOrdersOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("IsExportedOnly"))
//        {
//            Object obj = soapObject.getProperty("IsExportedOnly");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                isExportedOnly = WS_Enums.BooleanFilter.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("ConversionId"))
//        {
//            Object obj = soapObject.getProperty("ConversionId");
//            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive) obj;
//                conversionId = Integer.parseInt(j.toString());
//            }else if (obj!= null && obj instanceof Number){
//                conversionId = (Integer) obj;
//            }
//        }
//        if (soapObject.hasProperty("CustomerApprovalStatus"))
//        {
//            Object obj = soapObject.getProperty("CustomerApprovalStatus");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                customerApprovalStatus = WS_Enums.SaleOrderApprovalStatus.fromString(j.toString());
//            }
//        }
//        if (soapObject.hasProperty("SuppliersApprovalStatus"))
//        {
//            Object obj = soapObject.getProperty("SuppliersApprovalStatus");
//            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
//                SoapPrimitive j =(SoapPrimitive)obj;
//                suppliersApprovalStatus = WS_Enums.SaleOrderApprovalStatus.fromString(j.toString());
//            }
//        }
    }

    @Override
    public Object getProperty(int arg0) {
        switch (arg0) {
            case 0:
                return storeId;





            case 1:
                return orderNumber;



            case 2:
               return expectedDeliveryDateFrom;
            case 3:
               return expectedDeliveryDateTo;
//            case 25:
//                return utmostDeliveryDateFrom;
//            case 26:
//                return utmostDeliveryDateTo;
//            case 27:
//                return prePaymentRequestNumber;
//            case 28:
//                return prePaymentNumber;
//            case 29:
//                return isCancelledOnly.toString();
//            case 30:
//                return hasPendingPrePaymentsOnly.toString();
//            case 31:
//                return isShowOpenSaleOrdersOnly.toString();
//            case 32:
//                return ordersWithRowsOnly.toString();
//            case 33:
//                return isOrderResponseSentOnly.toString();
//            case 34:
//                return isEdiSaleOrdersOnly.toString();
//            case 35:
//                return isExportedOnly.toString();
//            case 36:
//                return conversionId;
//            case 37:
//                return customerApprovalStatus.toString();
//            case 38:
//                return suppliersApprovalStatus.toString();
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 4;
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
//                info.name = "WebshopId";
//                break;
//            case 2:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "CustomerId";
//                break;
//            case 3:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "DeliveryCustomerId";
//                break;
//            case 4:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "DebtorId";
//                break;
//            case 5:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "ScannerId";
//                break;
//            case 6:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "UserId";
//                break;
//            case 7:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "ReservationId";
//                break;
//            case 8:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "QuoteId";
//                break;





//            case 11:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "ReferenceCode";
//                break;


            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "OrderNumber";
                break;
//


//            case 13:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "OrderNumberFrom";
//                break;
//            case 14:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "OrderNumberTo";
//                break;

//            case 16:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "TransportTypeId";
//                break;
//            case 17:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "SaleOrderClassId";
//                break;
//            case 18:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "SaleOrderId";
//                break;
//            case 19:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "SaleOrderType";
//                break;
//            case 20:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "PurchaseOrderId";
//                break;

//            case 4:
//                info.type = PropertyInfo.VECTOR_CLASS;
//                info.name = "OrderStatus";
//                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ExpectedDeliveryDateFrom";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ExpectedDeliveryDateTo";
                break;
//            case 25:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "UtmostDeliveryDateFrom";
//                break;
//            case 26:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "UtmostDeliveryDateTo";
//                break;
//            case 27:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "PrePaymentRequestNumber";
//                break;
//            case 28:
//                info.type = PropertyInfo.INTEGER_CLASS;
//                info.name = "PrePaymentNumber";
//                break;
//            case 29:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsCancelledOnly";
//                break;
//            case 30:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "HasPendingPrePaymentsOnly";
//                break;
//            case 31:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsShowOpenSaleOrdersOnly";
//                break;
//            case 32:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "OrdersWithRowsOnly";
//                break;
//            case 33:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsOrderResponseSentOnly";
//                break;
//            case 34:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsEdiSaleOrdersOnly";
//                break;
//            case 35:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "IsExportedOnly";
//                break;
//            case 36:
//                info.type = Long.class;
//                info.name = "ConversionId";
//                break;
//            case 37:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "CustomerApprovalStatus";
//                break;
//            case 38:
//                info.type = PropertyInfo.STRING_CLASS;
//                info.name = "SuppliersApprovalStatus";
//                break;
        }
    }


    @Override
    public void setProperty(int arg0, Object arg1) {

    }

//    private class SaleOrderStatus implements KvmSerializable {
//        private String SaleOrderStatus;
//
//        @Override
//        public Object getProperty(int index) {
//            switch (index) {
//            case 0:
//                info.type = PropertyInfo.INTEGER_CLASS;
//               info.name = "StoreId";
//                break;
//        }
//
//
//
//        @Override
//        public int getPropertyCount() {
//
//            }
//         }
//
//        @Override
//        public void setProperty(int index, Object value) {
//
//        }
//
//        @Override
//        public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
//
//        }
//    }
}
