/*
* generated by Xtext
*/
package fr.istic.m2miage.idm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PollSystemStandaloneSetup extends PollSystemStandaloneSetupGenerated{

	public static void doSetup() {
		new PollSystemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

