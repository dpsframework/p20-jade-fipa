package org.omg.PortableServer.POAManagerPackage;

/**
* org/omg/PortableServer/POAManagerPackage/AdapterInactiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class AdapterInactiveHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableServer.POAManagerPackage.AdapterInactive value = null;

  public AdapterInactiveHolder ()
  {
  }

  public AdapterInactiveHolder (org.omg.PortableServer.POAManagerPackage.AdapterInactive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableServer.POAManagerPackage.AdapterInactiveHelper.type ();
  }

}
