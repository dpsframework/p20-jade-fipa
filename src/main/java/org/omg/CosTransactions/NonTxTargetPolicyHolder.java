package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/NonTxTargetPolicyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class NonTxTargetPolicyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.NonTxTargetPolicy value = null;

  public NonTxTargetPolicyHolder ()
  {
  }

  public NonTxTargetPolicyHolder (org.omg.CosTransactions.NonTxTargetPolicy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.NonTxTargetPolicyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.NonTxTargetPolicyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.NonTxTargetPolicyHelper.type ();
  }

}