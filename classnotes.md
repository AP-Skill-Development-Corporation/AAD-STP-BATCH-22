
Good Evening to all
------------------
Day-2
-------------------
Day-Objectives:
--------------------
1.Project Structure

2.How to Enable Developer Options In out Mobile

3.View And View Group

4.Android App Components.

5.How to run an HelloWorld Programm in our Mobile

java file

android-java file-activity file

android-xml-layout file

R.java


setcontentview(R.layout.activity_main)

Mainfest:

it can be give the permissions

example:INTETNET,LOCATION,INTERNAL_STORAGE

<uses-permission android:name="android.permission.INTERNET"/>

APPLICATION STRUCTURE:
----------------------
ANDROID-XML+JAVA

<Mainfest>

<give permissions>

<APPLICATION
name
icon
>
<Activity>
<Intent_Filter>
<java file>+<xml file>
</Intent_Filter>
</Activity>
</APPLICATION>

</Mainfest>

xml-screen design

Activity-implement the onclick events

10-9-2020 class notes


onclick listeners:
------------------

1.by using xml file

2.by using java file

1.by using xml file

<Li
w
h
o>
<Button
android:onclick="toastname"--alr+enter
w
h
/>
<Textview/>
<Button
android:"@+id/count"

/>
</Li>

How to create the method:
--------------------------

public void methodname(View view)
{

}

example:
---------
public void toastname(View view)
{

}

Steps to Implements Method Declaration in MainActivity:
----------------------------------------------
1.global declaration variable for particular view

Button co;

2.we have to get the id for oncreate() method
with the help of findviewbyId()

co=findviewbyId(R.id.count);

co.setOnclicklistener(new Onclicklistener)

{

   public void onclick(View view)
   {
   
   }

}

How to declare the toast message in or android:
----------------------------------------

Toast is a one of the class

we have to write an toast with the

help Toast


Syntax for Toast Class:
------------------------

Toast.maketext(context,string,duration).show();

Example:
--------
activity_main.xml

MainActivity

Toast.maketext(this
                MainActivity.this,
				getapplicationContext,
				"VAMANAPALLI GOPAL",
				Toast.LENGTH_LONG
				Toast.LENGTH_SHORT).show();



# Day 8 OptionsMenu

Good Evening to all
-------------------

To Day Objectives:
------------------

1.Options Menu

2.Contextual Menu

3.Popup menu

Menu:
----
Menu is collection of items.which can be display the items in the Appbar.


Options Menu:
------------

Diff between Explicit intent and OptionsMenu

explicit:-navigation between one activity to another activity with in same 

application


Options Menu:we can navigate one screen to corresponding activity.


Seetings -------settting activivity----- titles

Whatsup web------whatsup web activity

search----------- serach activity


steps to implement the options Menu:
-----------------------------------

1.create an menu directory in resource folder.

res:
menu

2.create an menu resourse xml file
res:
menu

option_menu

   
<menu>

 <item
android:title="settings"
android:id="@+id/m1"/>


</menu>


3.implement the menu at MainActivity with the help of

OncreateOptionsmenu() method


//get the menu xml file with oncreateoptions_menu

R.color.primary

R.string.name

R.mipmap.imagename

R.id.idname

getmenuInflater.inflate(R.menu.option_menu,menu)



4.Handling the onclick evenets respective menu.


# Notification


Recyclerview:
--------------
A recyclerview is scrollable containers

from a large number of dataset.

before using recyclerview listview

Recyclerview Dependency


1.Data

Drawable:
a
b
c

int[] imgages={R.drwable.a,R.drwable.b};

String[] names={"Gopal","Vamsi"};

names.length();

String[] desig={"MCA;MTECH"}

2.setlayout manager

3.Adapter

4.layout_file

Notification In Android:
------------------------

def:
---
A notification is a message which 

display the notification in out side 

of an Ui.

Two classes requires:
--------------------

1.NotificationCompact.Builder()

id

title

message

icon

image

priority

addaction

NotificationCompact.Builder builder=

new NotificationCompact.Builder(this,"gopal_id");

builder.seContentTitle("APSSDC");

builder.setMesaage("APSSDC ANDROID-WORKSHOP")

builder.seTIcon(R.drwable.image);


2.NotificationManager

NotificationManager manager;

manager=getsystemService(NotificationService);

manager.notify(1,builder.build())

we have to run the application above

orio version we need crete NotificationChannel


if(Build.VERSION.SDK_INT>=Build.VERSIONCODES.O)
{

NotificationChannel channel=new NotificationChannel

("gopal_id","android_channel",NotificationChannel.DEFAULT);

manager.createNotificationChannel(channel);
}

10-21-2020
-----------


Day-Objectives:
--------------

a.Services

b.BroadCastRecivers

A.service:
----------
A service is a long running background

operation with out an user interaction.

example:
-------
Music player.

BroadCastRecivers:
------------------

def:
----
A BroadCastReciver is a Application

compopnents.

AND TO recieve the system announcements

interaction with the user.

EXAMPLE:
-------

SYSTEM BROADCAST: PRE DEFINED
-----------------
POWER_CONNTECTED

POWER_DIS CONNTECTED

AIR_PLANE MODE CHANGED

BATTERY_LOW--12% PERCENTAGE

SYSTEM_UPDATE

HEADPHONE_PLUGIIN

CUSTOM BROADCAST:
----------------


diff between Activity Services BroadCastReciver
------------------------------------------------

Activity                 service                 broadcast

oncreate()               onbind()                onrecieve()

startActivity(intent obj) startservice(intent obj) sendbroadcast()
                          stopservice(intent obj)  
                          oncreate()
						  onstartCommand()
						  ondestroy()

res:

Drawable:
a.png
menu:
options_menu
context_menu
raw:
song.mp3





















































