package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/NotSubtransaction.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class NotSubtransaction extends org.omg.CORBA.UserException
{

  public NotSubtransaction ()
  {
    super(NotSubtransactionHelper.id());
  } // ctor


  public NotSubtransaction (String $reason)
  {
    super(NotSubtransactionHelper.id() + "  " + $reason);
  } // ctor

} // class NotSubtransaction
