package com.practics.singleton;

public class SingleTonExample {
     private static SingleTonExample singletonExample;
    private SingleTonExample(){

    }
        // Lazy way of creating a singleton object
    public  static SingleTonExample getSingleTonExample(){
        // object of this class
       if(singletonExample==null){
          synchronized (SingleTonExample.class){
              if (singletonExample==null){
                  singletonExample = new SingleTonExample();
              }
          }

       }
       return singletonExample;
    }
}


/*
*  1. constructor should be private
*  2. object create with the help of methods
* create field to store object is private
*  */