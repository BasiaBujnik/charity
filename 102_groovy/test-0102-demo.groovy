//Groovy jest supersetem Javy, można więc pisać w Javie w kompilatorze/intepreterze Groovy, Groovy lub mieszać kod JAVA+Groovy
//zmienne są dynamicznie typowane
def zmienna = 'like_groovy'
zmienna = 2
zmienna = 2.4d

// ; jest opcjonalny
zmienna = 1
zmienna = 1;

//groovy opakowuje wszystkie typy w klasy
int a=1
a.getClass() //class java.lang.Integer

//funkcje mogą być wykonywane na różny sposób
def fun(def z1,def z2){
    z1+z2
}
int zmienna1=1,zmienna2=2
fun(zmienna1,zmienna2)
fun zmienna1, zmienna2

//ostatnie wyrażenie w funkcji jest traktowane jako wartośc zwracana, nie trzeba używać słowa return
assert fun(2,3) == 5

//można pogramowac jak w JAVIE, mieszać kod lub pisać w natywnym Groovy
String zmienna3 = 'like_java';
System.out.println(zmienna3);
println(zmienna3)

//Podstawowe biblioteki JAVY są już zaimplementowane dla skrócenia "kodu boilerplate"
//stąd pochodzi System.out.println i dlatego możemy to skrócić do println
import java.lang.*
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal

// funkcje wyglądają standardowo, ostatnia wartość jest zwracama, chyba, że użyjemy void w definicji, return jest opcjonalny
def funkcja(def argument="mocny", def argument2="2"){
    println argument+argument2 //returns null
}
assert null==funkcja("mocny argument") //returns null
def funkcja2(){
    1 //returns 1, to samo co 'return 1'
}
assert 1==funkcja2() //returns 1
void funkcja3(){
    1 //returns null
}
assert null==funkcja3() //returns null

//listy
def lista =[1,2,3,4]
//iterowanie po listach
//z closurami
lista.each {
    it -> println "new:"+it
}

//starym sposobem
for(def el: lista){
    println "old:"+el
}

//dodanie elementu do listy
lista << 6
lista.add(5)
lista.clear()
lista = lista - 5;

//operatory sa aliasami do funkcji
assert lista.minus(8) == lista - 8

//G-String, podobnie jak w innych językach jak C# "" pozwala na ekstrapolacje
"lista ${lista}" //toString() wykonane automatycznie
"lista ${lista*2}" //duplikacja listy
"lista ${lista.size()+1+'costam'}" //w ${} może być dowolne wyrażenie

//closury, czyli bloki kodu
def c = { //działa jak funckja bezparametrowa
    print "c"
}
c()
assert c()==c.call()
def cc = { p1,p2->//działa jak funckja z parametrami
    print "${p1} == ${p2}"
}
cc(1,1)

//klasy i magia Groovy
//obiekty beda mialy automatycznie utowrzone gettery i settery (będą property) wg pewnych reguł
//https://learnxinyminutes.com/docs/groovy/
class B{
    def b ='c';
    def getB(){ //getter
        "badB"
    }
}
class A extends B{ //nie ma potrzeby definiować domyślnego konsktruktora
    def a = 'a'
    def aa = 'aa'
    def print(){
        print a
        print aa
        println ""
    }

}
new A().a //property calls its getter
assert new A().b == new A().getB()

// elvis operator
def jesli=false
println jesli ?: " jednak nie"

//save navigation
def obj = null;
assert obj?.metoda()==null;
assert obj.metoda()==null; //rzuca wyjatek

//ranges
(1..5).each {
    println "$it"
}

//type convert 'as'
assert (1 as String) == "1"
assert 1 == "1" //EXCEPTION
(1 as String).getClass()




