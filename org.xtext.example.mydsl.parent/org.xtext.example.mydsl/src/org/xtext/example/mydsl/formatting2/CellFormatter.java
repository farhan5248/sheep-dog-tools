package org.xtext.example.mydsl.formatting2;

import java.util.ArrayList;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;

public class CellFormatter extends ListFormatter {

	private static ArrayList<ArrayList<ISemanticRegion>> cells;

	// Put this here to avoid mixing up nested lists like rows and cells
	protected static boolean isLast;
	protected static boolean isFirst;
	protected static boolean isLastEOLDouble = true;

	public static void isLast(boolean isLast) {
		CellFormatter.isLast = isLast;
	}

	public static void isFirst(boolean isFirst) {
		CellFormatter.isFirst = isFirst;
	}

	public static void formatVerticalLineKeyword(ISemanticRegion iSR, IFormattableDocument doc) {
		doc.prepend(iSR, it -> it.noSpace());
		doc.append(iSR, it -> it.noSpace());

		if (isFirst) {
			// the first 4 spaces is to align with Given
			replace(doc, iSR, getIndent() + "    " + iSR.getText() + " ");
		} else {
			replace(doc, iSR, " " + iSR.getText() + " ");
		}
	}

	public static void formatNameRuleCall(ISemanticRegion iSR, IFormattableDocument doc) {
		if (isFirst) {
			if (RowFormatter.isFirst) {
				cells = new ArrayList<ArrayList<ISemanticRegion>>();
			}
			// add a new row of cells
			cells.add(new ArrayList<ISemanticRegion>());
		}
		// add iSR to last row of list of lists
		cells.get(cells.size() - 1).add(iSR);

		if (isLast && RowFormatter.isLast) {
			// check if it's the last row as well and if so
			formatAllCells(doc);
		}
	}

	private static void formatAllCells(IFormattableDocument doc) {
		// go through list of list of iSR. first get the number of columns
		// TODO this assumes that the table is valid, all rows have same number of cells
		for (int i = 0; i < cells.get(0).size(); i++) {
			ArrayList<ISemanticRegion> col = new ArrayList<ISemanticRegion>();
			int maxWidth = 0;
			for (int j = 0; j < cells.size(); j++) {
				// column by column using their indices
				// make a temp list of column cells and find max width while doing so
				ISemanticRegion tempISR = cells.get(j).get(i);
				col.add(tempISR);
				if (tempISR.getText().length() > maxWidth) {
					maxWidth = tempISR.getText().length();
				}
			}
			// go over temp list again with replacements.
			for (int k = 0; k < col.size(); k++) {

				doc.append(col.get(k), it -> it.noSpace());
				replace(doc, col.get(k), String.format("%1$" + maxWidth + "s", col.get(k).getText()));
			}
		}
	}

}
