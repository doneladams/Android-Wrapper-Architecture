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
import org.ksoap2.serialization.SoapObject;

import java.util.Hashtable;
import java.util.Vector;

public class VectorViewLocationLevel3Info extends Vector<ViewLocationLevel3Info> implements KvmSerializable {
    
    
    public VectorViewLocationLevel3Info(){}
    
    public VectorViewLocationLevel3Info(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject != null){
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0<size;i0++){
                Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj.getClass().equals(SoapObject.class)){
                    SoapObject j0 =(SoapObject) soapObject.getProperty(i0);
                    ViewLocationLevel3Info j1= new ViewLocationLevel3Info(j0);
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
        info.name = "ViewLocationLevel3Info";
        info.type = ViewLocationLevel3Info.class;
    }
    
//    @Override //    public String getInnerText() { //        return null; //    } // // //    @Override //    public void setInnerText(String s) { //    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
