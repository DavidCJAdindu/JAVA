public class MadLibs {
  /*
This program generates a mad libbed story.
Author: David
Date: 22/02/2022
  */
  	public static void main(String[] args){

      String name1 = "shannon";
      String name2 = "david";

      int number = 25;

      String adjective1 = "red";
      String adjective2 = "technical";
      String adjective3 = "sweet";

      String verb1 = "dnacing";

      String noun1 = "window";
      String noun2 = "me";
      String noun3 = "feet";
      String noun4 = "sky";
      String noun5 = "blue";
      String noun6 = "table"; 

      String place1 = "buggy social club";   
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);  
    }    

     
}
