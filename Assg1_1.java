����   < V  Assg1_1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 	LAssg1_1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   8Enter the number to check if it is an ARMSTRONG or not: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I@      
 . 0 / java/lang/Math 1 2 pow (DD)D 4 java/lang/StringBuilder
 6 8 7 java/lang/String 9 : valueOf (I)Ljava/lang/String;
 3 <  & >  is a ARMSTRONG number..!
 3 @ A B append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 3 D E F toString ()Ljava/lang/String; H  is not a ARMSTRONG number..! args [Ljava/lang/String; Ljava/util/Scanner; inputNumber I rem temp sum D StackMapTable J 
SourceFile Assg1_1.java !               /     *� �    
                    	      -     }� Y� � L� � !+� '=96� 
p>� +� -c9
l=������  � � 3Y� 5� ;=� ?� C� !� � � 3Y� 5� ;G� ?� C� !�    
   >      	  
       !  &  3  8  <  E  _  b  |     >    } I J    r  K   e L M  &  N M   _ O M   b P Q  R    � !  S    )  T    U