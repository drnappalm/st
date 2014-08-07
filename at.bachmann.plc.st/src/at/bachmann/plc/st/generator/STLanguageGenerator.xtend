/*
 * generated by Xtext
 */
package at.bachmann.plc.st.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.bachmann.plc.st.stLanguage.Prog_Decl
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import at.bachmann.plc.st.stLanguage.POU_Decl
import org.eclipse.xtext.nodemodel.serialization.SerializationUtil
import org.eclipse.xtext.resource.XtextResource

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class STLanguageGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.forEach[
			it.generatePOU(fsa)
		]
	}

	def generatePOU(EObject pou, IFileSystemAccess fsa) {
		var name = ''
		
		switch pou {
			Prog_Decl: {
				name = pou.program.name
			}
		}
		
		fsa.generateFile('''«name».pou.xml''', getPouXML(name, pou))
	}

	def getPouXML(String pouName, EObject pou) {
		'''<?xml version="1.0" encoding="ISO-8859-1"?>
		<pou>
			<path/>
			<name>«pouName»</name>
			<flags>2048</flags>
			<interface>
				<![CDATA[PROGRAM PLC_PRG
					«getXML(pou)»]]>
			</interface>
			<st>
				<body>
					<![CDATA[]]>
				</body>
			</st>
		</pou>'''
	}
	
	def String getXML(EObject node) {
		if (node.eAllContents.empty) {
			NodeModelUtils.compactDump(NodeModelUtils.findActualNodeFor(node), true)
		} else {		
			'''«FOR content: node.eContents»«getXML(content)»«ENDFOR»'''	
		}		
	}
}
