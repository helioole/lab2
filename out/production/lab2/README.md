# lab4(Prev.lab3)
>OOP Lab4. Racovcena Irina. FAF-212

## Scenarios
### The 1st scenario
Obviously, we won't be able to continue if there's no available room. That's why simulation stops when `Model.Manager` can't find our guest a room.

### The 2nd scenario
The guest takes his keys and has to go to room.
The guest might need a help with his heavy bags. So, `Model.Porter` can help him or he will be forced to wait a little bit in order to another porter to come for help.

### The 3rd scenario
The guest estimates the room he've just got. If it's dirty, he will be angry. There are 2 possible ways of this conflict: either we can please him and beg him to stay with our `createMeals()` method, either he'll leave the hotel immediately.
If the room is clean, he is satisfied

### The 4th scenario
Our guest needs to repair some stuff. Might be it's his fault something is broken and he will be forced to pay, or we missed something and the guest doesn't ought us anything.

### The 5th scenario
The guest needs a medical services. His illness can be serious or not that severe as he thinks.

### The 6th scenario
The guest needs a vehicle immediately. So, we'll schedule him a taxi ride

### The 7th scerario
It's the first time the guest is being our city. We have to show him the best things. So, we'll kindly propose him to purchase souvenirs and memorabilia.

### The 8th scenario
In the end of the trip the guest has to pay for his vacation. He has some ammount of money, but we don't know if he can afford everything he wants. So, either our guest will pay for service, either he'll solve the problem in the other way.

### Polymorphism
In order to implement polymorphism I added interfaces such as `Model.IPerson` and `Model.IService`. Abstract classes `Model.Person` and `Model.Services` implement them. `Model.Person` class has a method `speak()` and `bye()` which are overrided in all its child classes `Model.Manager`, `Model.Cleaner` and `Model.Porter` in order to change to fit their roles, so they can present them and provide the needed answers.  

### Updated diagram

![oop(1)](https://user-images.githubusercontent.com/113358365/195087248-f05c2820-9af0-449d-bb64-c87777b84b20.png)


## Model.Guest Simulation
In this laboratory work I've tried to implement Inheritance which is one of the OOP principles. Next below you can see the diagram of all my classes and their relations:

![Blank diagram(1)](https://user-images.githubusercontent.com/113358365/193805949-420c82dd-e46c-4fc8-af53-bbc0b8a0e7c7.png)


As you can see, I have a root class `Model.Guest` where all the children classes come from.

Let's start with the class `Room` which inherits from `Model.Guest`. This class has methods `av_room()` and `index()` which are needed for the class `Model.Manager`. It will need them in order to get availbable room and their indexes. Class `Model.Manager` has children itself. It will transmit them methods `giveTips()` and `need_help()`. So, the manager will be able to count the bill and find out, if the guest struggles with his heavy bags.

The second branch from the root class class leads to class `Model.Accountant`. It has 2 children where we check if the guest likes his room. Children inherit from their parent methods `check_answer()` and `check_cleaned()` which are going to be generated randomly. Depending on the answers, we'll try to find a solution which will make our guest happy. If the guest remains unsatisfied, he will leave a bad review about our hotel. Hence, we'll need the class `Complaint`.


The third branch is dedicated to all the services our guest might get a need in. There are 4 classes such as `Model.Repair`, `Model.Medical`, `Model.Souvenir` and `Model.Taxi` which inherit methods the following methods: `check_isIll()`, `check_trip()`, `check_wants()`, `check_isBroken()`, `check_before()`. All of these methods help us to understand what the guests demands.
