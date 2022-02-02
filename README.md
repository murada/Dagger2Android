# introToDI

Hi All . My name is murad and i'm a software developer .

this is an introduction to DI. i'll explain DI in Dagger2 step by step . inspired by : Mindork

Every Commit will be contains a step in how to create instances and provide those to who needs them.

## Table of contents
* [Description](#project)
* [Technologies](#technologies)
* [Old Way: I create what I need](#first-step)
* [I Get What I need](#second-step)
* [Someone Will give me What I need](#third-step)


## PROJECT:

this is a clean example to DI and will be guide to Dagger2 in android.(KOTLIN)

- Network Service. needs (apiKey , context)
- Database Service. needs (context , database name , version)
- MainView Model. needs ( network service , database service)
- MainActivity. needs ( viewmodel )

--------------------------------------

## Technologies
Project is created with:
* KOTLIN
* Dagger2


--------------------------------------

### FIRST STEP:

in first commit you will find the old way . ( when i need object I WILL CREATE IT ). so the
viewmodel will create new instances from network service and database service. and the main activity
will create instance from viewmodel.

--------------------------------------

### SECOND STEP:

we moved the creation of the instances (services) outside the viewmodel and we passes the Conf
values of the service from outside each service, so now the code is more configurable and testable.!

--------------------------------------

### THIRD STEP:

we created new singleton class(object) -- Injector -- to manage our dependencies, this is the first step
to start digging in the dagger and DI libraries world.
this object contains 2 inject methods. the first one will inject the services instances in the application class.
the second will inject the instances from the application into the viewmodel and inject the viewmodel in the mainactivity.