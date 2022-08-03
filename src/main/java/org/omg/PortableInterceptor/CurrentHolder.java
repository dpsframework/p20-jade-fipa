package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/CurrentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Portable Interceptors Current (also known as <code>PICurrent</code>) 
   * is merely a slot table, the slots of which are used by each service to 
   * transfer their context data between their context and the request's or 
   * reply's service context. Each service which wishes to use PICurrent 
   * reserves a slot or slots at initialization time and uses those slots 
   * during the processing of requests and replies.
   * <p>
   * Before an invocation is made, PICurrent is obtained via a call to 
   * <code>ORB.resolve_initial_references( "PICurrent" )</code>. From within 
   * the interception points, the data on PICurrent that has moved from the 
   * thread scope to the request scope is available via the 
   * <code>get_slot</code> operation on the <code>RequestInfo</code> object. 
   * A PICurrent can still be obtained via 
   * <code>resolve_initial_references</code>, but that is the Interceptor's 
   * thread scope PICurrent.
   */
public final class CurrentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.Current value = null;

  public CurrentHolder ()
  {
  }

  public CurrentHolder (org.omg.PortableInterceptor.Current initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.CurrentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.CurrentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.CurrentHelper.type ();
  }

}
