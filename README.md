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

[commit](https://github.com/murada/introToDI/commit/fbd3ebc1fcc0c6d5d96918872dce3e07291dfe37)

in first commit you will find the old way . ( when i need object I WILL CREATE IT ). so the
viewmodel will create new instances from network service and database service. and the main activity
will create instance from viewmodel.

--------------------------------------

### SECOND STEP:

[commit](https://github.com/murada/introToDI/commit/2a0632c0bd7118a829516b233b1620054f00525c)

we moved the creation of the instances (services) outside the viewmodel and we passes the Conf
values of the service from outside each service, so now the code is more configurable and testable.!

--------------------------------------

### THIRD STEP:

[commit](https://github.com/murada/introToDI/commit/dd417811abf533e522715641d894d33f757f18a2)

we created new singleton class(object) -- Injector -- to manage our dependencies, this is the first step
to start digging in the dagger and DI libraries world.
this object contains 2 inject methods. the first one will inject the services instances in the application class.
the second will inject the instances from the application into the viewmodel and inject the viewmodel in the mainactivity.


## Dagger2

Dagger Main Architecture:

* Module(A class that provides-create the needed dependencies)
* Component(Dependency Manager a class will inject the consumers with their dependencies)
* Consumer (Classes has dependencies -they have fields from another classes-)
* Scope (The Dependency lifetime)
* Qualifier( if we had 2 provides method with same return type we need to distinguish between them using qualifier (Annotations)).

Main Annotations:

* @Module
* @Component
* @Provides
* @Inject
* @Qualifier

In the first commit we removed the inject(for the application) method from the injector class and we used the dagger2 to inject the services 
into the application.

We created Application module(@Module) that will provide 2 (@Singleton) services (Network , Database).

In the second commit we removed the Injector object and we used dagger2 to inject the viewmodel in the main activity.
(Note : we added dependency in the activity component because the view model needs (network and database)services and they already been provided
from application module).

in the first and second commit we used (Method injection using @provides). next we will use Constructor injection.

----------------------------------------
