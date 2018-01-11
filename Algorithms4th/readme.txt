Simply run
> java HelloWorld.java
throws an error in cmd saying that "Cannot find or load main class"

Correct run
First compile with javac
> javac HelloWorld.java
Then run
> java -classpath . HelloWorld
or
> java -cp . HelloWorld