package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 8/17/2017 7:04:46 AM
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

public class AddressInfo implements KvmSerializable {

    public int customerId;
    public WS_Enums.AddressType2 addressType;
    public String street;
    public String address;
    public String zipCode;
    public String city;
    public int countryId;
    public int itemId;
    public int numberPart1;
    public String numberPart2;

    public AddressInfo() {
    }

    public AddressInfo(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("CustomerId")) {
            Object obj = soapObject.getProperty("CustomerId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                customerId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                customerId = (Integer) obj;
            }
        }

        if (soapObject.hasProperty("AddressType")) {
            Object obj = soapObject.getProperty("AddressType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                addressType = WS_Enums.AddressType2.fromString(j.toString());
            }
        }
        if (soapObject.hasProperty("Street")) {
            Object obj = soapObject.getProperty("Street");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                street = j.toString();
            } else if (obj != null && obj instanceof String) {
                street = (String) obj;
            }
        }
        if (soapObject.hasProperty("NumberPart1")) {
            java.lang.Object obj = soapObject.getProperty("NumberPart1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                numberPart1 = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                numberPart1 = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("Address")) {
            Object obj = soapObject.getProperty("Address");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                address = j.toString();
            } else if (obj != null && obj instanceof String) {
                address = (String) obj;
            }
        }

        if (soapObject.hasProperty("ZipCode")) {
            Object obj = soapObject.getProperty("ZipCode");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                zipCode = j.toString();
            } else if (obj != null && obj instanceof String) {
                zipCode = (String) obj;
            }
        }
        if (soapObject.hasProperty("City")) {
            Object obj = soapObject.getProperty("City");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                city = j.toString();
            } else if (obj != null && obj instanceof String) {
                city = (String) obj;
            }
        }
        if (soapObject.hasProperty("CountryId")) {
            Object obj = soapObject.getProperty("CountryId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                countryId = Integer.parseInt(j.toString());
            } else if (obj != null && obj instanceof Number) {
                countryId = (Integer) obj;
            }
        }

        if (soapObject.hasProperty("NumberPart2")) {
            java.lang.Object obj = soapObject.getProperty("NumberPart2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                SoapPrimitive j = (SoapPrimitive) obj;
                numberPart2 = j.toString();
            } else if (obj != null && obj instanceof String) {
                numberPart2 = (String) obj;
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
                return customerId;
            case 1:
                return addressType.toString();
            case 2:
                return street;
            case 3:
                return address;
            case 4:
                return zipCode;
            case 5:
                return city;
            case 6:
                return countryId;
            case 7:
                return itemId;
            case 8:
                return numberPart1;
            case 9:
                return numberPart2;
        }
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 10;
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch (index) {
            case 0:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CustomerId";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "AddressType";
                break;
            case 2:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Street";
                break;
            case 3:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "Address";
                break;
            case 4:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "ZipCode";
                break;
            case 5:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "City";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "CountryId";
                break;
            case 7:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "ItemId";
                break;
            case 8:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "NumberPart1";
                break;
            case 9:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "NumberPart2";
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
