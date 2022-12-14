package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynAnyFactoryPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
    * DynAny objects can be created by invoking operations on the DynAnyFactory object.
    * Generally there are only two ways to create a DynAny object:
    * <UL>
    * <LI>invoking an operation on an existing DynAny object
    * <LI>invoking an operation on a DynAnyFactory object
    * </UL>
    * A constructed DynAny object supports operations that enable the creation of new DynAny
    * objects encapsulating access to the value of some constituent.
    * DynAny objects also support the copy operation for creating new DynAny objects.
    * A reference to the DynAnyFactory object is obtained by calling ORB.resolve_initial_references()
    * with the identifier parameter set to the string constant "DynAnyFactory".
    * <P>Dynamic interpretation of an any usually involves creating a DynAny object using create_dyn_any()
    * as the first step. Depending on the type of the any, the resulting DynAny object reference can be narrowed
    * to a DynFixed, DynStruct, DynSequence, DynArray, DynUnion, DynEnum, or DynValue object reference.
    * <P>Dynamic creation of an any involves creating a DynAny object using create_dyn_any_from_type_code(),
    * passing the TypeCode associated with the value to be created. The returned reference is narrowed to one of
    * the complex types, such as DynStruct, if appropriate. Then, the value can be initialized by means of
    * invoking operations on the resulting object. Finally, the to_any operation can be invoked
    * to create an any value from the constructed DynAny.
    */
public abstract class DynAnyFactoryPOA extends org.omg.PortableServer.Servant
 implements org.omg.DynamicAny.DynAnyFactoryOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("create_dyn_any", new java.lang.Integer (0));
    _methods.put ("create_dyn_any_from_type_code", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    throw new org.omg.CORBA.BAD_OPERATION();
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DynamicAny/DynAnyFactory:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public DynAnyFactory _this() 
  {
    return DynAnyFactoryHelper.narrow(
    super._this_object());
  }

  public DynAnyFactory _this(org.omg.CORBA.ORB orb) 
  {
    return DynAnyFactoryHelper.narrow(
    super._this_object(orb));
  }


} // class DynAnyFactoryPOA
