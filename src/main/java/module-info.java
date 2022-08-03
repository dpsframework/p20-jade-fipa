/**
 * JADE Revision 6868 version 4.5.4. by, Enrico Scagliotti and Giovanni Caire.
 * Source:   https://jade.tilab.com/svn/jade/trunk
 * Revision: 6868
 * Author: caire
 * Date: jueves, 14 de julio de 2022 11:06:20
 * Message: Properly logged the stack-trace when an unexpected error occurs creating an agent.
 * Modified : /trunk/src/jade/core/management/AgentManagementService.java
 * ---
 * Revision: 6867
 * Author: scagliotti
 * Date: viernes, 29 de abril de 2022 12:07:55
 * Message: Upgraded version to 4.5.4
 * Modified : /trunk/build.properties
 * ---
 * This proposal: P20-JADE-FIPA    https://dpsframework.org/proposals/P20-JADE-FIPA_en.html
 * Source at:     GitHub           https://github.com/dpsframework/p20-jade-fipa
 * Commons-Codec: https://archive.apache.org/dist/commons/codec/binaries/commons-codec-1.3.tar.gz
 *            
 */
module com.tilab.jade {
	exports jade;
    
    
	requires java.logging;
	requires java.desktop;
	requires java.rmi;
	requires java.management;
	requires java.sql;
	requires java.net.http;
}
