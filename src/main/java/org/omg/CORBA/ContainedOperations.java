package org.omg.CORBA;


/**
* org/omg/CORBA/ContainedOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public interface ContainedOperations  extends org.omg.CORBA.IRObjectOperations
{

  // read/write interface
  String id ();

  // read/write interface
  void id (String newId);
  String name ();
  void name (String newName);
  String version ();
  void version (String newVersion);

  // read interface
  org.omg.CORBA.Container defined_in ();
  String absolute_name ();
  org.omg.CORBA.Repository containing_repository ();
  org.omg.CORBA.ContainedPackage.Description describe ();

  // write interface
  void move (org.omg.CORBA.Container new_container, String new_name, String new_version);
} // interface ContainedOperations