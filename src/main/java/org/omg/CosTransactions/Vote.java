package org.omg.CosTransactions;


/**
* org/omg/CosTransactions/Vote.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/CosTransactions.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class Vote implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static org.omg.CosTransactions.Vote[] __array = new org.omg.CosTransactions.Vote [__size];

  public static final int _VoteCommit = 0;
  public static final org.omg.CosTransactions.Vote VoteCommit = new org.omg.CosTransactions.Vote(_VoteCommit);
  public static final int _VoteRollback = 1;
  public static final org.omg.CosTransactions.Vote VoteRollback = new org.omg.CosTransactions.Vote(_VoteRollback);
  public static final int _VoteReadOnly = 2;
  public static final org.omg.CosTransactions.Vote VoteReadOnly = new org.omg.CosTransactions.Vote(_VoteReadOnly);

  public int value ()
  {
    return __value;
  }

  public static org.omg.CosTransactions.Vote from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Vote (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Vote