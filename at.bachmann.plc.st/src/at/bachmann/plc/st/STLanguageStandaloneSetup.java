/*
* generated by Xtext
*/
package at.bachmann.plc.st;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class STLanguageStandaloneSetup extends STLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new STLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

