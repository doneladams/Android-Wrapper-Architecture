package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 9/27/2018 5:53:04 AM
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

public class GetStoreProductLocationsRequest implements KvmSerializable {
    
/*    public ProductsFilter productsFilter;
    public int skipItemId;
    public String orderBy;
    public int offset;
    public int recordCount;*/
    public StoreProductLocationsFilter filter;
  //  public int pagingTreshold;
    
    public GetStoreProductLocationsRequest(){}
    
    public GetStoreProductLocationsRequest(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
    /*    if (soapObject.hasProperty("ProductsFilter"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ProductsFilter");
            productsFilter =  new ProductsFilter (j);
            
        }
        if (soapObject.hasProperty("SkipItemId"))
        {
            Object obj = soapObject.getProperty("SkipItemId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                skipItemId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                skipItemId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("OrderBy"))
        {
            Object obj = soapObject.getProperty("OrderBy");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orderBy = j.toString();
            }else if (obj!= null && obj instanceof String){
                orderBy = (String) obj;
            }
        }
        if (soapObject.hasProperty("Offset"))
        {
            Object obj = soapObject.getProperty("Offset");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                offset = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                offset = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("RecordCount"))
        {
            Object obj = soapObject.getProperty("RecordCount");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                recordCount = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                recordCount = (Integer) obj;
            }
        }*/
        if (soapObject.hasProperty("Filter"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("Filter");
            filter =  new StoreProductLocationsFilter (j);
            
        }
/*        if (soapObject.hasProperty("PagingTreshold"))
        {
            Object obj = soapObject.getProperty("PagingTreshold");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                pagingTreshold = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                pagingTreshold = (Integer) obj;
            }
        }*/
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
           /* case 0:
                return productsFilter;
            case 1:
                return skipItemId;
            case 2:
                return orderBy;
            case 3:
                return offset;
            case 4:
                return recordCount;*/
            case 0:
                return filter;
 /*           case 6:
                return pagingTreshold;*/
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
 /*           case 0:
                info.type = ProductsFilter.class;
                info.name = "ProductsFilter";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "SkipItemId";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "OrderBy";
                break;
            case 3:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "Offset";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "RecordCount";
                break;*/
            case 0:
                info.type = StoreProductLocationsFilter.class;
                info.name = "Filter";
                break;
/*            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "PagingTreshold";
                break;*/
        }
    }
    

    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
