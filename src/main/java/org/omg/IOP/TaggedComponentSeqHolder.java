package org.omg.IOP;


/**
* org/omg/IOP/TaggedComponentSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/IOP.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * An array of <code>TaggedComponent</code> objects.
   */
public final class TaggedComponentSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedComponent value[] = null;

  public TaggedComponentSeqHolder ()
  {
  }

  public TaggedComponentSeqHolder (org.omg.IOP.TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedComponentSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedComponentSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedComponentSeqHelper.type ();
  }

}
