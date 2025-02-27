package org.farhan.mbt.asciidoctor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.SaveOptions;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.SheepDogFactory;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepObject;
import org.farhan.mbt.sheepDog.StepParameters;

public class AsciiDoctorStepObject implements ConvertibleObject {

	private StepObject theStepObject;
	private String thePath;

	public AsciiDoctorStepObject(String thePath) {
		this.thePath = thePath;
		String[] pathParts = thePath.split("/");
		String name = pathParts[pathParts.length - 1].replace(".asciidoc", "");
		theStepObject = SheepDogFactory.eINSTANCE.createStepObject();
		theStepObject.setName(name);
	}

	private String convertStatementsToString(EList<Statement> statements) {
		String contents = "";
		for (Statement s : statements) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}

	public StepDefinition createStepDefinition(String stepDefinitionName) {
		deleteStepDefinition(stepDefinitionName);
		StepDefinition stepDefinition = SheepDogFactory.eINSTANCE.createStepDefinition();
		stepDefinition.setName(stepDefinitionName);
		theStepObject.getStepDefinitions().add(stepDefinition);
		return stepDefinition;
	}

	public StepParameters createStepParameters(StepDefinition stepDefinition, String stepParametersName) {
		StepParameters stepParameters = SheepDogFactory.eINSTANCE.createStepParameters();
		stepParameters.setName(stepParametersName);
		stepDefinition.getStepParameters().add(stepParameters);
		return stepParameters;
	}

	public void createStepParametersRow(StepParameters stepParameters, ArrayList<String> stepParametersRow) {
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : stepParametersRow) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		stepParameters.getParametersTable().getRows().add(row);
	}

	public void createStepParametersTable(StepParameters stepParameters, ArrayList<String> headers) {
		stepParameters.setParametersTable(SheepDogFactory.eINSTANCE.createTable());
		Row row = SheepDogFactory.eINSTANCE.createRow();
		for (String srcCell : headers) {
			Cell cell = SheepDogFactory.eINSTANCE.createCell();
			cell.setName(srcCell);
			row.getCells().add(cell);
		}
		stepParameters.getParametersTable().getRows().add(row);
	}

	private void deleteStepDefinition(String name) {
		EList<StepDefinition> list = theStepObject.getStepDefinitions();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contentEquals(name)) {
				list.remove(i);
				return;
			}
		}
	}

	@Override
	public Object get() {
		return theStepObject;
	}

	@Override
	public String getPath() {
		return thePath;
	}

	public String getStepDefinitionDescription(StepDefinition stepDefinitionSrc) {
		return convertStatementsToString(stepDefinitionSrc.getStatements());
	}

	public EList<StepDefinition> getStepDefinitionList() {
		return theStepObject.getStepDefinitions();
	}

	public String getStepDefinitionName(StepDefinition stepDefinitionSrc) {
		return stepDefinitionSrc.getName();
	}

	public String getStepObjectDescription() {
		return convertStatementsToString(theStepObject.getStatements());
	}

	public String getStepObjectName() {
		return theStepObject.getName();
	}

	public EList<StepParameters> getStepParametersList(StepDefinition stepDefinitionSrc) {
		return stepDefinitionSrc.getStepParameters();
	}

	public String getStepParametersName(StepParameters stepParametersSrc) {
		return stepParametersSrc.getName();
	}

	public ArrayList<String> getStepParametersRow(StepParameters stepParametersSrc, Row parametersRow) {
		ArrayList<String> row = new ArrayList<String>();
		EList<Cell> header = stepParametersSrc.getParametersTable().getRows().getFirst().getCells();
		for (int i = 0; i < header.size(); i++) {
			row.add(parametersRow.getCells().get(i).getName());
		}
		return row;
	}

	public ArrayList<Row> getStepParametersRowList(StepParameters stepParametersSrc) {
		ArrayList<Row> body = new ArrayList<Row>();
		body.addAll(stepParametersSrc.getParametersTable().getRows());
		body.remove(0);
		return body;
	}

	public ArrayList<String> getStepParametersTable(StepParameters stepParametersSrc) {
		ArrayList<String> header = new ArrayList<String>();
		for (Cell c : stepParametersSrc.getParametersTable().getRows().getFirst().getCells()) {
			header.add(c.getName());
		}
		return header;
	}

	@Override
	public void parse(String text) throws Exception {
		try {
			if (text.isEmpty()) {
				return;
			}
			URI uri = URI.createFileURI(thePath);
			Resource resource = new ResourceSetImpl().createResource(uri);
			InputStream content = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
			resource.load(content, Collections.EMPTY_MAP);
			theStepObject = (StepObject) resource.getContents().get(0);
		} catch (Exception e) {
			throw new Exception("There was a problem parsing file: " + thePath);
		}
	}

	public void setStepDefinitionDescription(StepDefinition stepDefinition, String stepDefinitionDescription) {
		if (!stepDefinitionDescription.isEmpty()) {
			for (String line : stepDefinitionDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				statement.setName(line);
				stepDefinition.getStatements().add(statement);
			}
		}
	}

	public void setStepObjectDescription(String stepObjectDescription) {
		if (!stepObjectDescription.isEmpty()) {
			theStepObject.getStatements().clear();
			for (String line : stepObjectDescription.split("\n")) {
				Statement statement = SheepDogFactory.eINSTANCE.createStatement();
				statement.setName(line);
				theStepObject.getStatements().add(statement);
			}
		}
	}

	public void setStepObjectName(String stepObjectName) {
		theStepObject.setName(stepObjectName);
	}

	public String toString() {
		URI uri = URI.createFileURI(thePath);
		Resource resource = new ResourceSetImpl().createResource(uri);
		resource.getContents().add(theStepObject);
		Map<Object, Object> options = SaveOptions.newBuilder().format().getOptions().toOptionsMap();
		OutputStream os = new ByteArrayOutputStream();
		try {
			resource.save(os, options);
		} catch (IOException e) {
			return null;
		}
		return os.toString();
	}

	public String getStepDefinitionNameLong(StepDefinition stepDefinitionSrc) {
		String noRoot = getPath().replaceFirst("^src/test/resources/asciidoc/stepdefs/", "");
		String component = noRoot.split("/")[0];
		String object = noRoot.replaceFirst("^" + component + "/", "").replaceFirst(".asciidoc$", "");
		return "The " + component + ", " + object + " " + stepDefinitionSrc.getName();
	}

}
