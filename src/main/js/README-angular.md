# Project Title
* **Description**
   * This Angular application acquires and displays Users from a Spring Boot Application.

## Part 1 - Configure Local Environment Environment
* This setup guide uses the `npm` client command line interface, which is installed with `Node.js` by default. 
* Verify that your machine has [NodeJs](https://nodejs.org/en/) installed by
    1. open `node` by executing the following command from a command line
        * `node`
    2. update `node` by executing the following command from a command line
        * `npm install npm@latest -g`
* Install [Angular.js]() by executing the following command from a command line
    * `npm install -g @angular/cli`
* Update your version of angular by executing the following command from a command line
	* `ng update @angular/cli @angular/core`
* If there are still issues with configuration, click [here](https://angular.io/guide/setup-local) to see the full documentation on setting up local environment.


## Part 2 - Create a new workspace and initialize the project
* From the root directory of the project, execute the following command from a command line to create a new workspace and initial starter app
    *  `ng new my-app`


## Part 3 - Run Application
* From the root directory of the project, execute the following command from a command line to navigate into the angular-project and launch the server.
	* `cd my-app`
	* `ng serve --open`
* To serve the application from a different port modify the following command and execute it from a command line
	* `ng serve --port 4200`

## Part 4 - `push`ing first change
* `add`, `commit`, and `push`, your changes to your remote repository as an initial _checkpoint_ for the project.