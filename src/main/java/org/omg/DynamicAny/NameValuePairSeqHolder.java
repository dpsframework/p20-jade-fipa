package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameValuePairSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class NameValuePairSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.DynamicAny.NameValuePair value[] = null;

  public NameValuePairSeqHolder ()
  {
  }

  public NameValuePairSeqHolder (org.omg.DynamicAny.NameValuePair[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.DynamicAny.NameValuePairSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.DynamicAny.NameValuePairSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.DynamicAny.NameValuePairSeqHelper.type ();
  }

}
