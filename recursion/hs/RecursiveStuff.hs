module Main where

-- note that this is literally what he has on the board
-- haskell is so well suited for this type of problem
t(0) = 0
t(n) = t(n - 1) + n

main = print $ t 3
