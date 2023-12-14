package org.farhan.mbt.conv.cucumber;

public class Temp {

/*
	private ArrayList<AbstractScenario> expandScenarios(EList<AbstractScenario> eList) {
		ArrayList<CucumberScenario> expandedScenarios = new ArrayList<CucumberScenario>();
		for (CucumberScenario s : aCucumberFile.theFeature.scenarios) {

			if (isScenarioSelected(s)) {
				appendBackground(s);
				if (s instanceof CucumberScenarioOutline) {
					// if it's an outline then loop through the examples
					ArrayList<String> examples = ((CucumberScenarioOutline) s).examples;
					for (int i = 1; i < examples.size(); i++) {
						CucumberScenario newScenario = applyAllExamples(s, examples.get(0), examples.get(i));
						expandedScenarios.add(newScenario);
					}
				} else {
					expandedScenarios.add(s);
				}
			}
		}
		return expandedScenarios;
	}

	private void appendBackground(CucumberScenario s) {

		CucumberScenario b = aCucumberFile.theFeature.background;
		if (!b.steps.isEmpty()) {
			s.comments = b.comments + "\n" + s.comments;
			s.description = b.description + "\n" + s.description;
			for (int i = b.steps.size() - 1; i >= 0; i--) {
				Step cs = b.steps.get(i);
				Step newCs = new Step();
				newCs.title = cs.title;
				newCs.data = cs.data;
				s.steps.add(0, newCs);
			}
		}
	}
	

	private CucumberScenario applyAllExamples(CucumberScenario s, String headers, String values) {
		// expand the example table
		CucumberScenario newScenario = new CucumberScenario();
		newScenario.tags = s.tags;
		newScenario.title = applyOneExample(s.title, headers, values);
		newScenario.comments = applyOneExample(s.comments, headers, values);
		newScenario.description = applyOneExample(s.description, headers, values);
		for (Step cs : s.steps) {
			Step newCs = new Step();
			newCs.title = applyOneExample(cs.title, headers, values);
			for (String sd : cs.data) {
				newCs.data.add(applyOneExample(sd, headers, values));
			}
			newScenario.steps.add(newCs);
		}
		return newScenario;
	}

	private static String applyOneExample(String currentText, String headers, String values) {

		if (headers == null || values == null) {
			return currentText;
		}
		String[] headerList = headers.split("\\|");
		String[] valuesList = values.split("\\|");
		String newText = currentText;
		for (int i = 1; i < headerList.length; i++) {
			newText = newText.replace("<" + headerList[i].trim() + ">", valuesList[i].trim());
		}
		return newText;
	}
*/
}
