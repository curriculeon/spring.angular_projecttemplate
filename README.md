## Spring Boot Angular
* **Objective** - The purpose of this repository is to create a standard template to clone from when creating new spring boot web services with an Angular JS front end.
* **Background** - EugenP's [tutorial](https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-angular) on building a Web Application with Spring Boot and Angular was used as a reference to create this project.


### Pre Requisite Software
* [Java8 Runtime Environment](https://maven.apache.org/guides/getting-started/windows-prerequisites.html)
* [AngularJS Cli](./src/main/js/README-angular.md)


### How to run Server
* Open command line and navigate to the project's root directory and run this command:
	* `mvn spring-boot:run`
    * Alternatively, run this application using the `main` method of the `MainApplication` class.
* Upon running, the server's database should be visible by navigating to `http://localhost:8080/h2-console`.


### How to run Application
* From the root directory of [EACH js application](./src/main/js) execute the following command:
    * `npm install ; npm start`
* Upon running, the application should be visible by navigating to `http://localhost:4200`


### Troubleshooting
* If your application cannot run because something is occupying a port, use this command with the respective port number specified:
    * **OSX and Linux**
	    * ``kill -kill `lsof -t -i tcp:8080` ``
	    * ``kill -kill `lsof -t -i tcp:4200` ``
    * **Windows**
        * _For use in command line_:
            * `for /f "tokens=5" %a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %a`
            * `for /f "tokens=5" %a in ('netstat -aon ^| find ":4200" ^| find "LISTENING"') do taskkill /f /pid %a`
        * _For use in bat-file_:
            * `for /f "tokens=5" %%a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %%a`
            * `for /f "tokens=5" %%a in ('netstat -aon ^| find ":4200" ^| find "LISTENING"') do taskkill /f /pid %%a` 
