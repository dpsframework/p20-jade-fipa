package org.omg.IOP.CodecPackage;

/**
* org/omg/IOP/CodecPackage/TypeMismatchHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/IOP.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class TypeMismatchHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.CodecPackage.TypeMismatch value = null;

  public TypeMismatchHolder ()
  {
  }

  public TypeMismatchHolder (org.omg.IOP.CodecPackage.TypeMismatch initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.CodecPackage.TypeMismatchHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.CodecPackage.TypeMismatchHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.CodecPackage.TypeMismatchHelper.type ();
  }

}
