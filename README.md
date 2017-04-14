# exp5_HelloFxml
Example Java project created via STS as JavaFX --> JavaFX Project, showing how to;
- do JavaFX via java + fxml (using SceneBuilder to edit it), where Controller is written in Java, UI written in FXML
- create Controller and FXML that is hooked up (SimpleCalculatorController.java, SimpleCalculator.fxml)
- modify default generated blank JavaFX application (Main.java and application.css) to call Controller with FXML,
- pass values to Controller instance loaded from Main
- run JavaFX as "Java Application" like any other Java Project

## How to install efxclipse plugin to STS
1. Help --> Install New  Software
2. Click Add, enter Name: efxclipse , Location: below url <br>
http://download.eclipse.org/efxclipse/updates-released/2.4.0/site
3. Click boxes next to; <br>
e(fx)clipse – install <br>
e(fx)clipse – single components
4. Click Next, Click Next again
5. Click “I accept the terms of the license agreements”, click Finish
6. Click Yes when it asks, "You will need to restart Eclipse for the changes to take effect..."

## How to create a blank JavaFX application as JavaFX project in STS
1. Click File --> New --> Project
2. Click Java (now with above plugin, JavaFX will be in the list), click JavaFX --> JavaFX Project
3. Enter projects name, click Finish <br>
See project now has library “JavaFX SDK” in addition to JRE <br>
See src has a package called “application”, which has Main.java and application.css
4. Run it via Run As --> Java Application <br>
See blank JavaFX application pops up

## Setup dependencies
Make sure on your machine, you have;
- STS installed
- efxclipse plugin installed to STS
- git installed
- a working unix shell (like git bash. If not there install git and use its "git bash")
- working JDK 1.8 installed (with JAVA_HOME env variable added, and PATH env variable prefixed with %JAVA_HOME%/bin)
- make sure JRE System Library is from jdk1.8 (delete it and recrete the JRE System Library if it is not from jdk)

## How to use it  (NOTE in below the directory structure and names are suggested)
### Make sure you created the directory structure you want to store example projects in
As example, at bash command line issue;<br>
mkdir -p /c/fdu/csci3307/projects

### to import the project from github to STS
In github, go to the repository you want to clone<br>
https://github.com/fdu-3307/exp5_HelloFxml.git <br>
click green "Clone or download" on right hand side<br>
click icon with "Copy to clipboard" tooltip (NOTE when you click that later during import in STS most fields of "Source Git Repository" will be auto populated) or copy the URL

In STS
File --> Import --> Git --> Projects from Git + Next --> Clone URI + Next --> URI, Host, Repository path, Protocol of "Source Git Repsitory" will be auto filled, fill in Authentication section, click check box of "Store in Secure Store" + Next --> let "master" be selected in "Branch Selection" + Next --> in "Local Destination" type in Directory or click Browse and select workspace, let "origin" be Remote name + Next  --> in "Select a wizard to use for importing projects" click radio button of "Import using the New Project wizard" + Finish<br>
in "Select a wizard" click Java --> Java Project + Next --> in "Create a Java Project" enter "Project name" value + Finish

Now you should see the project in STS with yellow milk tank on its lower right corner and blue J in its upper right corner  

### or to clone the project from github via command line to a directory
cd to where you put your example projects.<br>
As example, at bash command line issue;<br>
cd /c/fdu/csci3307/projects <br>
git clone https://github.com/fdu-3307/exp5_HelloFxml.git <br>
or<br>
git clone https://github.com/fdu-3307/exp5_HelloFxml.git  whateverDirectoryNameYouWantStuffToBeClonedInto

Now you can import the project into STS via
File --> Import --> General --> Existing Projects into Workspace , then follow the wizard

### to run the project from STS
- Right click on project, Run As --> Java Application, click HelloWorldFX or MainEntryFX2 from list
or
- Right click on HelloWorldFX, Run As --> Java Application
- Right click on MainEntryFX2, Run As --> Java Application

## Project directory structure
- README.md this read me file
- src directory of java packages and css files
- design directory of design documents, like class diagram
