# 
# Author: Abdul Alim

## Project Description

 then load it onto an AWS server where it can be accessed from the web application.

## Technologies Used

* DBeaver - version 21.3.5
* IntelliJ - version 2021.3.1
* Java - version 1.8
* Maven - version 3.8.4
* PostgreSQL - version 42.3.1
* Postman - version 9.14.6
* Tomcat - version 9.0.56

## Features

* Login Page
* Registration Page
* Reimbursement Page(based on Role)


## Getting Started
* Note: this app will only work with a connection to Amazon Web Services. The application.properties file will need to be edited to work on your device.

1. Open git bash terminal in desired directory and enter the following: 
    git clone https://github.com/220103-java-etl/abdul-alim-p1.git

2. Open the directory in IntelliJ or other desired Java IDE

3. Make sure that the Maven POM.xml file changes are loaded

4. Edit the application.properties file to your specifications

5. Run EtlECommerceApplication using Spring and then go to http://localhost:8080/user/ to test web app
<h3>Usages:<h3>
To use this app simply follow these Steps: 
1: Log into account, if not registered user, please use register button to setup a user account by completing the registration form.
2: If the log in user is non management employee then the user would be able to create a reimbursement request for the manager approval.
On the other hand if the user is manager then it directed to different url, in where manager would be able to approve or denie the request(uncomplete)
Step 3 would normally be to have the Manager check information to determine if the request is eligible or not but is not implemented at this time.


