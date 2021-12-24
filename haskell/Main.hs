module Main where

import ParCalc ( pExp, myLexer )
import System.Exit (die)

main :: IO ()
main = do
  c <- getContents
  case pExp (myLexer c) of
    Left _ -> die "parse error! try testing with the bnfc generated modules (`make parse`)"
    Right tree -> undefined
