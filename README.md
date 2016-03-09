# ACM XLABS : DIGITAL CANTEEN

## Android Section - Client Module

The above module includes development of an android application consisting of a simple UI for the client to order food online from the canteen.
 
####Key tasks to be implemented:
+ Login Interface
+ Main screen populated with the canteen’s menu
+ Ordering Process
+ Payment 
+ Notifications about status of food
 
*** 
 
#####The flow of the app is as follows:

+ The client first need to login in our app using his/her admission no. and upon successful login he/she will be directed towards the main screen of the app.
+ The main screen consists of the canteen’s menu having all the available items populated in a form of a list. The user can simply check whatever the food item he/she likes with the quantity specified.
+ When completed with the selection of food items, the user will tap on the order button. As soon as he /she orders, an order request with a unique token number will be generated and pushed to the server’s boy and admin’s app.(We are pushing it to the admin’s app for the cancellation part described below. Otherwise in normal working there is no use of admin in between).
+ Also as temporarily decided a shape will be generated (for 2-way authentication process at the time of delivery) along with the token for each order.
+ The main part is of **payment**, and for now we have decided it to be **in advance**. When the user places an order the amount will be deducted from his/her account as soon as he/she presses the order button.
+ If a user want to cancel his/her order then they have to go to shekhar bhai(admin) for an order cancellation request. If his/her order is not made till now then the order amount will be refunded to their respective accounts.
+ The notification part consist of notifying the user when his/her order is ready. We have set a timeout of 30 seconds (again which is temporary) after notification in which he/she have to collect the order. If the user fails to do so the item will be forwarded to someone else in the queue.
+ 
For an idea on git refer: https://gist.github.com/ythej/3e05c949bb0b8d393b57
 

######The UI of this app has to be as simple as it can be. The user should be just a few taps away from ordering his/her food otherwise if the process of ordering is complicated no one will use it. Also the UI should look clean consisting of minimum buttons and not having unnecessary options.


*Detailed layout of the app is still need to be discussed and will be updated soon.*

***

###Team Members

+ Rahul Kanojia
+ Om Prakash Bajiya
<<<<<<< HEAD
Gopi Doshi
=======
+ Noel Varghese
>>>>>>> refs/remotes/ACM-XLabs/master

