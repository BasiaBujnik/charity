//Groovy jest supersetem Javy, mo�na wi�c pisa� w Javie w kompilatorze/intepreterze Groovy, Groovy lub miesza� kod JAVA+Groovy
//zmienne s� dynamicznie typowane
def zmienna = 'like_groovy'
zmienna = 2
zmienna = 2.4d
// ; jest opcjonalny
zmienna = 1
zmienna = 1;
//groovy opakowuje wszystkie typy w klasy
int a=1
a.getClass() //class java.lang.Integer
//funkcje mog� by� wykonywane na r�ny spos�b
def fun(def z1,def z2){
    z1+z2
}
int zmienna1=1,zmienna2=2
fun(zmienna1,zmienna2)
fun zmienna1, zmienna2
//ostatnie wyra�enie w funkcji jest traktowane jako warto�c zwracana, nie trzeba u�ywa� s�owa return
assert fun(2,3) == 5
//mo�na pogramowac jak w JAVIE, miesza� kod lub pisa� w natywnym Groovy
String zmienna3 = 'like_java';
System.out.println(zmienna3);
println(zmienna3)
//Podstawowe biblioteki JAVY s� ju� zaimplementowane dla skr�cenia "kodu boilerplate"
import java.lang.* //st�d pochodzi System.out.println i dlatego mo�emy to skr�ci� do println
import java.util.*
import java.io.*
import java.net.*
import groovy.lang.*
import groovy.util.*
import java.math.BigInteger
import java.math.BigDecimal

// funkcje wygl�daj� standardowo, ostatnia warto�� jest zwracama, chyba, �e u�yjmey void w definicji, return jest opcjonalny
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
//G-String, podobnie jak w innych j�zykach jak C# "" pozwala na ekstrapolacje
"lista ${lista}" //toString() wykonane automatycznie
"lista ${lista*2}" //duplikacja listy
"lista ${lista.size()+1+'costam'}" //w ${} mo�e by� dowolne wyra�enie
//closury, czyli bloki kodu
def c = { //dzia�a jak funckja bezparametrowa
    print "c"
}
c()
assert c()==c.call()
def cc = { p1,p2->//dzia�a jak funckja z parametrami
    print "${p1} == ${p2}"
}
cc(1,1)
//klasy i magia Groovy
//obiekty beda mialy automatycznie utowrzone gettery i settery (b�d� property) wg pewnych regu�
//https://learnxinyminutes.com/docs/groovy/
class B{
    def b ='c';
    def getB(){ //getter
        "badB"
    }
}
class A extends B{ //nie ma potrzeby definiowa� domy�lnego konsktruktora
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




