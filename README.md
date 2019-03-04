# Network

In a home Network there are multiple Devices with multiple attributes and capabilities.
There are 3 types of Devices: 
* Connected, 
* Normal and 
* Smart. 

There have to be at least 4 Connected Device on the Network at all times!

The Network knows about all Devices.
Every Device has an age and a battery life which is set when they are manufactured.

Smart and Normal Devices have an actual screen size as well, 
while Connected Devices know all other Connected Devices on the Network.
Smart has an additional name attribute which have to be unique (just dont write the same for 2), 
also they are able to collect the Normal Devices which remainding power differs from theirs only by a given amount.
Normal have an additional attribute as well, we know the year when they were manufactured.

Also, all of them are able to calculate their own remainding power.
This differs based on the Device:
* Connected - loses 7 for every age, have 20 more for each Connected Device on the Network
* Smart - loses 15 for every age, also loses a fix amount based on their screen size (EDTV - 5, HD - 10, FULL HD - 15, UHD - 20)
* Normal - loses 3 for every age, if it was manufactored in 2000 or later it's power is doubled, if earlier it is halved

Implement these classes and their methods using the OOP principles!
