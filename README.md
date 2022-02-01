# introToDI
this is an introduction to DI. i'll explain DI in Dagger2 step by step . inspired by : Minork

Hi All . My name is murad and i'm a software developer .

in this project i'll explain the DI step by step . 

Every Commit will be contains a step in how to create instances and provide those to who needs the.

PROJECT : 

1- Netwok Service. needs (apiKey , context)
2- Database Service. needs (contet , databse name , version)
3- MainView Model. needs ( network service , database service)
4- MainActivity. needs ( viewmodel )


FIRST STEP : ( First Commit ) 

in first commit you will find the old way . ( when i need object I WILL CREATE IT ). 
so the viewmodel will create new instances from network service and database service. and the main activity will create instance from viewmodel.
