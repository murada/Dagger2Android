# introToDI

this is an introduction to DI. i'll explain DI in Dagger2 step by step . inspired by : Minork

Hi All . My name is murad and i'm a software developer .

in this project i'll explain the DI step by step .

Every Commit will be contains a step in how to create instances and provide those to who needs the.

## PROJECT :

this is a clean example to DI and will be guide to Dagger2 in android.(KOTLIN)

1- Network Service. needs (apiKey , context)
2- Database Service. needs (context , database name , version)
3- MainView Model. needs ( network service , database service)
4- MainActivity. needs ( viewmodel )

--------------------------------------

### FIRST STEP : ( First Commit )

in first commit you will find the old way . ( when i need object I WILL CREATE IT ). so the
viewmodel will create new instances from network service and database service. and the main activity
will create instance from viewmodel.

--------------------------------------

### SECOND STEP:

we moved the creation of the instances (services) outside the viewmodel and we passes the Conf
values of the service from outside each service, so now the code is more configurable and testable.!

### THIRD STEP:

we created new singleton class(object) -- Injector -- to manage our dependencies, this is the first step
to start digging in the dagger and DI libraries world.
this object contains 2 inject methods. the first one will inject the services instances in the application class.
the second will inject the instances from the application into the viewmodel and inject the viewmodel in the mainactivity.