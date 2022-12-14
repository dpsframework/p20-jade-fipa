package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ClientRequestInfoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Interceptors.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
   * Request Information, accessible to client-side request interceptors.
   * <p>
   * Some attributes and operations on <code>ClientRequestInfo</code> are 
   * not valid at all interception points.  The following table shows the 
   * validity of each attribute or operation.  If it is not valid, attempting 
   * to access it will result in a <code>BAD_INV_ORDER</code> being thrown
   * with a standard minor code of 14.
   * <p>
   * <table border>
   *   <thead>
   *     <tr>
   *       <td>&nbsp;</td>
   *       <td><b>send_request</b></td>
   *       <td><b>send_poll</b></td>
   *       <td><b>receive_reply</b></td>
   *       <td><b>receive_exception</b></td>
   *       <td><b>receive_other</b></td>
   *     </tr>
   *   </thead>
   *  <tbody>
   * 
   *    <tr>
   *      <td colspan=6><i>Inherited from RequestInfo:</i></td>
   *    </tr>
   * 
   *    <tr><td><b>request_id</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>operation</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>arguments</b></td>
   *    <td>yes<sub>1</sub></td> 
   *            <td>no </td> <td>yes</td> <td>no </td> <td>no </td></tr>
   * 
   *    <tr><td><b>exceptions</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>contexts</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>operation_context</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>result</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>no </td> <td>no </td></tr>
   * 
   *    <tr><td><b>response_expected</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>sync_scope</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>reply_status</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>forward_reference</b></td>
   *    <td>no </td> <td>no </td> <td>no </td> <td>no </td> <td>yes<sub>2</sub>
   *                                                            </td></tr>
   * 
   *    <tr><td><b>get_slot</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_request_service_context</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_reply_service_context</b></td>
   *    <td>no </td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr>
   *      <td colspan=6><i>ClientRequestInfo-specific:</i></td>
   *    </tr>
   * 
   *    <tr><td><b>target</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>effective_target</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>effective_profile</b></td>
   *    <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>received_exception</b></td>
   *    <td>no </td> <td>no </td> <td>no </td> <td>yes</td> <td>no </td></tr>
   * 
   *    <tr><td><b>received_exception_id</b></td>
   *    <td>no </td> <td>no </td> <td>no </td> <td>yes</td> <td>no </td></tr>
   * 
   *    <tr><td><b>get_effective_component</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_effective_components</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>get_request_policy</b></td>
   *    <td>yes</td> <td>no </td> <td>yes</td> <td>yes</td> <td>yes</td></tr>
   * 
   *    <tr><td><b>add_request_service_context</b></td>
   *    <td>yes</td> <td>no </td> <td>no </td> <td>no </td> <td>no </td></tr>
   * 
   *   </tbody>
   * </table>
   * <ol>
   *   <li>When <code>ClientRequestInfo</code> is passed to 
   *       <code>send_request</code>, there is an entry in the list for every 
   *       argument, whether in, inout, or out.  But only the in and inout 
   *       arguments will be available.</li>
   *   <li>If the <code>reply_status</code> atribute is not 
   *       <code>LOCATION_FORWARD</code>, accessing this attribute will 
   *       throw <code>BAD_INV_ORDER</code> with a standard minor code of 
   *       14.</li>
   * </ol>
   *
   * @see ClientRequestInterceptor
   */
public interface ClientRequestInfoOperations  extends org.omg.PortableInterceptor.RequestInfoOperations
{

  /**
       * Returns the object which the client called to perform the 
       * operation. 
       *
       * @see #effective_target
       */
  org.omg.CORBA.Object target ();

  /**
       * Returns the actual object on which the operation will be invoked. 
       * If the <code>reply_status</code> is <code>LOCATION_FORWARD</code>, 
       * then on subsequent requests, <code>effective_target</code> will 
       * contain the forwarded IOR while target will remain unchanged. 
       *
       * @see #target
       */
  org.omg.CORBA.Object effective_target ();

  /**
       * Returns the profile that will be used to send the request. If a 
       * location forward has occurred for this operation's object and 
       * that object's profile changed accordingly, then this profile will 
       * be that located profile.
       */
  org.omg.IOP.TaggedProfile effective_profile ();

  /** 
       * Returns an any which contains the exception to be returned to 
       * the client. 
       * <p>
       * If the exception is a user exception which cannot be inserted 
       * into an any (e.g., it is unknown or the bindings don t provide 
       * the <code>TypeCode</code>), then this attribute will be an any 
       * containing the system exception <code>UNKNOWN</code> with a 
       * standard minor code of 1. However, the repository id of 
       * the exception is available in the <code>received_exception_id</code> 
       * attribute.
       * 
       * @see #received_exception_id
       */
  org.omg.CORBA.Any received_exception ();

  /**
       * Returns the repository id of the exception to be returned to 
       * the client.
       *
       * @see #received_exception
       * @see <a href="package-summary.html#unimpl">
       *     <code>PortableInterceptor</code> package comments for 
       *     limitations / unimplemented features</a>
       */
  String received_exception_id ();

  /** 
       * Returns the <code>IOP.TaggedComponent</code> with the given ID from 
       * the profile selected for this request. 
       * <p>
       * If there is more than one component for a given component ID, it 
       * is undefined which component this operation returns. If there is 
       * more than one component for a given component ID, 
       * <code>get_effective_components</code> should be called instead. 
       * 
       * @param id The component id of the component which 
       *     is to be returned. 
       * @return The <code>IOP.TaggedComponent</code> obtained with the 
       *     given identifier.
       * @exception BAD_PARAM thrown, with a standard minor code of 28, if
       *     no component exists for the given component ID.
       * @see #get_effective_components
       */
  org.omg.IOP.TaggedComponent get_effective_component (int id);

  /**
       * Returns an array of all tagged components with the given ID from the 
       * profile selected for this request. 
       * 
       * @param id The component id of the components which are to be returned. 
       * @return An array of <code>TaggedComponent</code> objects, each of 
       *     which contains the given identifier.
       * @exception BAD_PARAM thrown, with a standard minor code of 28, if
       *     no component exists for the given component ID.
       * @see #get_effective_component
       */
  org.omg.IOP.TaggedComponent[] get_effective_components (int id);

  /**
       * Returns the given policy in effect for this operation. 
       * 
       * @exception INV_POLICY thrown, with a standard minor code of 1, if the 
       *     policy type is not valid either because the specified type is 
       *     not supported by this ORB or because a policy object of that type 
       *     is not associated with this Object
       * @param type The policy type which specifies the policy to be 
       *     returned. 
       * @return The <code>CORBA.Policy</code> obtained with the given type.
       * @see <a href="package-summary.html#unimpl">
       *     <code>PortableInterceptor</code> package comments for 
       *     limitations / unimplemented features</a>
       */
  org.omg.CORBA.Policy get_request_policy (int type);

  /** 
       * Allows Interceptors to add service contexts to the request. 
       * <p>
       * There is no declaration of the order of the service contexts. 
       * They may or may not appear in the order that they are added. 
       *
       * @param service_context The <code>IOP.ServiceContext</code> to be 
       *     added to the request. 
       * @param replace Indicates the behavior of this operation when a 
       *     service context already exists with the given ID. If false, 
       *     then <code>BAD_INV_ORDER</code> with a standard minor code of 15 
       *     is thrown. If true, then the existing service context is 
       *     replaced by the new one.
       */
  void add_request_service_context (org.omg.IOP.ServiceContext service_context, boolean replace);
} // interface ClientRequestInfoOperations
