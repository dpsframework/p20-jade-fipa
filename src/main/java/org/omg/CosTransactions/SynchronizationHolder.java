package org.omg.CosTransactions;

/**
* org/omg/CosTransactions/SynchronizationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// Inheritance from TransactionalObject is for backward compatability //
public final class SynchronizationHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosTransactions.Synchronization value = null;

  public SynchronizationHolder ()
  {
  }

  public SynchronizationHolder (org.omg.CosTransactions.Synchronization initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosTransactions.SynchronizationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosTransactions.SynchronizationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosTransactions.SynchronizationHelper.type ();
  }

}
