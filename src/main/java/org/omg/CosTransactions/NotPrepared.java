package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/NotPrepared.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public final class NotPrepared extends org.omg.CORBA.UserException
{

  public NotPrepared ()
  {
    super(NotPreparedHelper.id());
  } // ctor


  public NotPrepared (String $reason)
  {
    super(NotPreparedHelper.id() + "  " + $reason);
  } // ctor

} // class NotPrepared