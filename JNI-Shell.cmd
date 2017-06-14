call javac JniApp.java
call javah -jni JniApp
call gcc -c Factorial.c
call gcc -shared -o Factorial.dll Factorial.o
call Javac JniApp.java
call java JniApp