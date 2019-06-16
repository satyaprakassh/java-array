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

class ArrayConcept1
{
    public static void main (String[] args)
    {
        // 1st approach
        int [] i;// Declaration
        
        i=new int[3];// instantiation
        
        // initialization
        i[0]=10;
        i[1]=20;
        i[2]=30;
        
        // direct creation
        int [] j=new int[]{100,200,300};
        
        //2nd approach
        
        int [] k={500,1000,2000};
    }
}
*/
/*
default value of array:
-----------------------

- If we dont initialize any array then default values will be stored.

-     int type, default values = 0.
      boolean type, default values=false.
      String_type, default values = null.
      Class_type, default values = null.


-- But after initialization, those default values are replaced by the assigned values.


ex: int [] i=new int [3];

default values :i[0]=0   i[1]=0    i[2]=0
*/
/*
class ArrayWithDefaultValues
{
    public static void main(String [] args)
    {
        int [] i=new int[4];
        System.out.println(i[0]);// 0
        System.out.println(i[3]);// 0
        
        boolean [] b=new boolean[4];
        System.out.println(b[2]);// false
        System.out.println(b[3]);// false
        
        
    }
}
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
/*
class AccessingTheArrayElements
{
    public static void main(String [] args)
    {
        String []names=new String[]{"Arun","Ashok","Amit","Ashish"};
        
        //using simple for loop
        System.out.println("using simple for loop");
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println();
        
        // using for_each loop
        System.out.println("Using for_each loop");
        for(String s:names)
        {
            System.out.println(s);
        }
        System.out.println();
        //accessing individually
        System.out.println("accessing individually");
        System.out.println(names[2]);
        System.out.println(names[3]);
        
        
    }
}
*/
/*
Customized class_type array:
----------------------------

- We can create class_type array & the default values of the indexes of that array are
null.
*/
/*
class StudentInfo
{
    String name;
    int roll;
    StudentInfo(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
}

class CustomizedArrayDemo
{
    public static void main (String[] args)
    {
        StudentInfo [] si=new StudentInfo[4];
        for(int i=0;i<si.length;i++)
        {
            System.out.println(si[i]);
        }
    }
}
*/
/*

(imp)
NullPointerException in array:
------------------------------

- We know that if we don't assign the values to an array then default values will be 
stored.

- If we consider integer array, the default values are 0. When we access to the indexes
then we will get 0 from each inedxes. But if we cosider Customized class type array then
its default values are null. If we assign values to some indexes of such array and leave
some indexes and trying to print all elements then we will get NullPointerException.  
*/

class A
{
    String str;
    
    A(String str)
    {
        this.str=str;
    }
}
/*
class ExceptionInArray
{
    public static void main(String []args)
    {
        A [] a=new A[3];
        
        a[0]=new A("Bubu");
        a[2]=new A("Tiku");
        // here we are not assinging the value of a[1]
        
        //here we are printing all the elements of A_type array
        
        for(A aa:a)
        {
            System.out.println(aa.str);
        }
    }
}
//java.lang.NullPointerException
*/

/*
How to overcome the above situation ? :
---------------------------------------

To overcome the above situation , we have to use Obkect class instance inside the for_each
loop.
*/
/*
class FixingOfNullPointerExceptionInArray
{
    public static void main (String[] args)
    {
        A [] a=new A[3];
        
        a[0]=new A("abcd");
        a[2]=new A("efgh");
        
        
        //here we are fixing the NullPointerException
        for(Object o:a)
        {
            if(o instanceof A)
            {
                A aa=(A)o;
                System.out.println(aa.str);
            }
            if(o==null)
            {
                System.out.println(o);
            }
        }
    }
}
*/
/*
o|p:
abcd
null
efgh
*/
/*
Important Notes:
----------------

- Arrays are fixed in size. Once an array is created, then we can't increase or decrease
its length.

- Arrays don't support any predefined methods of java api, so it is difficult to perform
operaions like replacement, updatation, searching with arrays.



length vs length():
-------------------

- length is predefined variable used to return the length of an array whereas lenght()
is a predefined method used to return the length of a String.
*/
class VariablelengthVSLengthMethod
{
    public static void main (String[] args)
    {
        int [] i=new int []{3,9,27,81};
        String str="Anything";
        
        //here is the difference
        System.out.println(i.length);
        System.out.println(str.length());
    }
}

/*
An array can be used as return_type and parameters of a method:
*/
class OtherUsesOfArray
{
    public static int[] displayTheIntReturnType()// array as return_type
    {
        int [] i={10,20,30};
        return i;
    }
    public static void displayTheParameter(int [] i)// array as parameter
    {
        for(int ii:i)
        {
            System.out.println(ii);
        }
    }
    public static void main(String [] args)
    {
        int i[] ={444,555,666};
        OtherUsesOfArray.displayTheParameter(i);
        
        int [] j=OtherUsesOfArray.displayTheIntReturnType();
        for(int jj:j)
        {
            System.out.println(jj);
        }
    }
}

/*
Array conflict:
---------------

- We have red that array is a group of homogenous type element. But We can provide non-
homogenous type elements to an array using inheritance concept.
*/
//case-1:(using customized class)
/*
class SuperClass{}
class BaseClass extends SuperClass{}
class AnOtherBaseClass extends BaseClass{}

class ArrayConflictDemo
{
    public static void main(String [] args)
    {
        SuperClass []sc=new SuperClass[3];//Declaration
        
        //initialization
        sc[0]=new SuperClass();
        sc[1]=new BaseClass();
        sc[2]=new AnOtherBaseClass();
        
        
        for(SuperClass ssc:sc)
        {
            System.out.println(ssc);
        }
    }
}
*/
/*
o|p:
SuperClass@232204a1
BaseClass@4aa298b7
AnOtherBaseClass@7d4991ad
*/

//case-2:(using Object class)
class Employee
{
    String name;
    Employee(String name)
    {
        this.name=name;
    }
}
class ArrayConflictDemo2
{
    public static void main (String[] args)
    {
        Object [] o=new Object[4];
        
        o[0]=new Employee("ZZ@##");
        o[1]=new Integer(25);
        o[2]=new String("sss");
        o[3]=new Boolean(false);
        
        for(Object ooo:o)
        {
            if(ooo instanceof Employee)
            {
                Employee e=(Employee)ooo;
                System.out.println("Employee name : "+e.name);
            }
            if(ooo instanceof Integer)
            {
                //Integer i=(Integer)ooo;
                System.out.println(ooo);
            }
            if(ooo instanceof String)
            {
               // String s=(String)ooo;
               System.out.println(ooo);
            }
            if(ooo instanceof Boolean)
            {
                //Boolean b=(Boolean)ooo;
                System.out.println(ooo);
            }
        }
    }
}