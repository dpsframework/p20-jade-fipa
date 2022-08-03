package org.omg.PortableServer;

/**
* org/omg/PortableServer/ServantLocatorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * When the POA has the NON_RETAIN policy it uses servant 
         * managers that are ServantLocators. Because the POA 
         * knows that the servant returned by this servant 
         * manager will be used only for a single request, 
         * it can supply extra information to the servant 
         * manager's operations and the servant manager's pair 
         * of operations may be able to cooperate to do 
         * something different than a ServantActivator. 
         * When the POA uses the ServantLocator interface, 
         * immediately after performing the operation invocation 
         * on the servant returned by preinvoke, the POA will 
         * invoke postinvoke on the servant manager, passing the 
         * ObjectId value and the Servant value as parameters 
         * (among others). This feature may be used to force 
         * every request for objects associated with a POA to 
         * be mediated by the servant manager.
         */
public final class ServantLocatorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableServer.ServantLocator value = null;

  public ServantLocatorHolder ()
  {
  }

  public ServantLocatorHolder (org.omg.PortableServer.ServantLocator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableServer.ServantLocatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableServer.ServantLocatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableServer.ServantLocatorHelper.type ();
  }

}