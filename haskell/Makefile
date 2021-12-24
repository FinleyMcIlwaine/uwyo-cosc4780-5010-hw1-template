## Makefile for UWYO COSC 4780/5010 HW1 - Haskell side
## Author: Finley McIlwaine

.PHONY : bnfc parse compile

bnfc/*.hs: Calc.cf
	bnfc -m -o bnfc $^
	cd bnfc && make

bnfc: bnfc/*.hs

parse: bnfc
	@./bnfc/TestCalc

compile: bnfc
	@cabal run -v0 hw1
