package org.omg.Messaging;

/**
* org/omg/Messaging/MaxHopsPolicyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class MaxHopsPolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.Messaging.MaxHopsPolicy value = null;

  public MaxHopsPolicyHolder ()
  {
  }

  public MaxHopsPolicyHolder (org.omg.Messaging.MaxHopsPolicy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.Messaging.MaxHopsPolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.Messaging.MaxHopsPolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.Messaging.MaxHopsPolicyHelper.type ();
  }

}
