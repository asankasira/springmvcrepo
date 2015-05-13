/**
 * 
 */
package com.asanka.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author Asanka Siriwardena
 *
 */
public class StudentNameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String studentName){
		
		if(!studentName.toLowerCase().contains("mr.") && !studentName.toLowerCase().contains("ms.")){
			studentName = "Ms. " + studentName;
		}
		
		setValue(studentName);
	}
}
