package webservice;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 8/16/2017 5:54:08 AM
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

import java.util.Vector;

public class VectorViewClassificationLevel1Info extends Vector<ViewClassificationLevel1Info> implements KvmSerializable {


    public VectorViewClassificationLevel1Info() {
    }

    public VectorViewClassificationLevel1Info(SoapObject soapObject) {
        if (soapObject == null)
            return;
        if (soapObject != null) {
            int size = soapObject.getPropertyCount();
            for (int i0 = 0; i0 < size; i0++) {
                Object obj = soapObject.getProperty(i0);
                if (obj != null && obj.getClass().equals(SoapObject.class)) {
                    SoapObject j0 = (SoapObject) soapObject.getProperty(i0);
                    ViewClassificationLevel1Info j1 = new ViewClassificationLevel1Info(j0);
                    add(j1);
                }
            }
        }
    }

    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }

    @Override
    public int getPropertyCount() {
        return this.size();
    }

    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "ViewClassificationLevel1Info";
        info.type = ViewClassificationLevel1Info.class;
    }


    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}
