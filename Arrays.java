/*

Arrays:
-------



- Generally an  Array is a group of homogenous elements.

- Two types of arrays :
                        (1) primitive type array
                        
                        ex: int [] x;  char ch[];   Stirng [] str;
                        
                        
                        (2) class_type array 
                        
                        
                        ex Test [] t, Integer [] i, Student [] s etc.
                        
                        
- The index of an array always starts with 0.                     
- How to create an array :
--------------------------

1st approach :

step-1: Declaration    e.g.   int [] a;

step-2: instantiation  e.g.    a=new int[3];

step-3: initialization  e.g.     a[0]=10;  a[1]=20;    a[2]=30;

- We can create the above array in one step also.

int [] a=new int[]{10,20,30};



2nd approach :

int [] a={10,20,30};
*/



/*
default value of array:
-----------------------

- If we dont initialize any array then default values will be stored.

- For int type, default values = 0.
      String_type, default values = null.
      Class_type, default values = null.


-- But after initialization, those default values are replaced by the assigned values.


ex: int [] i=new int [3];

default values :i[0]=0   i[1]=0    i[2]=0
*/


/*
How to access the array elements :
----------------------------------

Approach-1:( Accessing the individual elements one by one)

ex:  String [] names=new String[]{"abc","def","ghi","pqr","xyz"};
     System.out.println(names[0]);// abc
     System.out.println(names[3]);// pqr
     
     
Approach-2:( Accessing all araay elements using simple for loop)

ex:  for(int i=0;i<=names.length;i++)
     {
        System.out.println(names[i]);
     }
     
     
Approach-3:( Accessing all array elements using for_each loop)

ex:  for(int i:names)
     {
        System.out.println(i);
     }
     
*/