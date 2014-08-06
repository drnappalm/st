package at.bachmann.gef.sample.view

import org.eclipse.draw2d.LabeledContainer
import org.eclipse.draw2d.ToolbarLayout
import org.eclipse.draw2d.Figure
import org.eclipse.draw2d.TitleBarBorder

class FBFigure extends LabeledContainer {
	
	val contentPane = new Figure;
	
	new() {
		layoutManager = new ToolbarLayout()		
		contentPane.setLayoutManager(new ToolbarLayout);
		contentPane.setBorder(new TitleBarBorder("-Interface-"));
		add(contentPane);
	}
	
	def setName(String name) {
		setLabel(name)
	}
	
	def getContentPane() {
		contentPane
	}
}