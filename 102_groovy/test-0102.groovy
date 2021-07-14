//Groovy jest supersetem Javy, mo¿na wiêc pisaæ w Javie w kompilatorze/intepreterze Groovy, Groovy lub mieszaæ kod JAVA+Groovy
//zmienne s¹ dynamicznie typowane
def zmienna = 'like_groovy'
zmienna = 2
zmienna = 2.4d
// ; jest opcjonalny
zmienna = 1
zmienna = 1;
//groovy opakowuje wszystkie typy w klasy
int a=1
a.getClass() //class java.lang.Integer
//funkcje mog¹ byæ wykonywane na ró¿ny sposób
def fun(def z1,def z2){
    z1+z2
}
int zmienna1=1,zmienna2=2
fun(zmienna1,zmienna2)
fun zmienna1, zmienna2
//ostatnie wyra¿enie w funkcji jest traktowane jako wartoœc zwracana, nie trzeba u¿ywaæ s³owa return
assert fun(2,3) == 5
//mo¿na pogramowac jak w JAVIE, mieszaæ kod lub pisaæ w natywnym Groovy
String zmienna3 = 'like_java';
System.out.println(zmienna3);
println(zmienna3)
//Podstawowe biblioteki JAVY s¹ ju¿ zaimplementowane dla skrócenia "kodu boilerplate"
import java.lang.* //st¹d pochodzi System.out.println i dlatego mo¿emy to skróciæ do println
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal

// funkcje wygl¹daj¹ standardowo, ostatnia wartoœæ jest zwracama, chyba, ¿e u¿yjmey void w definicji, return jest opcjonalny
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
//G-String, podobnie jak w innych jêzykach jak C# "" pozwala na ekstrapolacje
"lista ${lista}" //toString() wykonane automatycznie
"lista ${lista*2}" //duplikacja listy
"lista ${lista.size()+1+'costam'}" //w ${} mo¿e byæ dowolne wyra¿enie
//closury, czyli bloki kodu
def c = { //dzia³a jak funckja bezparametrowa
    print "c"
}
c()
assert c()==c.call()
def cc = { p1,p2->//dzia³a jak funckja z parametrami
    print "${p1} == ${p2}"
}
cc(1,1)
//klasy i magia Groovy
//obiekty beda mialy automatycznie utowrzone gettery i settery (bêd¹ property) wg pewnych regu³
//https://learnxinyminutes.com/docs/groovy/
class B{
    def b ='c';
    def getB(){ //getter
        "badB"
    }
}
class A extends B{ //nie ma potrzeby definiowaæ domyœlnego konsktruktora
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




