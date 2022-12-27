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

	val demo= Demo()
	demo.printIt()
}
@Service
class Demo{
	var city:String="london"
	var address : Address =  Address(city,232)
	fun printIt(){
		print(address)
	}
}
