package org.omg.CORBA;


/**
* org/omg/CORBA/AttributeMode.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class AttributeMode implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.CORBA.AttributeMode[] __array = new org.omg.CORBA.AttributeMode [__size];

  public static final int _ATTR_NORMAL = 0;
  public static final org.omg.CORBA.AttributeMode ATTR_NORMAL = new org.omg.CORBA.AttributeMode(_ATTR_NORMAL);
  public static final int _ATTR_READONLY = 1;
  public static final org.omg.CORBA.AttributeMode ATTR_READONLY = new org.omg.CORBA.AttributeMode(_ATTR_READONLY);

  public int value ()
  {
    return __value;
  }

  public static org.omg.CORBA.AttributeMode from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AttributeMode (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AttributeMode