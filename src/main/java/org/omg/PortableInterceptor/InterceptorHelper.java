package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/InterceptorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * All Portable Interceptors implement Interceptor.
   */
abstract public class InterceptorHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/Interceptor:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.PortableInterceptor.Interceptor that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.PortableInterceptor.Interceptor extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.PortableInterceptor.InterceptorHelper.id (), "Interceptor");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.PortableInterceptor.Interceptor read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.PortableInterceptor.Interceptor value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static org.omg.PortableInterceptor.Interceptor narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.Interceptor)
      return (org.omg.PortableInterceptor.Interceptor)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  public static org.omg.PortableInterceptor.Interceptor unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.PortableInterceptor.Interceptor)
      return (org.omg.PortableInterceptor.Interceptor)obj;
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

}
