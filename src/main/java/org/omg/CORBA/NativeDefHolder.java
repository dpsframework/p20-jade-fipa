package org.omg.CORBA;

/**
* org/omg/CORBA/NativeDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// orbos 98-01-18: Objects By Value -- end
public final class NativeDefHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.NativeDef value = null;

  public NativeDefHolder ()
  {
  }

  public NativeDefHolder (org.omg.CORBA.NativeDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.NativeDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.NativeDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.NativeDefHelper.type ();
  }

}
