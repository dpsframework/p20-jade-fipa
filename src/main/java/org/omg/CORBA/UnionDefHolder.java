package org.omg.CORBA;

/**
* org/omg/CORBA/UnionDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class UnionDefHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.UnionDef value = null;

  public UnionDefHolder ()
  {
  }

  public UnionDefHolder (org.omg.CORBA.UnionDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.UnionDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.UnionDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.UnionDefHelper.type ();
  }

}
