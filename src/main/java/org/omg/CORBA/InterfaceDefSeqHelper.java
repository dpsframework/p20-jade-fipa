package org.omg.CORBA;


/**
* org/omg/CORBA/InterfaceDefSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class InterfaceDefSeqHelper
{
  private static String  _id = "IDL:omg.org/CORBA/InterfaceDefSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.InterfaceDef[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.InterfaceDef[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.InterfaceDefHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.CORBA.InterfaceDefSeqHelper.id (), "InterfaceDefSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.InterfaceDef[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.CORBA.InterfaceDef value[] = null;
    int _len0 = istream.read_long ();
    value = new org.omg.CORBA.InterfaceDef[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.omg.CORBA.InterfaceDefHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.InterfaceDef[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.omg.CORBA.InterfaceDefHelper.write (ostream, value[_i0]);
  }

}
