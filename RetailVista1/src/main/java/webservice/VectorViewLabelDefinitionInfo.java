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
import org.ksoap2.serialization.SoapObject;

import java.util.Hashtable;
import java.util.Vector;

public class VectorViewLabelDefinitionInfo extends Vector<ViewLabelDefinitionInfo> implements KvmSerializable {
    
    
    public VectorViewLabelDefinitionInfo(){}
    
    public VectorViewLabelDefinitionInfo(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    ViewLabelDefinitionInfo j1= new ViewLabelDefinitionInfo(j0);
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
        info.name = "ViewLabelDefinitionInfo";
        info.type = ViewLabelDefinitionInfo.class;
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
