package com.experiment.experiment

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service
import java.beans.DesignMode

@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
@ComponentScan(basePackages = ["com.experiment"])
class ExperimentApplication{




}

fun main(args: Array<String>) {
	runApplication<ExperimentApplication>(*args)
	//noNeedClass()
	//val demo= Demo("prince",23)
	//demo.name="bingo"
	var name="any name"
	var score=90


	 fun Demo.getSirName(name: String){
		when(name){
			"prince"-> this.name= name+" saharan"
			"shubam"->this.name = name+ " kumar"
			else -> this.name=  name+ " hulululu"
		}

	}

	val obj1= Demo("prince",23)
	val obj2= Demo("any",43)

	println(obj2.getSirName("any"))
	println(obj2.name)
	println(obj1.name)
//	val obj = another(name,score)
//	println(obj.getSirName("shubham"))
//	println(obj.sayMyName(name))
//	println(obj.name)

}
class another(name:String,score:Int):Demo( name=name,  score=score){
	override fun toString(): String {
		return "another() ${super.toString()}"
	}
}
open class Demo(name: String, score: Int){

	 var name:String=name
		set(value) {
			field = if (!value.equals("bingo") ) value else "bingo not allowed"
		}
	protected var score:Int=0
		set(value){
			field=value
		}
		get() = field

	fun sayMyName(name:String):Unit = println("$name  is my name")
	override fun toString(): String {
		return "Demo(name='$name', score=$score)"
	}
}
fun noNeedClass()
{
	println("""
 Twinkle, Twinkle Little Bat
 How I wonder what you're at!
 """.trimIndent())

}



