package org.omg.PortableServer;


/**
* org/omg/PortableServer/AdapterActivator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * An adapter activator supplies a POA with the ability 
         * to create child POAs on demand, as a side-effect of 
         * receiving a request that names the child POA 
         * (or one of its children), or when find_POA is called 
         * with an activate parameter value of TRUE.
         */
public interface AdapterActivator extends AdapterActivatorOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface AdapterActivator
