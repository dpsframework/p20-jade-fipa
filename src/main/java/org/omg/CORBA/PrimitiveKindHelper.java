package org.omg.CORBA;


/**
* org/omg/CORBA/PrimitiveKindHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class PrimitiveKindHelper
{
  private static String  _id = "IDL:omg.org/CORBA/PrimitiveKind:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.PrimitiveKind that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.PrimitiveKind extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (org.omg.CORBA.PrimitiveKindHelper.id (), "PrimitiveKind", new String[] { "pk_null", "pk_void", "pk_short", "pk_long", "pk_ushort", "pk_ulong", "pk_float", "pk_double", "pk_boolean", "pk_char", "pk_octet", "pk_any", "pk_TypeCode", "pk_Principal", "pk_string", "pk_objref"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.PrimitiveKind read (org.omg.CORBA.portable.InputStream istream)
  {
    return org.omg.CORBA.PrimitiveKind.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.PrimitiveKind value)
  {
    ostream.write_long (value.value ());
  }

}
