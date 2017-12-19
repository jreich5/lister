# Single-Resource-App Build To-Do

This README documents the steps to build a single resource web application using JAVA EE, Git for version control, IntelliJ IDE, and Maven. The single resource of this application is referred to simply as "item" which represents an item of a list of items (or for example an item on a grocery list).

The item resource of this application will simply have an id and name attribute.

## Setting up Project

1. Create the project in IntelliJ
1. Select Maven Project and use Java 8
1. Check create from archetype and choose webapp
1. Fill out GroupId (recommend com.codeup.lister)
1. Fill out the ArtifactId (recommend lister)
1. Add dependencies to pom.xml file for: javax.servlets, jstl, mysql-connector-java and the maven-compiler-plugin (recommend the following template):

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0"
             xmlns:xsi="http://www.w3.org/2001/    XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/    POM/4.0.0 http://maven.apache.org/xsd/    maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
    
        <groupId>com.codeup.adlister</groupId>
        <artifactId>adlister</artifactId>
        <version>1.0-SNAPSHOT</version>
        <packaging>war</packaging>
    
        <build>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</    artifactId>
                    <version>3.6.0</version>
                    <configuration>
                        <source>1.8</source>
                        <target>1.8</target>
                    </configuration>
                </plugin>
            </plugins>
        </build>
    
        <dependencies>
            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>javax.servlet-api</artifactId>
                <version>3.0.1</version>
            </dependency>
            <dependency>
                <groupId>jstl</groupId>
                <artifactId>jstl</artifactId>
                <version>1.2</version>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>6.0.5</version>
            </dependency>
        </dependencies>
    
    </project>
    ```

1. Add folders as needed to create the following project folder structure...

	```
	pom.xml (xml file)
	.gitignore (text file)
	src
	  main
	    java
		   com.codeup.lister
			  controllers
			  dao
			    models
	  webapp
	    js
		 css
		 img
		 WEB-INF
		   partials
		   list
		 index.jsp (jsp file)
	```
	- the web.xml folder should be removed from the project
1. Right click on the java folder and select "Mark Directory as" and pick "Sources Root"

## Configure Tomcat

For the following steps, you must already have Tomcat installed and know the path where it is located in the file system.

1. Click on the dropdown menu in the upper right corner of IntelliJ and select "Edit Configurations"
2. Click the plus button to add a new configurate and scroll down until you see Tomcat (not TomEE Server). You may need to scroll all the way at the bottom to select the "irrelevent" choices from the dropdown menu. Choose the "local" version.
2. Make sure the file path is configured by clicking the configure button next to the application server dropdown.
3. Click apply and then if needed, hit the "Fix" button and selected the war exploded option
4. Click apply again and close the configurations menu
5. Test your set up by clicking the play button. If everthing is configured correctly, your browser should open to the default Hello World! page.

## Setting Up Version Control

The following is a command line approuch.

1. Add the following to the .gitignore:

    ```
    *.iml
    .idea/*
    target/*
    Config.java
    ```
1. Initialize a Git repo
2. Add and commit inital set up
3. Create a repo on Github
4. Push local repo to remote

## Building CRUD Views (JSPs)
 
1. Update your webapp folder with the following structure:

    ```
    webapp
      js
        main.js
      css
        main.css
      WEB-INF
        partials
	      nav.jsp
          head.html
	      scripts.html
        item
          index.jsp
          create.jsp
          show.jsp
          edit.jsp
      index.jsp
    ```
2. Add jQuery and Bootstrap to scripts and head partials
3. Test simple custom JS and CSS
4. Fill in html/java code to complete all views and partials

## Building Controller Placeholder Logic (Servlets)

1. Build out the following controllers in the controllers folder:

    	ItemIndexServlet
		ItemCreateServlet
		ItemDeleteServlet
		ItemUpdateServlet
		ItemShowServlet
    	
1. It may be neccesary to take additional steps to enable the IntelliJ servlet templates. If you cannot find a file type of servlet when trying to create a new controller, temporarily replace the javax.servlet-api dependency in your POM file with the following:

    ```
    <dependency>
      <groupId>javax</groupId>
      <artifactId>javaee-api</artifactId>
      <version>6.0</version>
      <scope>provided</scope>
  	</dependency>
  	```
	- once the servlet option is available, you can replace this dependency with the old javax.servlet dependency.  	
1. Check all views that can now be accessed with servlets

## Setting up A Database and Configuring IntelliJ

1. From the terminal, create a new database called lister_db
2. Create a user called lister_user with all permissions minus grant option for lister_db
3. Open the database tool window
View -> Tool Windows -> Database
1. Add a new connection:
Click on the '+' Choose Data Source -> MySQL
1. Fill in the following:
	- Host: localhost
	- Port: 3306
	- Database:
	- User: root
	- Password: codeup (or your root password)
Note that you should leave the "Database" field blank.

1. Click 'Test Connection' and save if successful

1. You should be dropped into the db console

- If you cannot run 'Test Connection', look for a prompt to update your drivers.
- Remember to start your server with
    ```
    mysql.server start
    ```

IntelliJ may tell you that you are missing a JDBC driver, and provide a button to click to download the missing driver. Go ahead and click the button if this is the case.
3. Create migration and seeder files 
4. Migrate then seed

## Creating Model Logic (DAOs)

1. Build out the following in the dao folder:

    ```
    dao
      * ItemDao
      * Config
      * DaoFactory
      * Items (interface)
      models
	    * Item (bean)
    ```
1. Complete interface
2. Add a class called DaoTest with a main method that tests creating a database connection
3. Finish the DaoFactory class
4. Wire up index view
5. Wire up show view
6. Wire up edit view and item update
7. Wire up item create
8. Wire up item deletion

## Security

1. Refactor if needed to use prepared statements to mitigate risk of SQL injection attacks
2. Refactor if needed to escape all output in views to mitigate risk of XSS attacks

## Finishing Partials

1. Build navbar

## Styling

1. Add a Bootstrap theme
1. Refine styling as needed
2. Use SASS to write CSS

## Extras

1. Refactor into a single page application using jQuery AJAX or fetch API
2. Add users


