# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
   1. An ArrayList called dogs which contains Dog elements.
   2. An Dog with a name Fido and 4 legs.
   3. An Dog with a name Fido and 3 legs.
   4. An Dog with a name Alfie and 4 legs.
   5. An Comparator<Animal>() inside ithe Collections.sort call.

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
   Inside the Collections.sort call, the "new Comparator<Animal>()";
   The definition of the Comparator is in the curly brackets right after the constructor call, which is still inside the Collections.sort call.

