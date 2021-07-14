#Funkcje w JMeterze na wybranych przykładach


Test Plan 
    Thread Group 
        Config Elements
        Pre-processors 
        Timer 
        Logic Controller/Sampler
            Logic Controller 
            Sampler 
        Post-processors 
        Assertions 
        Listener 

Czym jest JSR223?

- JSR233 (from https://www.openhab.org/docs/configuration/jsr223.html):

     JSR223 (spec) is a standard scripting API for Java Virtual Machine (JVM) languages. The JVM languages provide varying levels of support for the JSR223 API and interoperability with the Java runtime.
     Currently the following languages are known to work well : Jython (Python on the JVM), Nashorn Javascript (ECMAScript implementation included in JDK8 through 10, deprecated in 11), and Apache Groovy (JVM scripting language).

     (From https://en.wikipedia.org/wiki/List_of_JVM_languages)

        This list of JVM Languages comprises notable computer programming languages that are used to produce computer software that runs on the Java virtual machine (JVM). Some of these languages are interpreted by a Java program, and some are compiled to Java bytecode and JIT-compiled during execution as regular Java programs to improve performance.

        : clojure, groovy, js nashorn and rhino, and others ...

- JMETER API:

    W elementach skryptowalnych JMetera, możemy używać obiektów kontekstowych:
    
        https://jmeter.apache.org/api/org/apache/jmeter/threads/JMeterVariables.html e.g. see vars.getIterations()
        https://jmeter.apache.org/api/org/apache/jmeter/threads/JMeterContext.html e.g. see ctx.getThreadNum() or ctx.getThreadGroup().getNumThreads()

 How to use in jmeter elements:

    vars:

    ${alternativeURL} - reference
    ${__V(${alternativeURL}})} - reference with name as evaluated expression

    props:

    ${__P(MY_PROP, DEFAULT_VALUE)}

 How to use in scripted elements:

     vars - ( JMeterVariables) - gives read/write access to variables:

         vars.get(key);
         vars.put(key,value);
         vars.putObject("OBJ1",new Object());
         vars.getObject("OBJ2");

     props - (JMeterProperties - class java.util.Properties):

        props.get("MY_PROP");
        props.put("MY_PROP","FOO");

Warning:
  When developing script in UI props once set are set and sometimes one needs to restart JMeter to clean them up.