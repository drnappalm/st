/*
* generated by Xtext
*/
package at.bachmann.plc.st.ui.labeling

import com.google.inject.Inject
import at.bachmann.plc.st.stLanguage.Prog_Decl
import at.bachmann.plc.st.stLanguage.Func_Decl
import at.bachmann.plc.st.stLanguage.FB_Decl
import org.eclipse.emf.ecore.EObject
import at.bachmann.plc.st.stLanguage.Input_Decl
import at.bachmann.plc.st.stLanguage.Output_Decl
import at.bachmann.plc.st.stLanguage.In_Out_Decls
import at.bachmann.plc.st.stLanguage.Var_Decl_Init
import at.bachmann.plc.st.stLanguage.Variable
import at.bachmann.plc.st.stLanguage.In_Out_Var_Decl
import at.bachmann.plc.st.stLanguage.impl.VariableImpl
import at.bachmann.plc.st.stLanguage.Var_Decl
import at.bachmann.plc.st.stLanguage.Var_Decls
import at.bachmann.plc.st.stLanguage.Output_Decls
import at.bachmann.plc.st.stLanguage.Input_Decls
import at.bachmann.plc.st.stLanguage.Func_Var_Decls
import at.bachmann.plc.st.stLanguage.External_Var_Decls
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.StylerFactory
import at.bachmann.plc.st.stLanguage.Class_Decl
import at.bachmann.plc.st.stLanguage.Interface_Decl

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class STLanguageLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def dispatch text(Prog_Decl item) {
		item.program.name
	}
	
	def dispatch text(Func_Decl item) {
		item.function.name
	}
	
	def dispatch text(FB_Decl item) {
		item.functionblock.name
	}
	
	def dispatch text(Class_Decl item) {
		item.class_.name
	}
	
	def dispatch text(Interface_Decl item) {
		item.interface.name
	}
	
	def dispatch text(Variable item) {
		var dataType = ''
		var modifiers = ''
		
		val declaration = item.eContainer.eContainer		
		switch declaration {
			Var_Decl_Init:
				dataType = declaration.initialization.type
			Var_Decl:
				dataType = declaration.initialization
		}
		
		val declarationBlock = declaration.eContainer
		switch declarationBlock {
			Func_Var_Decls:
				modifiers = if (declarationBlock.constant) '(C)' else ''
				
		}
		
		'''«item.name» - «dataType» «modifiers»'''.toString
	}
	
	def dispatch text(EObject item) {
		super.text(item)
	}	

	def dispatch image(Prog_Decl item) {
		'program.png'
	}
	
	def dispatch image(Func_Decl item) {
		'function.png'
	}
	
	def dispatch image(FB_Decl item) {
		'functionblock.png'
	}
	
	def dispatch image(Class_Decl item) {
		'class.png'
	}
	
	def dispatch image(Interface_Decl item) {
		'interface.png'
	}
	
	def dispatch image(VariableImpl item) {
		switch item.eContainer.eContainer.eContainer {
			Var_Decls:
				'intern.png'
			Input_Decls:
				'input.png'
			Output_Decls:
				'output.png'
			In_Out_Decls:
				'inout.png'
		}
	}	
	
	def dispatch image(EObject item) {
		super.image(item)
	}
}
