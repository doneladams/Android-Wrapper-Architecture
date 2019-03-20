package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 9/8/2017 11:59:10 AM
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

public class PrintersFilter implements KvmSerializable {
    
    public int itemId;
    public int storeId;
    public WS_Enums.PrinterOutputType printerOutputType;
    public String description;
    public String computerName;
    public WS_Enums.ThermalPrinterDestinationType thermalPrinterDestinationType;
    public WS_Enums.BooleanFilter posPrintersOnly;
    
    public PrintersFilter(){}
    
    public PrintersFilter(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ItemId"))
        {
            Object obj = soapObject.getProperty("ItemId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                itemId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                itemId = (Integer) obj;
            }
        }
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
        if (soapObject.hasProperty("PrinterOutputType"))
        {
            Object obj = soapObject.getProperty("PrinterOutputType");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                printerOutputType = WS_Enums.PrinterOutputType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("Description"))
        {
            Object obj = soapObject.getProperty("Description");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                description = j.toString();
            }else if (obj!= null && obj instanceof String){
                description = (String) obj;
            }
        }
        if (soapObject.hasProperty("ComputerName"))
        {
            Object obj = soapObject.getProperty("ComputerName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                computerName = j.toString();
            }else if (obj!= null && obj instanceof String){
                computerName = (String) obj;
            }
        }
        if (soapObject.hasProperty("ThermalPrinterDestinationType"))
        {
            Object obj = soapObject.getProperty("ThermalPrinterDestinationType");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                thermalPrinterDestinationType = WS_Enums.ThermalPrinterDestinationType.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("PosPrintersOnly"))
        {
            Object obj = soapObject.getProperty("PosPrintersOnly");
            if (obj!= null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive)obj;
                posPrintersOnly = WS_Enums.BooleanFilter.fromString(j.toString());
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return itemId;
            case 1:
                return storeId;
            case 2:
                return printerOutputType.toString();
            case 3:
                return description;
            case 4:
                return computerName;
            case 5:
                return thermalPrinterDestinationType.toString();
            case 6:
                return posPrintersOnly.toString();
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 7;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
            case 1:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "StoreId";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PrinterOutputType";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Description";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ComputerName";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ThermalPrinterDestinationType";
                break;
            case 6:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "PosPrintersOnly";
                break;
        }
    }
    
    //    @Override
//    public String getInnerText() {
//        return null;
//    }
//
//
//    @Override
//    public void setInnerText(String s) {
//    }
    
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}