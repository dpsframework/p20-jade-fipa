package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdAssignmentPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/poa.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
         * IdAssignmentPolicy specifies whether Object Ids in 
         * the created POA are generated by the application or 
         * by the ORB. The default is SYSTEM_ID.
         */
public interface IdAssignmentPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
           * specifies the policy value
           */
  org.omg.PortableServer.IdAssignmentPolicyValue value ();
} // interface IdAssignmentPolicyOperations