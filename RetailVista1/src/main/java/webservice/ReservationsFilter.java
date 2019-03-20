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

import java.lang.*;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class ReservationsFilter implements KvmSerializable {
    
    /*public int storeId;
    public int reservationId;
    public int customerId;
    public int debtorId;*/
    public int saleOrderId;
   /* public String saleOrderReferenceCode;
    public VectorReservationStatus status;
    public VectorReservationSearchStatus searchStatus;
    public int transportTypeId;
    public int reservationNumber;
    public int cashSaleId;
    public int invoiceSaleId;
    public int assignedScannerId;
    public String printedDateTime;
    public String closedDateTime;
    public BooleanFilter isDeliveredOnly;
    public String saleOrderExpectedDeliveryDateFrom;
    public String saleOrderExpectedDeliveryDateTo;
    public String saleOrderUtmostDeliveryDateFrom;
    public String saleOrderUtmostDeliveryDateTo;
    public String createdDateFrom;
    public String createdDateTo;
    public int saleOrderClassIdField;
    public boolean isIncludeEmptyExpectedDeliveryDate;
    public boolean isIncludeEmptyUtmostDeliveryDate;
    public BooleanFilter isShowOpenSaleOrdersOnly;
    public int scannerIdOrUnassignedOnly;
    public BooleanFilter parcelServiceOnly;
    public BooleanFilter parcelAnnouncedOnly;
    public BooleanFilter isCancelledOnly;
    public BooleanFilter onlyReservationsOfSaleOrdersWithDebtors;
    public BooleanFilter pendingPrepaymentRequestsOnly;
    public BooleanFilter onlyPaidInFull;
    public BooleanFilter fullyNotified;
    public long conversionId;*/
    
    public ReservationsFilter(){}
    
    public ReservationsFilter(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        /*if (soapObject.hasProperty("StoreId"))
        {
            Object obj = soapObject.getProperty("StoreId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                storeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                storeId = (Integer) obj;
            }
        }*/
        /*if (soapObject.hasProperty("ReservationId"))
        {
            Object obj = soapObject.getProperty("ReservationId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reservationId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                reservationId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CustomerId"))
        {
            Object obj = soapObject.getProperty("CustomerId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                customerId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                customerId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("DebtorId"))
        {
            Object obj = soapObject.getProperty("DebtorId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                debtorId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                debtorId = (Integer) obj;
            }
        }*/
        if (soapObject.hasProperty("SaleOrderId"))
        {
            Object obj = soapObject.getProperty("SaleOrderId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                saleOrderId = (Integer) obj;
            }
        }
        /*if (soapObject.hasProperty("SaleOrderReferenceCode"))
        {
            Object obj = soapObject.getProperty("SaleOrderReferenceCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderReferenceCode = j.toString();
            }else if (obj!= null && obj instanceof String){
                saleOrderReferenceCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("Status"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Status");
            status = new VectorReservationStatus(j);
        }
        if (soapObject.hasProperty("SearchStatus"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("SearchStatus");
            searchStatus = new VectorReservationSearchStatus(j);
        }
        if (soapObject.hasProperty("TransportTypeId"))
        {
            Object obj = soapObject.getProperty("TransportTypeId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                transportTypeId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                transportTypeId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ReservationNumber"))
        {
            Object obj = soapObject.getProperty("ReservationNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                reservationNumber = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                reservationNumber = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("CashSaleId"))
        {
            Object obj = soapObject.getProperty("CashSaleId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cashSaleId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                cashSaleId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("InvoiceSaleId"))
        {
            Object obj = soapObject.getProperty("InvoiceSaleId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                invoiceSaleId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                invoiceSaleId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("AssignedScannerId"))
        {
            Object obj = soapObject.getProperty("AssignedScannerId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                assignedScannerId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                assignedScannerId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("PrintedDateTime"))
        {
            Object obj = soapObject.getProperty("PrintedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                printedDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                printedDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("ClosedDateTime"))
        {
            Object obj = soapObject.getProperty("ClosedDateTime");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                closedDateTime = j.toString();
            }else if (obj!= null && obj instanceof String){
                closedDateTime = (String) obj;
            }
        }
        if (soapObject.hasProperty("IsDeliveredOnly"))
        {
            Object obj = soapObject.getProperty("IsDeliveredOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                isDeliveredOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("SaleOrderExpectedDeliveryDateFrom"))
        {
            Object obj = soapObject.getProperty("SaleOrderExpectedDeliveryDateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderExpectedDeliveryDateFrom = j.toString();
            }else if (obj!= null && obj instanceof String){
                saleOrderExpectedDeliveryDateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("SaleOrderExpectedDeliveryDateTo"))
        {
            Object obj = soapObject.getProperty("SaleOrderExpectedDeliveryDateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderExpectedDeliveryDateTo = j.toString();
            }else if (obj!= null && obj instanceof String){
                saleOrderExpectedDeliveryDateTo = (String) obj;
            }
        }
        if (soapObject.hasProperty("SaleOrderUtmostDeliveryDateFrom"))
        {
            Object obj = soapObject.getProperty("SaleOrderUtmostDeliveryDateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderUtmostDeliveryDateFrom = j.toString();
            }else if (obj!= null && obj instanceof String){
                saleOrderUtmostDeliveryDateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("SaleOrderUtmostDeliveryDateTo"))
        {
            Object obj = soapObject.getProperty("SaleOrderUtmostDeliveryDateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderUtmostDeliveryDateTo = j.toString();
            }else if (obj!= null && obj instanceof String){
                saleOrderUtmostDeliveryDateTo = (String) obj;
            }
        }
        if (soapObject.hasProperty("CreatedDateFrom"))
        {
            Object obj = soapObject.getProperty("CreatedDateFrom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                createdDateFrom = j.toString();
            }else if (obj!= null && obj instanceof String){
                createdDateFrom = (String) obj;
            }
        }
        if (soapObject.hasProperty("CreatedDateTo"))
        {
            Object obj = soapObject.getProperty("CreatedDateTo");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                createdDateTo = j.toString();
            }else if (obj!= null && obj instanceof String){
                createdDateTo = (String) obj;
            }
        }
        if (soapObject.hasProperty("SaleOrderClassId"))
        {
            Object obj = soapObject.getProperty("SaleOrderClassId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                saleOrderClassIdField = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                saleOrderClassIdField = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("IsIncludeEmptyExpectedDeliveryDate"))
        {
            Object obj = soapObject.getProperty("IsIncludeEmptyExpectedDeliveryDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isIncludeEmptyExpectedDeliveryDate = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isIncludeEmptyExpectedDeliveryDate = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IsIncludeEmptyUtmostDeliveryDate"))
        {
            Object obj = soapObject.getProperty("IsIncludeEmptyUtmostDeliveryDate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                isIncludeEmptyUtmostDeliveryDate = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                isIncludeEmptyUtmostDeliveryDate = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("IsShowOpenSaleOrdersOnly"))
        {
            Object obj = soapObject.getProperty("IsShowOpenSaleOrdersOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                isShowOpenSaleOrdersOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("ScannerIdOrUnassignedOnly"))
        {
            Object obj = soapObject.getProperty("ScannerIdOrUnassignedOnly");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                scannerIdOrUnassignedOnly = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                scannerIdOrUnassignedOnly = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ParcelServiceOnly"))
        {
            Object obj = soapObject.getProperty("ParcelServiceOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                parcelServiceOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("ParcelAnnouncedOnly"))
        {
            Object obj = soapObject.getProperty("ParcelAnnouncedOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                parcelAnnouncedOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("IsCancelledOnly"))
        {
            Object obj = soapObject.getProperty("IsCancelledOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                isCancelledOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("OnlyReservationsOfSaleOrdersWithDebtors"))
        {
            Object obj = soapObject.getProperty("OnlyReservationsOfSaleOrdersWithDebtors");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                onlyReservationsOfSaleOrdersWithDebtors = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("PendingPrepaymentRequestsOnly"))
        {
            Object obj = soapObject.getProperty("PendingPrepaymentRequestsOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                pendingPrepaymentRequestsOnly = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("OnlyPaidInFull"))
        {
            Object obj = soapObject.getProperty("OnlyPaidInFull");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                onlyPaidInFull = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("FullyNotified"))
        {
            Object obj = soapObject.getProperty("FullyNotified");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                fullyNotified = BooleanFilter.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("ConversionId"))
        {
            Object obj = soapObject.getProperty("ConversionId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                conversionId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                conversionId = (Integer) obj;
            }
        }*/
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            /*case 0:
                return storeId;
            case 1:
                return reservationId;
            case 2:
                return customerId;
            case 3:
                return debtorId;*/
            case 0:
                return saleOrderId;
            /*case 5:
                return saleOrderReferenceCode;
            case 6:
                return status;
            case 7:
                return searchStatus;
            case 8:
                return transportTypeId;
            case 9:
                return reservationNumber;
            case 10:
                return cashSaleId;
            case 11:
                return invoiceSaleId;
            case 12:
                return assignedScannerId;
            case 13:
                return printedDateTime;
            case 14:
                return closedDateTime;
            case 15:
                return isDeliveredOnly.toString();
            case 16:
                return saleOrderExpectedDeliveryDateFrom;
            case 17:
                return saleOrderExpectedDeliveryDateTo;
            case 18:
                return saleOrderUtmostDeliveryDateFrom;
            case 19:
                return saleOrderUtmostDeliveryDateTo;
            case 20:
                return createdDateFrom;
            case 21:
                return createdDateTo;
            case 22:
                return saleOrderClassIdField;
            case 23:
                return isIncludeEmptyExpectedDeliveryDate;
            case 24:
                return isIncludeEmptyUtmostDeliveryDate;
            case 25:
                return isShowOpenSaleOrdersOnly.toString();
            case 26:
                return scannerIdOrUnassignedOnly;
            case 27:
                return parcelServiceOnly.toString();
            case 28:
                return parcelAnnouncedOnly.toString();
            case 29:
                return isCancelledOnly.toString();
            case 30:
                return onlyReservationsOfSaleOrdersWithDebtors.toString();
            case 31:
                return pendingPrepaymentRequestsOnly.toString();
            case 32:
                return onlyPaidInFull.toString();
            case 33:
                return fullyNotified.toString();
            case 34:
                return conversionId;*/
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 1;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            /*case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ReservationId";
                break;
            case 2:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "DebtorId";
                break;*/
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "SaleOrderId";
                break;
            /*case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "SaleOrderReferenceCode";
                break;
            case 6:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "Status";
                break;
            case 7:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "SearchStatus";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "TransportTypeId";
                break;
            case 9:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ReservationNumber";
                break;
            case 10:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CashSaleId";
                break;
            case 11:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "InvoiceSaleId";
                break;
            case 12:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "AssignedScannerId";
                break;
            case 13:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PrintedDateTime";
                break;
            case 14:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ClosedDateTime";
                break;
            case 15:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "IsDeliveredOnly";
                break;
            case 16:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "SaleOrderExpectedDeliveryDateFrom";
                break;
            case 17:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "SaleOrderExpectedDeliveryDateTo";
                break;
            case 18:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "SaleOrderUtmostDeliveryDateFrom";
                break;
            case 19:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "SaleOrderUtmostDeliveryDateTo";
                break;
            case 20:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateFrom";
                break;
            case 21:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "CreatedDateTo";
                break;
            case 22:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "SaleOrderClassId";
                break;
            case 23:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsIncludeEmptyExpectedDeliveryDate";
                break;
            case 24:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "IsIncludeEmptyUtmostDeliveryDate";
                break;
            case 25:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "IsShowOpenSaleOrdersOnly";
                break;
            case 26:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ScannerIdOrUnassignedOnly";
                break;
            case 27:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ParcelServiceOnly";
                break;
            case 28:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ParcelAnnouncedOnly";
                break;
            case 29:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "IsCancelledOnly";
                break;
            case 30:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "OnlyReservationsOfSaleOrdersWithDebtors";
                break;
            case 31:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PendingPrepaymentRequestsOnly";
                break;
            case 32:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "OnlyPaidInFull";
                break;
            case 33:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "FullyNotified";
                break;
            case 34:
                info.type = Long.class;
                info.name = "ConversionId";
                break;*/
        }
    }
    
//    @Override //    public String getInnerText() { //        return null; //    } // // //    @Override //    public void setInnerText(String s) { //    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
