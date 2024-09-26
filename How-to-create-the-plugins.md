# Xtext plugin

## Use the new project wizard

You can follow the tutorial steps but if you want to just start coding to play around with this, I'd just do these steps first to make sure your initial setup with dependencies etc works fine before you change anything.

1. Select **File > New > Project > Xtext > Xtext Project > Next**.
3. Fill out the form as follows and then click **Next**
*  **Location** `My git repo`
*  **Project name** `sheepdogxtextcukeplugin`. It's whatever you want to call your Eclipse project. In the beginning this is also used as the Maven **artifactID** and **groupID**. Whatever you choose will have `parent` appended to it automatically.
*  **Name** `org.farhan.mbt.Cucumber`. It's your Maven **groupID** followed by your language name.
*  **Extensions** `feature`. is feature since I want to associate those files with this editor.
4. Select **Create Update Site** and set **Preferred Build System** to `Maven`

## Disable Maven nature

I don't know why this happens but at random times, Eclipse doesn't recognise some of the **sheepdogxtextcukeplugin/pom.xml** elements.
To workaround this for now, I just disable the Maven nature.

## Update the Maven groupID

In the **sheepdogxtextcukeplugin.parent** directory, update the **groupID** to `<groupId>org.farhan</groupId>`.

```
pom.xml
sheepdogxtextcukeplugin/pom.xml
sheepdogxtextcukeplugin.feature/pom.xml
sheepdogxtextcukeplugin.ide/pom.xml
sheepdogxtextcukeplugin.repository/pom.xml
sheepdogxtextcukeplugin.target/pom.xml
sheepdogxtextcukeplugin.tests/pom.xml
sheepdogxtextcukeplugin.ui/pom.xml
sheepdogxtextcukeplugin.ui.tests/pom.xml
```

## Update the target platform

1. Open the **sheepdogcukeplugin.parent/sheepdogcukeplugin.target/sheepdogcukeplugin.target.target** file.
2. Select the **https://download.eclipse.org/tools/orbit/simrel/orbit-aggregation/2024-09** link and click **Update**
3. Click the **Set as Active Target Platform** in the top right corner and then click **Reload TargetPlatform**. 

## Update the workflow file

Change or add these parameters. If you generate the artifacts before updating it, you'll have to manually clean out the **.xtend** files in the various directories. 

```
language = StandardLanguage {
	name = "org.farhan.mbt.Cucumber"
	fileExtensions = "feature"
	formatter = {
		generateStub = true
	}
	serializer = {
		generateStub = false
	}
	validator = {
		generateDeprecationValidation = true
	}
	generator = {
		generateXtendStub = false
		generateJavaMain = true
	}
	junitSupport = {
		junitVersion = "5"
		generateXtendStub = false
		skipXbaseTestingPackage = true
	}
}
```

## Generate artifacts

Right click the **sheepdogxtextcukeplugin/org/farhan/mbt/Cucumber.xtext** file and select **Run As > Generate Xtext Artifacts**. This is the output.

```
0    [main] INFO  text.xtext.generator.XtextGenerator  - Initializing Xtext generator
Sep 14, 2024 3:21:05 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addRegisterGeneratedEPackage
INFO: Adding generated EPackage 'org.eclipse.xtext.common.types.TypesPackage'
Sep 14, 2024 3:21:05 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addProjectMapping
INFO: Registering project sheepdogxtextcukeplugin at 'file:/C:/Users/Farhan/git/lean-sheep-dog-tools/sheepdogxtextcukeplugin.parent/sheepdogxtextcukeplugin/'
Sep 14, 2024 3:21:05 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addProjectMapping
INFO: Registering project sheepdogxtextcukeplugin.tests at 'file:/C:/Users/Farhan/git/lean-sheep-dog-tools/sheepdogxtextcukeplugin.parent/sheepdogxtextcukeplugin.tests/'
Sep 14, 2024 3:21:05 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addProjectMapping
INFO: Registering project sheepdogxtextcukeplugin.ide at 'file:/C:/Users/Farhan/git/lean-sheep-dog-tools/sheepdogxtextcukeplugin.parent/sheepdogxtextcukeplugin.ide/'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addProjectMapping
INFO: Registering project sheepdogxtextcukeplugin.ui at 'file:/C:/Users/Farhan/git/lean-sheep-dog-tools/sheepdogxtextcukeplugin.parent/sheepdogxtextcukeplugin.ui/'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup addProjectMapping
INFO: Registering project sheepdogxtextcukeplugin.ui.tests at 'file:/C:/Users/Farhan/git/lean-sheep-dog-tools/sheepdogxtextcukeplugin.parent/sheepdogxtextcukeplugin.ui.tests/'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.StandaloneSetup setResourceSet
INFO: Using resourceSet registry. The registered Packages will not be registered in the global EPackage.Registry.INSTANCE!
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.GenModelHelper registerGenModel
INFO: Registered GenModel 'http://www.eclipse.org/Xtext/Xbase/XAnnotations' from 'platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.GenModelHelper registerGenModel
INFO: Registered GenModel 'http://www.eclipse.org/xtext/xbase/Xtype' from 'platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.GenModelHelper registerGenModel
INFO: Registered GenModel 'http://www.eclipse.org/xtext/xbase/Xbase' from 'platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel'
Sep 14, 2024 3:21:06 P.M. org.eclipse.emf.mwe.utils.GenModelHelper registerGenModel
INFO: Registered GenModel 'http://www.eclipse.org/xtext/common/JavaVMTypes' from 'platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.genmodel'
404  [main] INFO  erator.parser.antlr.AntlrToolFacade  - Downloading file from 'https://download.itemis.com/antlr-generator-3.2.0-patch.jar' ...
2497 [main] INFO  erator.parser.antlr.AntlrToolFacade  - Finished downloading.
2508 [main] INFO  text.xtext.generator.XtextGenerator  - Generating org.farhan.mbt.Cucumber
2577 [main] INFO  nerator.ecore.EMFGeneratorFragment2  - Generating EMF model code
Sep 14, 2024 3:21:08 P.M. org.eclipse.emf.mwe.utils.GenModelHelper registerGenModel
INFO: Registered GenModel 'http://www.farhan.org/mbt/Cucumber' from 'platform:/resource/sheepdogxtextcukeplugin/model/generated/Cucumber.genmodel'
3405 [main] INFO  text.xtext.generator.XtextGenerator  - Generating common infrastructure
3437 [main] INFO  .emf.mwe2.runtime.workflow.Workflow  - Done.
```

Right click the **sheepdogcukeplugin.parent** directory and select **Show in local terminal**. Run `mvn clean generate-sources`. This is the output.

```
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for sheepdogxtextcukeplugin.parent 1.0.0-SNAPSHOT:
[INFO]
[INFO] sheepdogxtextcukeplugin.parent ..................... SUCCESS [  0.082 s]
[INFO] sheepdogxtextcukeplugin ............................ SUCCESS [  8.982 s]
[INFO] sheepdogxtextcukeplugin.ide ........................ SUCCESS [  0.593 s]
[INFO] sheepdogxtextcukeplugin.ui ......................... SUCCESS [  1.173 s]
[INFO] sheepdogxtextcukeplugin.target ..................... SUCCESS [  0.004 s]
[INFO] sheepdogxtextcukeplugin.feature .................... SUCCESS [  0.015 s]
[INFO] sheepdogxtextcukeplugin.repository ................. SUCCESS [  0.010 s]
[INFO] sheepdogxtextcukeplugin.tests ...................... SUCCESS [  0.714 s]
[INFO] sheepdogxtextcukeplugin.ui.tests ................... SUCCESS [  1.249 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  18.500 s
[INFO] Finished at: 2024-09-14T15:24:35-04:00
[INFO] ------------------------------------------------------------------------
```