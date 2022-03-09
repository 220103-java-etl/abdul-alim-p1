# Employee Reimbursement System (ERS)
# Author: Abdul Alim

## Project Description

This application required the users login prior to access it. if the users not exists then it will direct to the users for the registration page to register in order to access the application. upon successful login the employee will be able to request for the reimbursement for the attended events. the manager will be able to see all the submited request for the reimbursement. (Under development: the employee will be able to see all of the submited request and the status of the reimbursement and the manager will be able to see all the submited request and would be able to edit it to approve or denial the request. )
 
## Technologies Used

* DBeaver - version 21.3.5
* IntelliJ - version 2021.3.1
* Java - version 1.8
* Maven - version 3.8.4
* PostgreSQL - version 42.3.1
* Postman - version 9.14.6
* Tomcat - version 9.0.56
* HTML5
* CSS3
* AWS RD

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

5. Run EtlECommerceApplication using Spring and then go to http://localhost:8080/login/ to test web app
6. 

## Usages:

 * To use this app simply follow these Steps: 

  1: Log into account, if not registered user, please use register button to setup a user account by completing the registration form.
  
  2: If the log in user is non management employee then the user would be able to create a reimbursement request for the manager approval.
  On the other hand if the user is manager then it directed to different url, in where manager would be able to approve or denie the request(uncomplete)
  
  3: would normally be to have the Manager check information to determine if the request is eligible or not but is not implemented at this time.
