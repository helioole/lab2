# lab6
>OOP Lab6. Racovcena Irina. FAF-212

## Arhitectural pattern
### MVC
Model designs based on MVC architecture follow the MVC design pattern and they separate the application logic from the user interface when designing software. As the name implies MVC pattern has three layers, which are:

    *Model* — Represents the business layer of the application
    *View* — Defines the presentation of the application
    *Controller* — Manages the flow of the application

In order to implement MVC in my laboratory work, I separated my already existed classes into `Model`, `View` and `Controller`. All the data which is related to data, Business logic and calculations is seted in `Model`. `View` is responsable for UI in general and Hotel statistics in my case. `Controller` helps me to manage flow of my simulation. There i update `Model` in `View`.

## SOLID Principles
SOLID stands for:

    S - Single-responsiblity Principle
    O - Open-closed Principle
    L - Liskov Substitution Principle
    I - Interface Segregation Principle
    D - Dependency Inversion Principle
