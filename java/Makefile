## Makefile for UWYO COSC 4780/5010 HW2 - Java side
## Author: Finley McIlwaine

.PHONY : bnfc build parse compile

bnfc/calc/*.java: Calc.cf
	bnfc --java --makefile=bnfc.mk -p bnfc $^
	make -f bnfc.mk

*.class: *.java bnfc/calc/*.java
	javac $^

bnfc: bnfc/calc/*.java

build: *.class

parse: build bnfc
	@java bnfc.calc.Test

compile: bnfc build
	@java Main
