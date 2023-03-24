# Tic-Tac-Toe

All of us must have played this game in our childhood...
This is how we can implement this game using the core concepts of JAVA and OOPS such as classes and objects, inheritance, signifance of abstract and static keyword,
some inbuilt java classes and methods and many more.


1. The MAIN function have some important properties and methods such as--
   display method which display the board after every move.
   initialize method which initializes every position of board with empty space.
   placeMark method which places the marker "X" and "O" accordingly.
   win methods which checks the condition for a player to win.

2. The PLAYER class 
   this class is defined abstract because it have some functionality which has to be implemented accordingly.
   it has a method which checks whether the move generated by a player is valid or not.
   
3. The HUMAN_PLAYER class
   this class inherits the properties of PLAYER class.
   it also implements one of the abstract method of PLAYER class.
   
4. The COMPUTER_PLAYER class
   this class also inherits the properties of PLAYER class
   it also implements the abstract method of PLAYER class and uses a inbuild Java method to generate random positions of move.
   
5. Image
    
   ![Screenshot (49)](https://user-images.githubusercontent.com/105004597/227426601-0d2ade67-99f4-4c56-8d6c-25841df2592b.png)

