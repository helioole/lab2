# lab2
>OOP Lab2. Racovcena Irina. FAF-212

## Hotel Simulation
I made a Hotel simulation where a guest can bunch of things such as rent a room, order food or a taxi repair stuff, get medical service, leave feedback and even buy souvenirs. Obviously, in the end of his trip he must pay all his bills. Or not...

After entering the hotel, the guest goes to reception to move into a room. There are 2 possible ways: there is a free room for him or all of them are occupied. Class `Manager` has a function `available()` which checks if the guest can stay at the hotel. If the answer is negative, he leaves and simulation stops. If it's otherwise we continue. Each time when some service was provided to the guest, his mood gets better, so will do reviews in the end. So, if everything is fine, we get `guest.review++` and `guest.tips++` for the hotel's staff.

The guest came from another country with a heavy luggage. That's why needs help. `bag()` method in class `Baggage` provides the needed help. Here will be a porter to carry the bags but if it's too heavy he will call the other person to do it. So, the guest has to wait for a little bit.

Our guest is in the room, but what he sees? Is the room prepared for his visit? We need to check it with class `Cleaning` in `checkCleaning()` method. If the room is clean, then he will be satisfied and gives us more tips. If it's not, he will be outaged by poor hotel service and will hurry up to leave.In order to stop him, the hotel staff order's him free food order. Class 'Menu' provides the menu and generates the guests' order with method `createMeals()`. If the guest wasn't convinced to stay, he would leave the hotel without payment and write a bad review.

Things tend to break after a while. It might be just because of time, or the guest actually broke it. Class `Repair` checks it, using `repairProblems()`. So, if the stuff will be prepared anyway. But if it's guest's fault, he will be asked to pay for it.

Our guest can get ill or maybe he needs a car to visit the city. Also, he might be a tourist, that's why he would want to buy something special. Class `Other` provides all this service with `things()` method.

In the end, the guest will receive a bill in class `Bill` and `payBill()` method and the hotel receive review in class `Feedback` with `feedbackCheck()` method.
